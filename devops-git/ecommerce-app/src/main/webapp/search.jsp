<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ include file="header.jsp"%>
<%@ include file="navbar.jsp"%>

<h2>Search Products</h2>

<form action="search" method="get">

<input type="text"
       name="keyword"
       placeholder="Search Product">

<button type="submit">

Search

</button>

</form>

<%@ include file="footer.jsp"%>