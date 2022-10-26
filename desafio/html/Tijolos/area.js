function calcular() {
  muro = document.getElementById('muro').value
  Amuro = document.getElementById('Amuro').value
  tijolo = document.getElementById('Ttijolo').value
  Atijolo = document.getElementById('Atijolo').value

  areaM = muro * Amuro
  areaT = (tijolo * Atijolo) / 10000

  Ttijolos = parseInt(areaM / areaT)
  document.writeln(
    '<link rel="stylesheet" type="text/css" href="formatacao.css" /><div><h2><p>A área do muro é: ' +
      areaM +
      ' m</p>'
  )
  document.writeln('<p>A área do tijolo é: ' + areaT + ' m</p>')
  document.writeln(
    'Você vai precisar de: ' +
      Ttijolos +
      ' tijolos</h2><a href="tijolos.html"><input type="submit" value="Voltar"></a></div>'
  )
}
