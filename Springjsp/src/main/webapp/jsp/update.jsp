<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<jsp:include page="head.jsp"></jsp:include>
<body>
<jsp:include page="navbar.jsp"></jsp:include>

<div class="container">
    <form action="${pageContext.request.contextPath}/updateDaLista" method="post">
        <div class="mb-3">
            <label for="id" class="form-label">Name</label>
            <input type="number" name="id" class="form-control" id="id" aria-describedby="emailHelp" placeholder="${idDaModificare}">
        </div>
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" name="name" class="form-control" id="name" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="description" class="form-label">Descrizione</label>
            <input type="text" name="description" class="form-control" id="description">
        </div>
        <button type="submit" class="btn btn-primary">Modifica</button>
    </form>
</div>
<br>
<footer class="footer mt-auto py-3 bg-light">
    <div class="container">
        <span class="text-muted">Prova</span>
    </div>
</footer>
</body>
<jsp:include page="script.jsp"></jsp:include>