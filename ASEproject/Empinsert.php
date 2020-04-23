<!DOCTYPE html>
<html>
<head>
<title>Employee Display</title>
<style>
table, th, td {
  border: 1px solid black;
  align: center ;
}
img { 
  width: 30%;
  height: auto;
  opacity: 1.0;
}
</style>
<style>
h1{
color: black;
}
.aligncenter{
text-align:center;
}
</style>
<style>
body {
  background-image: url('Unknown.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: cover;
}
</style>
<body>
<p class="aligncenter"/>
</br></br></br></br></br></br></br>
<img src="wsu.jpg" alt="HTML5 Icon" style="width:15%;height:10%;">
<?php
/* Attempt MySQL server connection. Assuming you are running MySQL
server with default setting (user 'root' with no password) */
$link = mysqli_connect("localhost", "root", "", "myDB");
 
// Check connection
if($link === false){
    die("ERROR: Could not connect. " . mysqli_connect_error());
}
 
$Empid = mysqli_real_escape_string($link, $_REQUEST['Empid']);
$name = mysqli_real_escape_string($link, $_REQUEST['name1']);
$mob = mysqli_real_escape_string($link, $_REQUEST['mob']);
 
// Attempt insert query execution
$sql = "INSERT INTO MyGuests (Empid,name,mob) VALUES ('$Empid', '$name', '$mob')";
if(mysqli_query($link, $sql)){
$sql1 = "Select * from MyGuests" ;
$result = $link->query($sql1);

if ($result->num_rows > 0) {
echo "</br></br></br></br></br></br></br>";
echo "<h1 align=center> UPDATED EMPLOYEE LIST </h1> </br>";
echo "<table align=center>";
echo "<tr><th>Employeeid</th><th>Name</th><th>Mobile Number</th></tr>";

    while($row = $result->fetch_assoc())
{
echo "<tr><td> " . $row["Empid"]. "</td><td> ". $row["name"]." </td><td>". $row["mob"]."</td></tr>";
}
echo"</table>";
   
} 
}else{
echo "</br></br></br></br></br></br></br></br></br>";
    echo "<h1 align=center>Cannot create Employee Check the details and reinsert the data </h1>";
}
 
// Close connection
mysqli_close($link);
?>