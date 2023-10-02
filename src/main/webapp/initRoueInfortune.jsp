<%@ page import="java.util.ArrayList" %>
<%@ page import="roueinfortune.roueinfortune.Personne" %><%--
  Created by IntelliJ IDEA.
  User: farah
  Date: 02-10-23
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArrayList<Personne> javanais = (ArrayList<Personne>) request.getAttribute("liste"); %>
        <html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <% for (Personne personne : javanais) {
            %> <li><%=personne.prenom%></li><%
        }%>
    </ul>
<button type="button"><a href="roueInfortune.jsp">Lancer la roue</a> </button>
</body>
</html>
