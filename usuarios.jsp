<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>

    </head>
    <body>
        <ul>
            <c:forEach var="usuarios" items="${listaUsuarios}">
                <li>${usuarios.nombre}</li>
            </c:forEach>
        </ul>
    </body>
</html>