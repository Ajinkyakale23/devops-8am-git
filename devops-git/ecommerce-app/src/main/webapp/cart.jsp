<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html>
<head>
    <title>Shopping Cart</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>Shopping Cart</h2>

<table border="1" width="80%">
    <tr>
        <th>Product</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Total</th>
    </tr>

    <tr>
        <td>Laptop</td>
        <td>₹55,000</td>
        <td>1</td>
        <td>₹55,000</td>
    </tr>

    <tr>
        <td>Mouse</td>
        <td>₹700</td>
        <td>2</td>
        <td>₹1,400</td>
    </tr>

</table>

<br>

<h3>Grand Total : ₹56,400</h3>

<a href="checkout.jsp">
    <button>Proceed to Checkout</button>
</a>

</body>
</html>