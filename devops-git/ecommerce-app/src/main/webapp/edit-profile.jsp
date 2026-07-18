<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ include file="header.jsp"%>
<%@ include file="navbar.jsp"%>

<h2>Edit Profile</h2>

<form action="update-profile" method="post">

Name<br>
<input type="text" name="name"><br><br>

Email<br>
<input type="email" name="email"><br><br>

Phone<br>
<input type="text" name="phone"><br><br>

<button type="submit">
Update Profile
</button>

</form>

<%@ include file="footer.jsp"%>