<?php
$types = array( 'png', 'jpg', 'jpeg', 'gif' ); 

if ( $handle = opendir('Galeria') ) { 
    while ( $entry = readdir( $handle ) ) { 
        $ext = strtolower( pathinfo( $entry, PATHINFO_EXTENSION) ); 
        if( in_array( $ext, $types ) ) 
            echo $entry; 
    }closedir($handle); 
}
?>