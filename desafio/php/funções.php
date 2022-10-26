<?php

        function semRetornocomParamentro($parametro){

            for($p =1; $p < $parametro; $p++){
                echo $resultado= ($p + 2);  
            }  
        }

        function comRetornocomParametro(int $cdp){
        
            for($x =2; $x < $cdp; $x++){
                $s1 = $x +6;
                $s2 = $x +2;
                echo $s3= ($x + $s1) / $s2 . " - ";  
            }       
        }

     for($x=1; $x< 10; $x++){
    comRetornocomParametro($x);
    echo"<br><br>";
}
?>
