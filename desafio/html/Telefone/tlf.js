var a = 1;
var b = 2;
var c = 3;
var d = 4;
var e = 5;
var f = 6;
var g = 7;
var h = 8;
var i = 9;
var j = 0;
var telefone = "";

function na() {
    document.getElementById("telefone").value = telefone + a;
    telefone = document.getElementById("telefone").value;
}

function bn() {
        document.getElementById("telefone").value = telefone + 2;
        telefone = document.getElementById("telefone").value;
}

function cn() {
        document.getElementById("telefone").value = telefone + c;
        telefone = document.getElementById("telefone").value;
} 

function dn() {
        document.getElementById("telefone").value = telefone + d;
        telefone = document.getElementById("telefone").value;
}

function en() {
    document.getElementById("telefone").value = telefone + e;
    telefone = document.getElementById("telefone").value;
}

function fn() {
            document.getElementById("telefone").value = telefone + f;
            telefone = document.getElementById("telefone").value;
}

function gn() {
        document.getElementById("telefone").value = telefone + g;
        telefone = document.getElementById("telefone").value;
}

function hn() {
    document.getElementById("telefone").value = telefone + h;
    telefone = document.getElementById("telefone").value;
}

function ni() {
        document.getElementById("telefone").value = telefone + i;
        telefone = document.getElementById("telefone").value;
}

function jn() {
    document.getElementById("telefone").value = telefone + j;
    telefone = document.getElementById("telefone").value;
}

function ligar() {

    if(telefone < 8 ){
        alert("este numero nao é valido")}
     else(telefone > 8)
alert("Chamando " + telefone + "...")

}

function cancelar() {  
        document.getElementById("telefone").value = 0;
}