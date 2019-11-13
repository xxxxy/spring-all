<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>id</th>
            <th>作者</th>
            <th>书籍名称</th>
            <th>ISBN</th>
        </tr>
        <#list books as book>
        <tr>
            <td>${book.id}</td>
            <td>${book.bookName}</td>
            <td>${book.author}</td>
            <td>${book.isbn}</td>
        </tr>
        </#list>
    </table>
</body>
</html>