<!DOCTYPE html>
<html>
  <head>
    <title>Título da página</title>
    <meta charset="UTF8" />
    <link rel="stylesheet" type="text/css" href="fontawesome/css/all.css"/>
    <link rel="stylesheet" type="text/css" href="footer/footer.css"/>
    <link rel="stylesheet" type="text/css" href="header/header.css"/>
    <style>
      .div{
        display: inline-block;
      }
      .div1{
        background-color: transparent;
        width: 32%;
        height: 200px;
        text-align: center;
      }
      img{
        width: 130px;
        height: 130px;
        border-radius: 90px;
        border: 2px solid white;
      }
      .divfoto{
        background: url(fundodiv.jpg) no-repeat;
        width:500px;
        height: 250px;
        text-align: center;
        color: white;
      }
      b{
        font-family: cursive;
        font-size:35px;
      }
      span{
        font-family: cursive;
        font-size:20px;
      }
    </style>
  </head>
  
  <body><?php require_once "header/header.php" ?>

  <div style="margin-left:-10px;width:102%;height: 80px;background-color: #D3D3D3;margin-top:0;" >
    <ul>
      <h3>Olá, Seja Bem Vindo a minha Pagina Pessoal!!</h3>
      <h4>Esta Pagina foi desenvolvida basicamente com PHP, HTML e JAVASCRIPT, com o intuito de mostrar ideias e projetos desenvolvidos por mim.</h4>   
    </ul>
  </div>

  <div class="divfoto">
    <img src="./sobre/perfil.jpg"><br>
    
    <b>Cléo R. Rodrigues</b><br>

    <span>Técnico em informática <br>Ivoti, RS, Brasil</span>
  </div>

  <div class="div" style="margin-left:0px;margin-right:0;background-color: white;width:500px; height: 300px;">
    <hr style="border:none;">
      
    <div class="div div1">
        vermelho
    </div>
    
    <div class="div div1">
        azul
    </div>
    
    <div class="div div1">
        verde
    </div>
  </div>
    <br><br>
  </body><?php require_once "footer/footer.php" ?>
</html>