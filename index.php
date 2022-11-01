<!DOCTYPE html>
<html>
  <head>
    <title>Cléo Rodrigues</title>
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
        border: 2px solid Black;
      }
      .divfoto{
        background: url(fundodiv.jpg) no-repeat;
        width:710px;
        height: 250px;
        text-align: center;
        margin-left: auto;
        margin-right: auto;
        background-repeat:no-repeat;
        background-size:auto auto;
      }
      .divtexto{
        margin-left:auto;
        margin-right:auto;
        background-color: #C0C0C0;
        width:710px;
        height: 300px;
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

  <div style="margin-left:-10px;width:102%;height: 80px;background-color: #808080;" >
        <ul>
              <h3>Olá, Seja Bem Vindo a minha Pagina Pessoal!!</h3>
              <h4>Esta Pagina foi desenvolvida com PHP, HTML e JAVASCRIPT. Com o intuito de mostrar ideias e projetos desenvolvidos por mim.</h4>   
        </ul>
  </div>

  <div class="divfoto">
    <img src="./sobre/perfil.jpg"><br>
    
    <b>Cléo R. Rodrigues</b><br>

    <span>Técnico em informática <br>Ivoti, RS, Brasil</span>
  </div>

  <div class="divtexto">
        <div class="div div1">
            <p><i class="fa-brands fa-dev"></i><br>
                Programador Iniciante</p>
                <br>
                <br>
                <br>
                <br>
                <br>
        </div>
    
        <div class="div div1">
              <p><i class="fa-solid fa-code"></i><br>
                  Técnico Em informática</p>
                  Formado no Iffar-fw(2021), experiência com 
                  HTML, CSS, JAVASCRIPT, PHP, SQL, JAVA.
                <br>
                <br>
                <br>  
          </div>
    
        <div class="div div1">
                <p><i class="fa-solid fa-terminal"></i><br>Desenvolvimento</p>
                  Trabalho em uma gráfica na parte de Desenvolvimento, buscando soluções para problemas do dia a dia, utizando VBA e PYTHON.
                <br>
                <br>
          </div>
  </div>
  </body><?php require_once "footer/footer.php" ?>
</html>