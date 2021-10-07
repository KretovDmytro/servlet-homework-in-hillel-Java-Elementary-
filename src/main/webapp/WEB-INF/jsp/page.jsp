<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<html>
    <head>
        <title>Home task page</title>
    </head>

<body>
    <ol>
          <c:forEach items = "${paramValues}" var = "par">
             <ul> ${par.key} : ${fn:join(par.value, ', ')} </ul>
          </c:forEach>
    </ol>
    <p>
        <form method="POST">
            <input type="text" name="Text in form"> <br/>
            <input type="submit">
        </form>
    <p>
    <p>Statistic:
    <br>
        <p> Counter for do Get: ${countDoGet}
        <p> Counter for do Post: ${countDoPost}
</body>

</html>