<%@page import="bmc.*" %>

<%! 
	String r;
	Circle c;


%>

<% 
	r = request.getParameter("radius");

	try
	{
		float f = Float.parseFloat(r);
		c = new Circle(f);
		out.print("<h1>AREA : " + c.getArea() + "</h1>");	
	}
	catch(Exception e)
	{
		out.print("<h1>Exception...</h1>");
	}
	
%>