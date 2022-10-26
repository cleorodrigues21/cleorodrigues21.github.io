<?php
$numero = 10;
$rst = $numero%2;
$soma = 0;
$x = -1;
$y = 1; 
$v = 0;
if ($rst !== 0) {
    for($a=2; $a<=$numero; $a++){
        $fibonacci = $x + $y; // a viariavel $fibonacci recebe o valor de $x=-1; e o valor de $y=1;
        $x = $y; // $x passa a receber o valor 1 que é o $y;
        $y = $fibonacci; // a variavel $y passa a receber $fibonacci;
    
        echo '<br>';    
         echo $y;   // Mostra o valor de $y;    
        
         $soma = $soma + $fibonacci; //$soma recebe ele mesmo mais $fibonacci;
    } 
    echo'<br>____<br>';
    echo $soma; // Mostra o valor da soma;
 
}
 else{ 
       while ($v < $numero) {   
        if ($v % 2 == 0) { 
            $primeiroPar =$v; 
             echo '<br>';
                echo $primeiroPar;
                    $soma = $soma +$v;
        }
            $v++;
         }
        echo '<br>____<br>';
         echo $soma;               
    }

?>