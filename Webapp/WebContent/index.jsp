<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%!
    
    public void jspInit(){
    	System.out.println("Ths is a init phase");
    }
    
    public void jspDestroy(){
    	System.out.println("Ths is jspDestroy phase");
    }
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!
private void m1(){
	System.out.println("This is a m1()");
}
%>

<%
Date date= new Date();
m();
%>
<%!
public int i=10;
public void m(){
	//PrintWriter out = resp.getWrite();
	System.out.println(i);
}
%>
<body>

Object obj = new Object();
<h1 style="color:green ;"> Date and Time is <%=date %></h1>
<h2><%=i %></h2>
</body>
</html>
<%!
protected void m2(){
	System.out.println("Ths is a m2()");
}
%>
<%
m2();
m1();
%>