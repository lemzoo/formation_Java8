<?php
session_start();
$emailSaisi = $_COOKIE["email"];
$passwordHache = $_COOKIE["passwordHache"];

?>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
  <style type="text/css">
  	body{
  		background:rgba(221,221,221,0.5);
  	}
  </style>
</head>
<body>

<div class="container">
  <h2>formulaire de connexion</h2>
  <form role="form" method="post" action="connexion.php">
    <div class="form-group">
      <label for="emailSaisi">Votre adresse email :</label>
      <input type="email" class="form-control" name="emailSaisi" placeholder="Votre adresse email">
    </div>
    <div class="form-group">
      <label for="passwordSaisi">Votre mot de passe:</label>
      <input type="password" class="form-control" name="passwordSaisi" placeholder="Votre mot de passe">
    </div>
    <div class="checkbox">
      <label for="connexionAuto"><input type="checkbox" name="connexionAuto" value="off"> Connexion automatique</label>
    </div>
    <button type="submit" class="btn btn-lg btn-success">Se connecter</button>
  </form>
</div>

</body>
</html>
