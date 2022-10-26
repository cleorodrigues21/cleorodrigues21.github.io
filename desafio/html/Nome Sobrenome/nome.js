function dados() {
  nome = document.getElementById('nome').value
  sobrenome = document.getElementById('sobrenome').value

  var d = document.querySelector('input#nascimento').valueAsDate
  var ano = d.getUTCFullYear()

  now = new Date()
  anoatual = now.getFullYear()
  if (nome == '' && sobrenome == '' && d == '') {
    document.write('Favor preencher todos os campos!!')
  } else {
    nome_completo = nome + ' ' + sobrenome
    idade = anoatual - ano
    document.writeln(
      '<link rel="stylesheet" type="text/css" href="formatacao.css" /><div><h2>seu nome completo é: <br><p2>' +
        nome_completo +
        '</p2>' +
        '<br>sua idade até fim do ano será de: <br><p1>' +
        idade +
        ' anos</p1></h2><br><a href="nome_sobrenome.html"><button>Voltar</button></a></div>'
    )
  }
}
