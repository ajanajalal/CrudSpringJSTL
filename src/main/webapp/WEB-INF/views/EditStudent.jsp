<html>

<head>
    <meta charset='utf-8'>
    <%@include file="./base1.jsp" %>
</head>

<body>
    <div class="container mt-3">
        <h1>Edit Student</h1>
        <form action="updateStudent" method="post">
            <div class="row">
                <div class="col">
                    <div class="form-group">
                        <label for="id">Id:</label>
                        <input type="text" class="form-control" id="id" name="id" value="${student.id}" readonly="readonly"/>
                    </div>
                </div>
                <div class="col">
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" placeholder="Enter Name" class="form-control"value="${student.name}" id="name" name="name" />
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <div class="form-group">
                        <label for="department">Department:</label>
                        <input type="text" placeholder="Enter Department" class="form-control" value="${student.department}" id="department" name="department" />
                    </div>
                </div>
                <div class="col">
                    <div class="form-group">
                        <label for="technology">Technology:</label>
                        <input type="text" placeholder="Enter Technology" class="form-control" value="${student.technology}" id="technology" name="technology" />
                    </div>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>

</html>