<<<<<<< HEAD

function getEmployeeDetails() {
    var eid = document.getElementById("eid").value;
    var req = new XMLHttpRequest();
    req.open("GET",
        "http://localhost:8080/WebApp-EMS/EmployeeController?eid="
        + eid, true);
    req.onreadystatechange = function() {

        if (req.readyState == 4 && req.status == 200) {
			var result = req.responseText;
			var arr = result.split(" ");
			document.getElementById("ename").value = arr[0];
			document.getElementById("esalary").value = arr[1];
			document.getElementById("dno").value = arr[2];
        }
    };
    req.send();

=======

function getEmployeeDetails() {
    var eid = document.getElementById("eid").value;
    var req = new XMLHttpRequest();
    req.open("GET",
        "http://localhost:8080/WebApp-EMS/EmployeeController?eid="
        + eid, true);
    req.onreadystatechange = function() {

        if (req.readyState == 4 && req.status == 200) {
			var result = req.responseText;
			var arr = result.split(" ");
			document.getElementById("ename").value = arr[0];
			document.getElementById("esalary").value = arr[1];
			document.getElementById("dno").value = arr[2];
        }
    };
    req.send();

>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
}