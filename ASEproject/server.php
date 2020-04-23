<?php 
	session_start();

	// variable declaration
	$Empid = "";
	$name    = "";
	$mob = "";
	//$errors = array(); 
	$_SESSION['success'] = "";

	// connect to database
	$db = mysqli_connect('localhost', 'root', '', 'myDB');

	// REGISTER USER
	if (isset($_POST['reg_user'])) {
		// receive all input values from the form
		$Empid = mysqli_real_escape_string($db, $_POST['Empid']);
		$name = mysqli_real_escape_string($db, $_POST['name']);
		$mob = mysqli_real_escape_string($db, $_POST['mob']);
		

		// form validation: ensure that the form is correctly filled
		if (empty($Empid)) { array_push($errors, "Employee-ID is required"); }
		if (empty($name)) { array_push($errors, "Name is required"); }
		if (empty($mob)) { array_push($errors, "Mobile numberis required"); }

		
		//}

		// register user if there are no errors in the form
		
			
			$query = "INSERT INTO users (Empid, name, mob) 
					  VALUES('$Empid', '$name', '$mob')";
			mysqli_query($db, $query);

			$_SESSION['Empid'] = $Empid;
			$_SESSION['success'] = "Employee created";
			
		

	?>
	
