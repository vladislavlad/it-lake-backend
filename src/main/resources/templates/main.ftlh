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

    <div class="tech-type-list">
        <h2>Tech types:</h2>
        <ul>
            <#list types as t>
                <li>${t.name} <a style="color: #${t.color}">▇</a></li>
            </#list>
        </ul>
    </div>

    <br/>

    <div class="tech-list">
        <h2>Technologies:</h2>
        <table>
            <tbody>
            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Type</th>
                <th>Parent</th>
            </tr>
            <#list techs as t>
                <tr>
                    <td>${t.name}</td>
                    <td>${t.description}</td>
                    <td><a style="color: #${t.type.color}"> ${t.type.name} </a></td>
                    <td>
                        <#if t.parent??>
                            ${t.parent.name}
                        <#else>
                            -
                        </#if>
                    </td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>

