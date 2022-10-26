<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <title>Galeria</title>
    <meta charset="utf-8" />
    <link rel="stylesheet" type="text/css" href="galeria.css" />
  </head>
  </head>
  <body>
	<h1>fotos</h1>
  <?php
$types = array( 'png', 'jpg', 'jpeg', 'gif' ); 

if ( $handle = opendir('C:\xampp\htdocs\Galeria') ) { 
    while ( $entry = readdir( $handle ) ) { 
        $ext = strtolower( pathinfo( $entry, PATHINFO_EXTENSION) ); 
        if( in_array( $ext, $types ) ) 
            echo "<script>document.writeln('<img src=".$entry." > ')</script>" ; 
    }closedir($handle); 
}
?>
  </body>
</html>
