
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  align: center ;
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
</head>
<body>
<?php
include 'timezone.php';
$datetime = '';
$Emplid = '';
$today = '';
/* Attempt MySQL server connection. Assuming you are running MySQL
server with default setting (user 'root' with no password) */
$link = mysqli_connect("localhost", "root", "", "myDB");
 
// Check connection
if($link === false){
    die("ERROR: Could not connect. " . mysqli_connect_error());
}
 
// Escape user inputs for security
$Emplid = mysqli_real_escape_string($link, $_REQUEST['Emplid']);

// Attempt insert query execution
$sql = "Select * from Employeesearch  where Employeesearch.Emplid= '$Emplid'";
$result = $link->query($sql);
if ($result->num_rows > 0) {
    // output data of each row
echo "</br></br></br></br></br></br></br>";
echo "<h1 align=center> THE SEARCH RESULTS</h1> </br>";
echo "<table align=center>";
echo "<tr><th>Day</th><th>Time</th><th>Employeeid</th><th>Name</th><th>Mobile Number</th></tr>";
    while($row = $result->fetch_assoc())
{
echo "<tr><td>" . $row["day"]. "</td><td>" . $row["Intime"]. "</td><td> " . $row["Emplid"]. "</td><td> ". $row["name"]." </td><td>". $row["mob"]."</td></tr>";
}
echo"</table>";
} else{
echo "</br></br></br></br>";


    echo "<h1 align=center>Enter Valid Employee Id</h1>";
}
 
// Close connection
mysqli_close($link);
?>







