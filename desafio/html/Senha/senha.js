var dt = ''
function correto() {
  var nome = document.getElementById('nome').value
  var senha = (document.getElementById('dt').value = dt + senha)

  for (x = 97; x <= 122; x++) {
    var letra = String.fromCharCode(x)
    for (y = 0; y <= 9999; y++) {
      var numero = y.toString()

      if (numero.length == 1) {
        var numero2 = '000' + numero
      } else if (numero.length == 2) {
        var numero2 = '00' + numero
      } else if (numero.length == 3) {
        var numero2 = '0' + numero
      } else if (numero.length == 4) {
        var numero2 = numero
      }
      senha = letra + numero2
      if (testarSenha(nome, senha) == true)
        alert('parabéns, você acertou!! a senha é ' + senha)
    }
  }
}
