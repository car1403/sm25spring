<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
  #product_table > tbody > tr > td > img{
    width: 50px;
  }
</style>
<%-- Center Page --%>
<div class="col-sm-9">
  <h2>Product Get Page</h2>
  <table id="product_table" class="table table-bordered">
    <thead>
    <tr>
      <th>Img</th>
      <th>Id</th>
      <th>Name</th>
      <th>Price</th>
      <th>Rate</th>
      <th>RegDate</th>
      <th>Category</th>
    </tr>
    </thead>
    <tbody>
      <tr>
        <td><img src="/img/r1.jpg"></td>
        <td>1000</td>
        <td>바지</td>
        <td>20000</td>
        <td>3.2</td>
        <td>2025년7월1일</td>
        <td>하의</td>
      </tr>
    </tbody>
  </table>

</div>