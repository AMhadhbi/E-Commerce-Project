<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">
</head>
<div id="formCat" class="cadre">
	<f:form modelAttribute="category" action="saveCat" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>${category.idCategory}<f:input type="hidden"
						path="idCategory" /></td>
				<td><f:errors path="idCategory"></f:errors></td>
			</tr>
			<tr>
				<td>Name Category</td>
				<td><f:input path="nameCategory" /></td>
				<td><f:errors path="nameCategory"></f:errors></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><f:textarea path="description" /></td>
				<td><f:errors path="description"></f:errors></td>
			</tr>
			<tr>
				<td>Photo</td>
				<c:if test="${Category.idCategory!=null}">
					<td><img src="pictureCat?idCat=${category.idCategory}"></td>
				</c:if>
				<td><input type="file" name="file"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</f:form>
</div>
<div id="tabCategories" class="cadre">
	<table class="tabStyle1">
		<tr>
			<th>ID</th>
			<th>Name CAT</th>
			<th>DESCRIPTION</th>
			<th>Picture</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${categories}" var="cat">
			<tr>
				<td>${cat.idCategory}</td>
				<td>${cat.nameCategory}</td>
				<td>${cat.description}</td>
				<td><img src="pictureCat?idCat=${cat.idCategory}"></td>
				<td><a href="deleteCat?idCat=${cat.idCategory}">Delete</a></td>
				<td><a href="editCat?idCat=${cat.idCategory}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
