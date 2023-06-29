var selectedChords = [];

function toggleChord(button) {
    var chord = button.getAttribute("data-chord");

    if (selectedChords.includes(chord)) {
        var index = selectedChords.indexOf(chord);
        selectedChords.splice(index, 1);
        button.classList.remove("selected");
    } else {
        selectedChords.push(chord);
        button.classList.add("selected");
    }

    updateSelectedChords();
}

function updateSelectedChords() {
    var selectedChordsElement = document.getElementById("selected-chords");
    selectedChordsElement.innerText = selectedChords.join(", ");
}

function enviarLista() {
    var errorMessage = document.getElementById("error-message");

    if (selectedChords.length >= 4) {
        // Constrói a string de acordes separados por vírgula
        var listaAcordes = selectedChords.join(",");

        // Faz a chamada da API enviando a lista de acordes
        fetch('http://localhost:8080/acordes?notas=' + listaAcordes)
            .then(response => {
                if (!response.ok) {
                throw new Error('Erro na requisição');
                }
                return response.json();
            })
            .then(data => {
                // Processa a resposta da API
                var resultMessageElement = document.getElementById("result-message");
                resultMessageElement.innerText = data.tonality;
            })
            .catch(error => {
                // Lida com erros de requisição
                console.error('Ocorreu um erro:', error);
                var resultMessageElement = document.getElementById("result-message");
                resultMessageElement.innerText = "Erro na requisição";
            });

        // Limpa a lista de acordes e os botões selecionados
        selectedChords = [];
        var chordButtons = document.getElementsByClassName("chord-button");
        for (var i = 0; i < chordButtons.length; i++) {
          chordButtons[i].classList.remove("selected");
        }
        updateSelectedChords();

        errorMessage.innerText = "";
    } else {
        errorMessage.innerText = "Selecione pelo menos 4 acordes.";
    }
}