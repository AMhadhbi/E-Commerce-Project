<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">
</head>
<a href="<c:url value="/j_spring_security_logout" />"> Logout</a>
<div class="errors">${exception}</div>
<div id="formProd" class="cadre">
	<f:form modelAttribute="product" action="saveProd" method="post"
		enctype="multipart/form-data">
		<table class="tabStyle1">
			<tr>
				<td><f:input type="hidden" path="idProduct" /></td>
				<td><f:errors path="idProduct" cssClass="errors"></f:errors></td>
			</tr>
			<tr>
				<td>Name Product</td>
				<td><f:input path="nameProduct" /></td>
				<td><f:errors path="nameProduct" cssClass="errors"></f:errors></td>
			</tr>
			<tr>
				<td>Category :</td>
				<td><f:select path="category.idCategory"
						items="${categories}" itemValue="idCategory"
						itemLabel="nameCategory"></f:select></td>
				<td><f:errors path="nameProduct" cssClass="errors"></f:errors></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><f:textarea path="description" /></td>
				<td><f:errors path="description" cssClass="errors"></f:errors></td>
			</tr>

			<tr>
				<td>Amount</td>
				<td><f:input path="amount" /></td>
				<td><f:errors path="amount" cssClass="errors"></f:errors></td>
			</tr>
			<tr>
				<td>Numbers</td>
				<td><f:input path="nbproduct" /></td>
				<td><f:errors path="nbproduct" cssClass="errors"></f:errors></td>
			</tr>
			<tr>
				<td>Selected?</td>
				<td><f:checkbox path="selected" /></td>
				<td><f:errors path="selected" cssClass="errors"></f:errors></td>
			</tr>

			<tr>
				<td>Picture</td>
				<td><c:if test="${product.idProduct!=null}">
						<img src="pictureProd?idProd=${product.idProduct }" />
					</c:if></td>
				<td><input type="file" name="file" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</f:form>
</div>

<div id="tabProducts" class="cadre">
	<table class="tabStyle1">
		<tr>
			<th>ID</th>
			<th>Name Product</th>
			<th>Description</th>
			<th>Category</th>
			<th>Amount</th>
			<th>Number</th>
			<th>Selected</th>
			<th>Picture</th>
		</tr>
		<c:forEach items="${products}" var="p">
			<tr>
				<td>${p.idProduct }</td>
				<td>${p.nameProduct }</td>
				<td>${p.description }</td>
				<td>${p.category.nameCategory }</td>
				<td>${p.amount}</td>
				<td>${p.nbproduct }</td>
				<td>${p.selected }</td>
				<td><img src="pictureProd?idProd=${p.idProduct }" /></td>
				<td><a href="deleteProd?idProd=${p.idProduct }">Delete</a></td>
				<td><a href="editProd?idProd=${p.idProduct }">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</div>