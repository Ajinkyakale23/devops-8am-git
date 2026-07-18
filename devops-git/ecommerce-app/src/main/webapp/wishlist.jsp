<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ include file="header.jsp"%>
<%@ include file="navbar.jsp"%>

<h2>My Wishlist</h2>

<table border="1" width="80%">

<tr>
    <th>Product</th>
    <th>Price</th>
    <th>Action</th>
</tr>

<tr>
    <td>Gaming Laptop</td>
    <td>₹75,000</td>
    <td>
        <a href="add-to-cart?id=1">
            Add to Cart
        </a>
    </td>
</tr>

</table>

<%@ include file="footer.jsp"%>