var desenho = document.getElementById('desenho')
var contexto = desenho.getContext('2d')

const TAM = 6
// var x = 0
//var y = 0
const VEL = 5

var incX = 2 //Incremento de X
var incY = 1 //Incremento de Y
setInterval(desenhar, VEL)

var bolinhas = new Array(5)
bolinhas[0] = new Array(0, 0, 2.1, 12.1, 'blue')
bolinhas[1] = new Array(0, 0, 3.1, 14.1, 'black')
bolinhas[2] = new Array(0, 0, 4.2, 16.0, 'green')
bolinhas[3] = new Array(0, 0, 8.1, 11.3, 'red')
bolinhas[4] = new Array(0, 0, 9.0, 14.2, 'yellow')

function limpar() {
  desenho.width = desenho.width
  desenho.height = desenho.height
}
function desenhar() {
  limpar()

  for (var b = 0; b < 5; b++) {
    contexto.beginPath()
    contexto.fillStyle = bolinhas[b][4]
    x = bolinhas[b][0]
    y = bolinhas[b][1]
    incX = bolinhas[b][2]
    incY = bolinhas[b][3]

    var x = x + incX
    var y = y + incY

    if (x > 500 || x < 0) {
      incX = incX * -1
    }
    if (y > 500 || y < 0) {
      incY = incY * -1
    }

    contexto.arc(x, y, TAM, 0, Math.PI * 2, true)
    contexto.fill()

    bolinhas[b][0] = x
    bolinhas[b][1] = y
    bolinhas[b][2] = incX
    bolinhas[b][3] = incY
  }
}
