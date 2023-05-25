<html>

<head>
    <%@include file="./base1.jsp" %>
</head>

<body>

    <div class="container mt-3">

        <a href="addStudent" class="btn btn-primary"> Add Student </a>
        <div class="row">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Name</th>
                        <th scope="col">Department</th>
                        <th scope="col">Technology</th>
                        <th scope="col">Edit</th>
                        <th scope="col">Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="stud" items="${student}">
                        <tr>
                            <td>${stud.id}</td>
                            <td>${stud.name}</td>
                            <td>${stud.department}</td>
                            <td>${stud.technology}</td>
                            <td><a href="editStudent/${stud.id}" class="btn btn-warning">Edit</a></td>
                            <td><a href="deleteStudent/${stud.id}" class="btn btn-danger">Delete</a></td>

                        </tr>
                    </c:forEach>
                </tbody>

            </table>
        </div>
    </div>
</body>

</html>