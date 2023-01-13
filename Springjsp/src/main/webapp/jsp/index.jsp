<html lang="en">
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="navbar.jsp"></jsp:include>
<body>
<div style="padding-left: 2rem; padding-top:4rem; ">
<div class="card" style="width: 18rem;">
    <div class="card-body">
        <h5 class = "card-title">ciao mondo</h5>
        <h7>${Info.name}</h7>
        <a href="${pageContext.request.contextPath}/details">Dettagli</a>
    </div>
</div>
</div>
</body>
<jsp:include page="script.jsp"></jsp:include>