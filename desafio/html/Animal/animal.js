var machos = 0
var femeas = 0
var sexo = ''

while (sexo.toUpperCase() != 'X') {
  sexo = prompt('qual  o sexo do animal? ' + ' (Aperte X para parar o loop)')

  switch (sexo) {
    case 'macho':
    case 'macho':
      machos = machos + 1
      break
    case 'femea':
    case 'Femea':
      femeas = femeas + 1
      break
  }
}
var animais = machos + femeas
document.write(
  '<h1> resultado</h1>' +
    '	<link rel="stylesheet" type="text/css" href="animal.css" />'
)
document.write(
  '<b>foram carregados:</b><p>' +
    machos +
    ' machos </p> <p>' +
    femeas +
    ' femeas </p>' +
    '<b>total: </b><p>' +
    animais +
    ' animais </p>'
)
