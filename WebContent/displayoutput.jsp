<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css" />
<link rel="stylesheet" type="text/css"
	href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css" />
<script src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

</head>
<body>
<h2>The missing concepts are</h2>
	
    <script type="text/javascript">
       	 
    $(document).ready(function() {
        var table = $('#example').DataTable();
        table.clear();
        var id="<%=request.getAttribute("context")%>";
        var aliase='<%=request.getAttribute("concept")%>';
        var arrayid = new Array();
        arrayid = id.split(",");
        var arrayaliase = new Array();
        arrayaliase = aliase.split(",");
         
        for(var i=0; i< arrayid.length; i++)
    	{
        	table.row.add([ arrayid[i],arrayaliase[i]]);
        	
    	}
        table.draw();
        var flag ="<%=request.getAttribute("flag")%>";
       if(flag == "false")
       alert("Some IDs missing in avro")
		else
		alert(" All IDs Matching")
			});
				</script>
	<table id="example" class="display">
		<thead>
			<tr>
				<th>CONTEXT-ID</th>
				<th>CONCEPTS</th>
			</tr>
		</thead>
		<tbody id="TableBody"></tbody>
	</table>
	<script type="text/javascript">
     alert("The concepts may be missing in some id please check");
     </script>
</body>
</html>