<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ include file="header.jsp"%>
<%@ include file="navbar.jsp"%>

<h2>Change Password</h2>

<form action="change-password" method="post">

Current Password<br>
<input type="password" name="oldPassword"><br><br>

New Password<br>
<input type="password" name="newPassword"><br><br>

Confirm Password<br>
<input type="password" name="confirmPassword"><br><br>

<button type="submit">
Change Password
</button>

</form>

<%@ include file="footer.jsp"%>