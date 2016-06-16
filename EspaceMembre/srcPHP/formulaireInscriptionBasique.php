<!DOCTYPE html>
<html lang="en">
<head>
  <title>Formulaire Inscription</title>
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
  <h2>Formulaire inscription basique</h2>
  <form role="form" method="POST" action="../srcPHP/ajouterMembre.php">
    <div class="form-group">
      <label for="pseudoSaisi">Pseudo :</label>
      <input type="text" class="form-control" name="pseudoSaisi" placeholder="Saisissez un nouveau pseudo" required="required" autofocus="autofocus">
    </div>
    
    <div class="form-group">
      <label for="passwordSaisi1">Mot de passe :</label>
      <input type="password" class="form-control" name="passwordSaisi1" placeholder="Saisissez un nouveau mot de passe" required="required" autofocus="autofocus">
    </div>
    
    <div class="form-group">
      <label for="passwordSaisi2">Retapez votre mot de passe :</label>
      <input type="password" class="form-control" name="passwordSaisi2" placeholder="Confirmez votre mot de passe" required="required" autofocus="autofocus">
    </div>
    
    <div class="form-group">
      <label for="emailSaisi">Adresse email :</label>
      <input type="email" class="form-control" name="emailSaisi" placeholder="Saisissez un adresse mail" required="required" autofocus="autofocus">
    </div>
    
    <button type="submit" class="btn btn-lg btn-primary">Continuer</button>
  </form>
</div>

</body>
</html>