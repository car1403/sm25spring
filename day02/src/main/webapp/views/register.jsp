<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- Login Page --%>
<div class="col-sm-9">
  <h2>Register Page</h2>
  <form action="/mainregisterimpl" method="post">
    <div class="form-group">
      <label for="id">Id:</label>
      <input type="text" class="form-control" placeholder="Enter id" id="id" name="id">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder="Enter password" id="pwd" name="pwd">
    </div>
    <div class="form-group">
      <label for="pwd">Name:</label>
      <input type="text" class="form-control" placeholder="Enter name" id="name" name="name">
    </div>
    <button type="submit" class="btn btn-primary">Register</button>
  </form>
</div>