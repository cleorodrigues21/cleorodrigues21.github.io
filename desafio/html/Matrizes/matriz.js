var linhas = prompt('Número de linhas')
var colunas = prompt('Número de colunas')
alert('criar uma matriz de ' + linhas + ' linhas por ' + colunas + ' colunas')

var matriz2 = []
for (var i = 0; i < linhas; i++) {
  matriz2[i] = []
  for (var j = 0; j < colunas; j++) {
    matriz2[i][j] = ''
  }
}

for (var l = 0; l < linhas; l++) {
  for (var c = 0; c < colunas; c++) {
    matriz2[l][c] = prompt('digite um valor para a matriz')
  }
}
var valores = ''
for (var L = 0; L < linhas; L++) {
  for (var C = 0; C < colunas; C++) {
    if (C < colunas - 1) {
      valores = matriz2[L][C]
    } else {
      valores = matriz2[L][C]
    }
  }
  document.write(
    'conteúdo da matriz: <br>' +
      matriz2[((matriz2 = [0]), (matriz2 = [1]), (matriz2 = [2]))]
  )
}
