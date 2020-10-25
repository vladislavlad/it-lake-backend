<#import "spring.ftl" as spring />

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <title>Main Lake</title>
</head>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>"/>

<body>

<div id="center-wrapper">
    <h1>IT Lake</h1>

    <div class="tech-list">
        <h2>Tech types:</h2>
        <ul>
            <#list tech as t>
                <li>${t.name} <a style="color: #${t.color}">▇</a></li>
            </#list>
        </ul>
    </div>
</div>

</body>
</html>

