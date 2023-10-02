<%@ page import="roueinfortune.roueinfortune.Personne" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: farah
  Date: 02-10-23
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Personne p = (Personne) request.getAttribute("roulette"); %>
<% ArrayList<Personne> javanais = (ArrayList<Personne>) request.getAttribute("liste"); %>
<html>

<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="assets/style/global.css">
</head>
<body>
<div id="personne-data"
     data-prenom="<%=p.getPrenom()%>"></div>
<canvas id="fireworks"></canvas>
<div id="participants"><ul>
    <% for (Personne personne : javanais) {
    %> <li><%=personne.prenom%></li><%
    }%>
</ul></div>
<audio controls autoplay>
    <source src="assets/audio/FRWKComr_Feu%20d%20artifice%202%20(ID%202672)_LS.mp3" type="audio/mpeg" >
</audio>

<script type="text/javascript" src="assets/script/fireworks.js"></script>
</body>
</html>
