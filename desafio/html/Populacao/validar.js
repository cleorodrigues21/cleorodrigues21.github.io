function validar() {
  popA = 5000000
  popB = 7000000

  var txA = document.getElementById('taxa1').value
  var txB = document.getElementById('taxa2').value

  var anos = 0

  while (popA < popB) {
    popA = popA + popA * txA
    popB = popB + popB * txB

    anos = anos + 1
  }
  alert('o pais A ultrapassou o pais B em ' + anos + ' anos')
}
