<%--
  Created by IntelliJ IDEA.
  User: PukanBombit
  Date: 03.10.2021
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Регистрация</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
  <header>
    <h1>РЕГИСТРАЦИЯ</h1>
  </header>
  <div class="registration">
    <div class="registration_form_name">
      <p>Логин</p>
      <p>Пароль</p>
      <p>Имя</p>
      <p>Фамилия</p>
    </div>
    <div class="registration_fields">
      <form action="index.html" method="post">
        <input type="email" pattern="^([A-Za-z0-9](\.?))+@(([a-z]{2,})(\.[a-z]{2,}){1,})" name="log_register" placeholder="Введите почту" required><br>
        <input type="password" name="pas_register" placeholder="Введите пароль" required><br>
        <input type="text" name="firstName_register" placeholder="Введите имя" required><br>
        <input type="text" name="lastName_register" placeholder="Введите фамилию" required><br>
        <input type="submit" >
      </form>
    </div>
  </div>
  </body>
</html>
