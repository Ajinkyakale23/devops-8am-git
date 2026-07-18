<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register - E-Commerce Store</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">

    <h2>Create Account</h2>

    <form action="register" method="post">

        <label>Full Name</label><br>
        <input type="text" name="name" required><br><br>

        <label>Email</label><br>
        <input type="email" name="email" required><br><br>

        <label>Phone Number</label><br>
        <input type="text" name="phone" required><br><br>

        <label>Password</label><br>
        <input type="password" name="password" required><br><br>

        <label>Confirm Password</label><br>
        <input type="password" name="confirmPassword" required><br><br>

        <button type="submit">Register</button>

    </form>

    <br>

    <p>
        Already have an account?
        <a href="login.jsp">Login Here</a>
    </p>

</div>

</body>
</html>