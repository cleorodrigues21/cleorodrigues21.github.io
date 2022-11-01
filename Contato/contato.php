<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <title>Contatos</title>
  <!-- Arquivo com o estilo da pagina  -->
    <link rel="stylesheet" type="text/css" href="contato.css" />
  <!-- Pasta que contém todos os  Icons  -->
    <link rel="stylesheet" type="text/css" href="../fontawesome/css/all.css" />
  <!-- cabeçalho -->
    <link rel="stylesheet" type="text/css" href="../header/header.css"/>
  <!-- rodapé --> 
    <link rel="stylesheet" type="text/css" href="../footer/footer.css"/>
  <!-- Materialize --> 
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script> 
  </head>

<body> 
  <div class="row" style="width:400px; height:650px; background-color: 	#1C1C1C;">
      <a href="../index.php">Voltar</a>
      <br>
      <b><h1>Redes Sociais</h1></b>
      <hr>
        <i class="fa-brands fa-instagram"> <a href="https://www.instagram.com/cleorodrigues21/"> Instagram - Cleorodrigues21</a></i>
        <hr>
          <i class="fa-brands fa-facebook"> <a href="https://www.facebook.com/cleo.r.rodrigues.16"> facebook - Cleo Rodrigues</a></i>
          <hr>
        <i class="fa-brands fa-linkedin"> <a href="https://www.linkedin.com/in/cleo-r-rodrigues-944a5822b"> Linkedin - Cleo Rodrigues</a></i>
        <hr>
        <i class="fa-brands fa-github"> <a href="https://github.com/cleorodrigues21"> GitHub - clerodrigues21</a></i>
        <hr>
        <i class="fa-brands fa-whatsapp"> <a href="https://wa.me/5596298339"> (55) 9 9629-8339</a> </i>
        <hr>
   </div>

  <div class="row z">
        <a href="#"> <b>Cleorodrigues073@gmail.com</b></a>
        
                <form action="envia.php" name="envia" id="envia" method="post" class="col s12">

              <div class="input-field col s6">
                <input id="nome" type="text" class="validate blue-text" />
                <label for="nome">Nome</label>
              </div>

              <div class="input-field col s6">
                  <input id="email" type="email" class="validate blue-text" />
                  <label for="email">youemail@domain.com</label>
              </div>

              <div class="input-field col s6">
                  <input id="assunto" type="text" class="validate blue-text" />
                  <label for="assunto">Assunto</label>
              </div> 
              
              <div class="input-field col s6">
                  <input id="mensagem" type="text" name="mensagem" cols="30" rows="10" class="validate blue-text"/>
                  <label for="mensagem">Aqui vai sua mensagem</label>
              </div>
                  
              <button type="submit" name="enviar" id="enviar" value=""  class="btn waves-effect waves-light blue"><i class="fa-solid fa-pencil"></i></button>
                </form>
    </div > <br>
</body>
<footer style="width:100%;height:50px;background:#4682B4;bottom:0;left:0;font-size:11px;font-family: italic;color:white;">
        <hr style="color: transparent;border:none;">    
      <i class="fa-solid fa-graduation-cap"></i> Cléo R. Rodrigues - Técnico em Informática

      <div style="float: right;width: auto; color:white;">
          <a href="https://www.instagram.com/cleorodrigues21/"><i class="fa-brands fa-instagram"></i></a>
          <a href="https://www.facebook.com/cleo.r.rodrigues.16"><i class="fa-brands fa-facebook"></i></a>
          <a href="https://wa.me/5596298339"><i class="fa-brands fa-whatsapp"></i></a> 
          <a href="https://www.linkedin.com/in/cleo-r-rodrigues-944a5822b"><i class="fa-brands fa-linkedin"></i></a>
          <a href="https://github.com/cleorodrigues21"><i class="fa-brands fa-github"></i></a>
      </div>
          <hr style="border:none;">
      <div class="z" style="text-align: right;font-size: 10px;width: auto;height: 10px;">
          Ivoti - Rio Grande do Sul -    
          <script src="data.js"></script>
          <script src="../data.js"></script>
      </div>
</footer>
</html>

