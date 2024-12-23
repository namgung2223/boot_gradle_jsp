<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="layout/common.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인</title>
    <%@include file="layout/script.jsp"%>
    <script>
        var pageData = '${page}';
        console.log(pageData);
    </script>
</head>
<body>
<!-- 페이지 내용 출력 -->
<div>
    <c:forEach items="${page.content}" var="item">
        ${item}<br>
    </c:forEach>
</div>

<!-- 페이지 네비게이션 -->
<div class="pagination">
    <!-- 이전 버튼 -->
    <c:choose>
        <c:when test="${page.hasPrevious()}">
            <a href="?page=${page.number - 1}">이전</a>
        </c:when>
        <c:otherwise>
            <span>이전</span>
        </c:otherwise>
    </c:choose>

    <!-- 페이지 번호 -->
    <c:forEach var="i" begin="0" end="${page.totalPages - 1}">
        <c:choose>
            <c:when test="${i == page.number}">
                <span><strong>${i + 1}</strong></span>
            </c:when>
            <c:otherwise>
                <a href="?page=${i}">${i + 1}</a>
            </c:otherwise>
        </c:choose>
    </c:forEach>

    <!-- 다음 버튼 -->
    <c:choose>
        <c:when test="${page.hasNext()}">
            <a href="?page=${page.number + 1}">다음</a>
        </c:when>
        <c:otherwise>
            <span>다음</span>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>
