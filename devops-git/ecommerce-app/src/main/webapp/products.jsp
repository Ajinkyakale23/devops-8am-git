<%@ page import="java.util.*,com.ecommerce.model.Product" %>

<html>

<head>

<title>Products</title>

</head>

<body>

<h2>Product List</h2>

<%

List<Product> products =
(List<Product>)request.getAttribute("products");

for(Product p : products){

%>

<h3><%=p.getName()%></h3>

<p>₹ <%=p.getPrice()%></p>

<hr>

<%

}

%>

</body>

</html>