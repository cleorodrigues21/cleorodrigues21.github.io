numeros = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0']
letras = [
  'q',
  'w',
  'e',
  'r',
  't',
  'y',
  'u',
  'i',
  'o',
  'p',
  'a',
  's',
  'd',
  'f',
  'g',
  'h',
  'j',
  'k',
  'l',
  'ç',
  'z',
  'x',
  'c',
  'v',
  'b',
  'n',
  'm'
]
var teclado = ''

for (num = 0; num <= 9; num++) {
  document.write(
    '<td><button onclick="nu(' + num + ')">' + numeros[num] + '</button></td> '
  )
}
for (n = 0; n <= 26; n++) {
  document.write(
    '<td> <button onclick="an(' +
      n +
      ')">' +
      letras[n] +
      '</button> </td></table>'
  )
}
document.write('<button onclick="limpar()">[x]</button>')

for (x = 0; x <= 26; x++) {
  function an(x) {
    document.getElementById('teclado').value = teclado + letras[x]
    teclado = document.getElementById('teclado').value
  }
}
for (x = 0; x <= 10; x++) {
  function nu(x) {
    document.getElementById('teclado').value = teclado + numeros[x]
    teclado = document.getElementById('teclado').value
  }
}
function limpar() {
  document.getElementById('teclado').value = ''
  teclado = ''
  document.getElementById('teclado').value = ''
}
