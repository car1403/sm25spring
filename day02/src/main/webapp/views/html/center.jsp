<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
  .table_img{
    width:50px;
    height:70px;
    border: 1px solid aqua;
  }
</style>



<%-- Center Page --%>
<div class="col-sm-9">
  <h2>HTML Center Page</h2>
  <h5>Title description, Sep 2, 2017</h5>
  <table class="table table-striped">
    <thead>
    <tr>
      <th>Image</th>
      <th>Firstname</th>
      <th>Lastname</th>
      <th>Email</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td><img class="table_img" src="/img/face1.jpg" alt="John"/></td>
      <td>John</td>
      <td>Doe</td>
      <td>john@example.com</td>
    </tr>
    <tr>
      <td><img class="table_img" src="/img/face2.jpg" alt="Mary"/></td>
      <td>Mary</td>
      <td>Moe</td>
      <td>mary@example.com</td>
    </tr>
    <tr>
      <td><img class="table_img" src="/img/face3.jpg" alt="July"/></td>
      <td>July</td>
      <td>Dooley</td>
      <td>july@example.com</td>
    </tr>
    </tbody>
  </table>
</div>