<%--
  Created by IntelliJ IDEA.
  User: kai
  Date: 2019-11-11
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table cellspacing="0" cellpadding="5" border="1">
        <tr>
            <th>id</th><th>name</th><th>class</th><th>address</th>
        </tr>
        <c:forEach items="${info.list}" var="teacher">
            <tr>
                <td>${teacher.id}</td>
                <td>${teacher.teachername}</td>
                <td>${teacher.className}</td>
                <td>${teacher.address}</td>
            </tr>
        </c:forEach>

        <tr>
            <td colspan="4">
                <a href="getAll">首页</a> <a href="getAll?pn=${info.prePage}">上一页</a>
<%--                ${info.pageNum}--%>
                <c:forEach items="${info.navigatepageNums}" var="pageNum">
                    <c:if test="${pageNum == info.pageNum}">
                        【${pageNum}】
                    </c:if>
                    <c:if test="${pageNum != info.pageNum}">
                        <a href="getAll?pn=${pageNum}">${pageNum}</a>
                    </c:if>
                </c:forEach>
                <a href="getAll?pn=${info.nextPage}">下一页</a><a href="getAll?pn=${info.pages}">末页</a>
            </td>
        </tr>

    </table>
</body>
</html>
