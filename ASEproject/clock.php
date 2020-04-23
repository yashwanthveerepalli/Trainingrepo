
<!DOCTYPE html>
<html>
<style>
div {
  background-image: url('wsu.jpg');
}
</style>
<style>
img { 
  width: 30%;
  height: auto;
  opacity: 1.0;
}
</style>

<style>
body {
  background-image: url('clock.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: cover;
}
</style>
<style>
h1{
color: black;
}
.aligncenter{
Text-align:left;
}
</style>
<body>
<?php
include 'timezone.php';
$datetime = '';
$Empid1 = '';
$today = '';
/* Attempt MySQL server connection. Assuming you are running MySQL
server with default setting (user 'root' with no password) */
$link = mysqli_connect("localhost", "root", "", "myDB");
 
// Check connection
if($link === false){
    die("ERROR: Could not connect. " . mysqli_connect_error());
}
 
// Escape user inputs for security
$Empid1 = mysqli_real_escape_string($link, $_REQUEST['Empid1']);
$datetime = date("h:i:s");
$today = date("Y-m-d");
// Attempt insert query execution
$sql = "INSERT INTO Clock (day,Intime,Empid1) VALUES ('$today','$datetime', '$Empid1')";
if(mysqli_query($link, $sql)){
$sql1 = "Insert into Employeesearch(day,Intime,Emplid,name,mob)
Select Clock.day,Clock.Intime,Clock.Empid1,MyGuests.name,MyGuests.mob
from Clock,MyGuests
WHERE Clock.Intime='$datetime' AND Clock.Empid1=MyGuests.Empid";
if(mysqli_query($link, $sql1)){
echo"</br></br></br></br></br></br></br>";
 
echo "<h1 align=right>CLOCK IN SUCCESSFULL</h1></br>";
  echo "<h1 align=right>Have a good day</h1>";
} }else{
echo"</br></br></br></br></br></br></br></br></br>";

    echo "<h1 align=right>USE VALID EMPLOYEE ID TO CLOCK IN </h1>";
}
// Close connection
mysqli_close($link);
?>