<html>
<head>
<%@include file="./base1.jsp"%>
</head>
<body>

    <div class="container mt-3">

    <h1> ADD Student </h1>

    <form action="insertStudent" method="post">
        <div class="row">
            <div class="col-md-auto">
                <div class="form-group">
                    <label for="name">Name :</label><input type="text" class="form-control" placeholder="Enter Name"
                        id="name" name="name">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-auto">
                <div class="form-group">
                    <label for="department">Department :</label><input type="text" class="form-control"
                        placeholder="Enter Department" id="department" name="department">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-auto">
                <div class="form-group">
                    <label for="technology">Technology :</label><input type="text" class="form-control"
                        placeholder="Enter Technology" id="technology" name="technology">
                </div>
            </div>
        </div>

        <a href="${pageContext.request.contextPath}" class="btn btn-warning">Back</a>
        <button type="submit" class="btn btn-primary">Submit</button>

    </form>
    </div>
</body>

</html>