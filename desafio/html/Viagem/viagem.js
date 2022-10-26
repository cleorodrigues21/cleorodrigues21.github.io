var distancia = document.getElementById('distancia').value
function calcular() {
  var kminicial
  var kmfinal
  kminicial = document.getElementById('saida').value
  kmfinal = document.getElementById('chegada').value
  distancia = kmfinal - kminicial
  document.getElementById('distancia').value = distancia
  document.getElementById('saida').value
  document.getElementById('chegada').value
}
function consumo() {
  var data = document.getElementById('data').valueAsDate
  data = data.getDate() + '. ' + data.getMonth() + '. ' + data.getFullYear()
  var media
  var combustivel
  combustivel = document.getElementById('combustivel').value
  media = distancia / combustivel
  document.getElementById('media').value = media

  document.getElementById('relatorio').value =
    'Data da Viagem: ' +
    data +
    '; ' +
    'Distancia percorrida: ' +
    distancia +
    ' km; ' +
    'Media de gasto por litro: ' +
    media +
    ';'
}
