<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <form action="/ExxamAdvanceJava/applyleave" method="post">
   
   Employee no : <input type="text" name="empno" id="empno">
   <br>
   Leave  Id : <input type="text" name="leaveId" id="leaveId">
   <br>
   Start Date : <input type="text" name="startDate" id="startDate" placeholder="yyyy-mm-dd">
   <br>
   End Date : <input type="text" name="endDate" id="endDate" placeholder="yyyy-mm-dd">
   <br>
   Leave Type :   <input type="text" name="leaveType" id="leaveType">
    <br>
   Leave Reason :  <input type="text" name="leaveReason" id="leaveReason">
    <br>
    <button type="submit" name="btn" id="btn">Apply Leave</button>
  
   </form>

</body>
</html>