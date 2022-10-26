function executar() {
  nome_rifa = document.getElementById('nomerifa').value
  var numero_in = document.getElementById('numeroinicial').value
  var numero_fi = document.getElementById('numerofinal').value
  var premio = document.getElementById('premio').value
  for (x = 1; x <= premio; x++) {
    var cx = prompt('Qual o ' + x + 'º Prêmio?')
  }

  for (num = numero_in; num <= numero_fi; num++) {
    document.write('<link rel="stylesheet" type="text/css" href="rifa.css" />')
    document.write('<div><h1> Rifa ' + nome_rifa + '</h1>')
    document.write('<h4>O º premio é: ' + cx + '</h4> <div>')
    document.write('<h4>Cartela de numero: ' + num + '</h4> <br>')
    document.write(
      'Nome:___________________________<br> Cidade:___________________________<br> Telefone:___________________________<br></div>'
    )
  }
}
