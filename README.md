# toneStar

# Motivação da API

Auxiliar músicos casuais ou avançados a consultar com facilidade o tom mais provável de um conjunto de no mínimo 4 acordes, contribuindo para o aprendizado da teoria musical.

# Como usar:

A Entrada pode ser de diversas formas, porém a API filtrará o acorde deixando somente

Importante ressaltar que, para os casos dos acordes menores, a API verificará pelo acorde maior equivalente
Exemplo:

Am = C
Bm = D
C#m = E
D#m = F
Em = G
F#m = A
G#m = B

A resposta da API ficará na variável "tom".

*Para notas sustenidas, use a notação "AH", ao  invés de "A#" como convecional.

