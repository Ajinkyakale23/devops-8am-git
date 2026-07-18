<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login - E-Commerce Store</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">

    <h2>Login</h2>

    <form action="login" method="post">

        <label>Email</label><br>
        <input type="email" name="email" required><br><br>

        <label>Password</label><br>
        <input type="password" name="password" required><br><br>

        <button type="submit">Login</button>

    </form>

    <br>

    <p>
        Don't have an account?
        <a href="register.jsp">Register Here</a>
    </p>

</div>

</body>
</html>