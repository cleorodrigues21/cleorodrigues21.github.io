var preco
var quantidade
var subtotal = 0
var desconto
var dsc
var total
var dinheiro
var troco
function preco() {
  preco = document.getElementById('preco').value
  quantidade = document.getElementById('quantidade').value
  subtotal = subtotal + parseFloat(preco * quantidade)
  document.getElementById('subtotal').value = subtotal.toFixed(2)
}
function desconto() {
  desconto = document.getElementById('desconto').value
  dsc = (subtotal * desconto) / 100
  total = subtotal - dsc
  document.getElementById('dsc').value = dsc.toFixed(2)
  document.getElementById('total').value = total.toFixed(2)
}
function troco() {
  dinheiro = document.getElementById('dinheiro').value
  if (total > dinheiro) {
    document.getElementById('troco').value = 'Está Faltando dinheiro'
  } else {
    troco = dinheiro - total
    document.getElementById('troco').value = troco.toFixed(2)
  }
}
