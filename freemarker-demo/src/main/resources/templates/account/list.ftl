<html>
<head>
    <title>freemarker Test</title>
</head>
<body>
<h1>Hello</h1>
<ul>
    <#list  resultList  as  item>
        <li>${item.id},${item.name},${item.money}</li>
    </#list>
</ul>
</body>
</html>