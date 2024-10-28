<%@page import="bmc.*" %>
<html>
	<head>
		<title>TEST...</title>
	</head>
	<body>
			<h1>Hello....</h1>
			<h2>
				<%-- This is comment --%>

				<%! 
					int a = 10;
					int b = 20;
					int c1 = a + b;



					Circle c = new Circle(5.0f);


				%>

				<%		
					out.println(c1);
					
				%>
				<%=c.getArea() %>

			</h2>
	</body>
</html>