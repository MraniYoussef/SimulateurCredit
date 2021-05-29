<%@page import="com.web.model.CreditModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    CreditModel mod = (CreditModel)request.getAttribute("mod");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simulateur crédite</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css" >
</head>
<body>
	<div>
		<form action="controleur" method="post">
		
		<table>
			<tr>
				<td>Montant :</td>
				<td> <input type="text" name="montant" value=<%=mod.getMontant() %>> </td>
				<td> DH </td>
			</tr>	
			<tr>
				<td>Durée :</td>
				<td> <input type="text" name="duree" value=<%=mod.getDuree() %>>> </td>
				<td> mois </td>
			</tr>
			<tr>
				<td>Taux :</td>
				<td> <input type="text" name="taux" value=<%=mod.getTaux() %>>> </td>
				<td> % </td>
			</tr>
			<tr>
				<td> <input type="submit" value="Calculer"> </td>
			</tr>
		</table>
	
	</div>	
		
		<div>
			<table>
				<tr>
					<td>Mensualité :</td>
					<td> <%=mod.getMensualite() %></td>
					<td> DH </td>
				</tr>
			</table>
		</div>
	
	</form>
</body>
</html>