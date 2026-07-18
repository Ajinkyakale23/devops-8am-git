<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html>
<head>
    <title>Checkout</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>Checkout</h2>

<form action="checkout" method="post">

    Full Name<br>
    <input type="text" name="name" required><br><br>

    Address<br>
    <textarea name="address" rows="4" cols="40"></textarea><br><br>

    Mobile Number<br>
    <input type="text" name="mobile"><br><br>

    Payment Method<br>

    <input type="radio" name="payment" value="COD" checked> Cash on Delivery

    <br><br>

    <button type="submit">Place Order</button>

</form>

</body>
</html>