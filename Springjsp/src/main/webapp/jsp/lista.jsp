<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="navbar.jsp"></jsp:include>
<body>
<<!--<div style="padding-left: 2rem; padding-top:4rem; ">
    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class = "card-title">ciao mondo</h5>

        </div>
    </div>
</div>-->
<c:forEach var="lista" items="${Lista}">
    <div>
        <p> <c:out value="${lista.getName()}"/></p>
        <p> <c:out value="${lista.getDescription()}"/></p>
    </div>
</c:forEach>
</body>
<jsp:include page="script.jsp"></jsp:include>