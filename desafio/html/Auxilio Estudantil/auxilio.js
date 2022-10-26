const salarminimo = 1212

function verificar() {
  var nome = document.getElementById('nome').value
  var rendaBruta = document.getElementById('renda').value
  var pessoas = document.getElementById('pessoas').value
  var rendaPerCapita = rendaBruta / pessoas
  var agv = 0
  var smen = salarminimo + salarminimo / 2

  if (rendaPerCapita >= smen) {
    alert('Voce não tem direito ao auxilio')
  } else {
    if (document.getElementById('moradia').checked == true) {
      agv++
    }
    if (document.getElementById('provedor').checked == true) {
      agv++
    }
    if (document.getElementById('beneficio').checked == true) {
      agv++
    }
    if (document.getElementById('deficiencia').checked == true) {
      agv++
    }
    if (document.getElementById('doenca').checked == true) {
      agv++
    }
    if (document.getElementById('cota').checked == true) {
      agv++
    }
    switch (agv) {
      case 0:
        agv = 1
        break
      case 1:
        agv = 0.8
        break
      case 2:
        agv = 0.6
        break
      case 3:
        agv = 0.5
        break
      case 4:
        agv = 0.4
        break
      case 5:
        agv = 0.3
        break
      case 6:
        agv = 0.2
        break
    }
    var indice = (agv * rendaBruta) / (salarminimo * pessoas)
    document.write(
      'Caro aluno(a) <b>' +
        nome +
        ':</b><br> voce tem direito ao beneficio;<br> e seu indice é de: ' +
        indice +
        '<br><a href="auxilio.html"><button style="background-color: rgb(119, 149, 67);border-color: rgb(119, 149, 67);color: white;border-radius: 5px;text-transform:uppercase;font-weight: bold;">Voltar</button></a>'
    )
  }
}
