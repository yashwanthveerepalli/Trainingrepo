<?php
//create variables
$Empid = $name = $mob = " ";
// Create connection
$conn = new mysqli('localhost', 'root', '','myDB');
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 
$sql = "INSERT INTO MyGuests (Empid,name, mob)
VALUES (1234, 'Roshni', 98489)";
if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>