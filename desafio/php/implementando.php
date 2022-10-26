<?php
/*ola professor não sei se era mais o menos isso para fazer. jogue valores no exemplo1 e exemplo2*/
/*Indice de idade para pegar COVID-19 exemplo1*/
$pessoal = "";
if($pessoal<50){/*pessoal com menos de 50 anos não tem tanto risco*/
	$pessoal="Você não tem tanto risco de pegar COVID-19, mas se cuide.";
}elseif($pessoal> 55 && $pessoal<120){/*pessoas com mais de 55 e menos de 120 tem auto risco*/
	$pessoal="Fique em casa veio desgraçado!!";
}else{/*se ta vivo não morre mais*/
	$pessoal="É imortal por acaso?"; 
}
echo"$pessoal <br><br>";

/*Tipo de Refrigerante exemplo2*/

$refrigerante ="";
switch($refrigerante){
		case '1':   
			echo "Você escolheu Fanta Laranja! <br><br>";  
		break; 
		case '2':   
			echo "Você escolheu Guarana! <br><br>";
		break;  
		case '3':   
			echo "Você escolheu Pepsi! <br><br>";
		break;   
		default:   echo "Não temos esse refrigerante!! <br><br>";
		break;
} 
/*Contando até 10*/
echo "contando até 10 <br> <br>";
	for($cont=0;$cont<=10;$cont++){   /*repita os valores de 0 a 10*/     
		echo "Número: $cont <br>";
	}

?>

