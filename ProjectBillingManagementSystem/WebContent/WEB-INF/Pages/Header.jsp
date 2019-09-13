<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
  <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jsgrid/1.5.3/jsgrid.min.css" />
	<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jsgrid/1.5.3/jsgrid-theme.min.css" /> 
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jsgrid/1.5.3/jsgrid.min.js"></script>
	
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header" >
      <a class="navbar-brand" href="#">
      	<img src="images/logo.gif" style="width:250px;height:70px"/>
      </a>
    </div>
    
    
    <c:if test="${userObj ne null && userObj.applicationRole eq 'Admin'}">
    <ul class="nav navbar-nav">
      <li class="active"><a href="#" id="getProjectConfiguration">Project Configuration</a></li>
      <li><a href="#">Developer Allocation</a></li>
     <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Billing
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Developer Billing</a></li>
          <li><a href="#">Project Billing</a></li>
          
        </ul>
      </li>
      
    </ul>
    </c:if>
  </div>
  
  <!-- <div id="jsgrid"></div> -->
  
</nav>

<script>
		var myData;
	
		$("a#getProjectConfiguration").click(function(){
			$.ajax({url: "fetchProjectConfiguration", success: function(result){
		    myData=result;
		   
		    $(function() {			
				$("#jsgrid").jsGrid({
		  			 width: "100%",
		   			height: "400px",
				inserting: true,
		   			editing: true,
		   			sorting: true,
		   			paging: true,
		   			data: myData, 
		   			fields: [
		       				{ name: "id", type: "number", width: 150, validate: "required" },
		       				{ name: "name", type: "text", width: 50 },
		       				{ name: "gender", type: "text", width: 200 },
					{ name: "email", type: "text", type: "text", width: 200 }
		       				
		   			]
				});
				 
				});
		    
		  }});
			 $("#div1").hide();
		});
		
		
		
		
		
</script>