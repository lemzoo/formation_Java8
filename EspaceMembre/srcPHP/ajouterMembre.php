<?php 

// Connexion � la base de donn�es
try{
	$bdd = new PDO('mysql:host=localhost;dbname=ESPACE_MEMBRE;charset=utf8', 'root', 'root');
}
catch(Exception $e){
	die('Erreur : '.$e->getMessage());
}


// V�rification de la validit� des informations
if(isset($_POST["pseudoSaisi"]) && isset($_POST["passwordSaisi1"]) && 
		isset($_POST["passwordSaisi2"]) && isset($_POST["emailSaisi"])){
	$pseudo = $_POST["pseudoSaisi"];
	$passwordFirst = $_POST["passwordSaisi1"];
	$passwordSecond = $_POST["passwordSaisi2"];
	$email = $_POST["emailSaisi"];
	
	$isPasswordSame = ($passwordFirst == $passwordSecond)?true:false;
}
else{
	header("Location : formulaireInscriptionBasique.html");
}

if($isPasswordSame){
	// Hachage du mot de passe
	$passwordHache = sha1($passwordFirst);
	
	// Insertion
	$req = $bdd->prepare("INSERT INTO membres(pseudoMembre, passwordMembre, emailMembre, dateInscriptionMembre) VALUES(:pseudo, :pass, :email, CURDATE())");
	$req->execute(array(
			"pseudo" => $pseudo,
			"pass" => $passwordHache,
			"email" => $email)
	);
	header("location : formulaireInscriptionBasique.php");
}
else{
	header("Location : ../srcHTML/formulaireInscriptionBasique.html");
}
