# DotNet

<table class="table" border="2" style=>
  <tr >
     <th>Employee id</th>
     <th>leave Id</th>
     <th>Start date</th>
     <th>End date</th>
     <th>leave Type</th>
     <th>leave Reason</th>
     
  </tr>
  <c:forEach var="p" items="${plist}">
     <tr>
          <td>${p.empNo}</td>
       <td>${p.leaveId}</td>
       <td>${p.applyDate}</td>
       <td>${p.endDate}</td>
       <td>${p.leaveType}</td>
        <td>${p.leavereason}</td>
    
     </tr>
  </c:forEach>
</table>
<a href="/ExxamAdvanceJava/">back to home</a>
</body>
