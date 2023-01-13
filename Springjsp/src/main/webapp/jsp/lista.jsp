<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="navbar.jsp"></jsp:include>
<body>
<!--<div style="padding-left: 2rem; padding-top:4rem; ">
    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class = "card-title">ciao mondo</h5>

        </div>
    </div>
</div>-->

    <div>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Description</th>
                <th scope="col">Delete</th>
                <th scope="col">Update</th>
            </tr>
            </thead>
            <tbody>
    <c:forEach var="lista" items="${Lista}">
            <tr>
                <td><c:out value="${lista.getId()}"/></td>
                <td><c:out value="${lista.getName()}"/></td>
                <td><c:out value="${lista.getDescription()}"/></td>
                <td><a href="${pageContext.request.contextPath}/deleteDaLista?id=${lista.getId()}">Cancella</a></td>
                <td><a href="${pageContext.request.contextPath}/deleteDaLista?id=${lista.getId()}">Cancella</a></td>
            </tr></c:forEach>
            </tbody>
        </table>
    </div>

</body>
<jsp:include page="script.jsp"></jsp:include>