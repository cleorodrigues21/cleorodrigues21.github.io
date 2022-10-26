nome = [
  'alisson',
  'arthur',
  'augusto',
  'brenda',
  'cleo',
  'conrado',
  'daniela',
  'diogo',
  'ellen',
  'emilly',
  'gabriel',
  'gabriele',
  'gabrieli',
  'iasmin',
  'isaias',
  'izabella',
  'joao',
  'julio',
  'lucas_ariel',
  'lucas_israel',
  'marco',
  'matheus',
  'milena',
  'nei',
  'pedro',
  'rayssa',
  'tauani',
  'vinicius_ceratti',
  'vinicius_rubin',
  'vitoria',
  'wagner',
  'bruno'
]

document.addEventListener('DOMContentLoaded', function (n) {
  document.write(
    '<div><h1>Turma 2019 - 2021 IFFAR/CAMPUS FREDERICO WESTPHALEN</h1>'
  )
  for (n = 0; n < 31; n++) {
    document.writeln(
      "<img src ='http://inf.fw.iffarroupilha.edu.br/~bruno/disciplinas/programacao1/desafios/fotos/2019/" +
        nome[n] +
        ".png'>"
    )

    document.writeln(
      '<link rel="stylesheet" type="text/css" href="turma.css" /><p>' +
        nome[n] +
        '</p><br></div>'
    )
  }
})
