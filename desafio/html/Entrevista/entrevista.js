document.write(
  '<link rel="stylesheet" type="text/css" href="entrevista.css" />'
)
alert('vamos comecar primeira pessoa 1')
var sim = 0
var nao = 0
var animal = confirm('Você tem animais em casa?')
if (animal == true) {
  sim++
} else {
  nao++
}
alert('segunda pessoa')
var carro = confirm('Tem carro?')
if (carro == true) {
  sim++
} else {
  nao++
}
alert('terceira pessoa')
var estuda = confirm('Você estuda?')
if (estuda == true) {
  sim++
} else {
  nao++
}
alert('quarta pessoa')
var filho = confirm('Tem filhos?')
if (filho == true) {
  sim++
} else {
  nao++
}
alert('quinta pessoa')

var casado = confirm('È casado(a)?')
if (casado == true) {
  sim++
} else {
  nao++
}
alert('sexta pessoa')

var vicio = confirm('Tem algum vicío?')
if (vicio == true) {
  sim++
} else {
  nao++
}
alert('setima pessoa')

var casa = confirm('Tem casa própria?')
if (casa == true) {
  sim++
} else {
  nao++
}
alert('oitava pessoa')

var trabalha = confirm('Você trabalha?')

if (trabalha == true) {
  sim++
} else {
  nao++
}
alert('nona pessoa')
var informatica = confirm('Conhece o Curso Tecnico Informatica?')

if (informatica == true) {
  sim++
} else {
  nao++
}
alert('dessima pessoa')
var tecnologia = confirm('Você ja mecheu com tecnologia?')
if (tecnologia == true) {
  sim++
} else {
  nao++
}

if (sim > nao) {
  document.write(
    '<p>O total das respostas dessas 10 pessoas foi de: </p><b>' +
      sim +
      ' "sim" e ' +
      nao +
      ' "não"</b>'
  )
} else if (nao > sim) {
  document.write(
    '<p>O total das respostas dessas 10 pessoas foi de: </p><b>' +
      nao +
      '" não" e ' +
      sim +
      ' "sim"</b>'
  )
} else {
  document.write('teve a mesma quantidade de "sim" e "nao"')
}
