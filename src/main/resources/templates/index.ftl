<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>

<#include "content/http.ftl">
    <style type="text/css">
        h1 {
            text-align: center;
        }

        .title {
            border: antiquewhite solid;
            background-clip: padding-box;
            height: 20%;
        }

        body {
            background-image: url("${basePath}/img/bg.png");
            background-repeat: repeat-y;
            background-repeat: repeat-x;
            background-position: top center;
            width: 100%;
            height: 100%;
            margin: 0px;
            padding: 0px;
        <#--background: url("${basePath}/img/bg.jpeg") repeat-y center;-->
        }

        .content {
            width: 100%;
            height: 80%;
            text-align: center;
        }
        .content button{

        }
    </style>
</head>
<body>
<div class="title">
    <h1>这是一个简单的页面</h1>
</div>
<div class="content">
<#list parentPageList as pages>
    <button type="button" value="${pages.summaryConfigCode}">${pages.summaryConfigName}</button>
</#list>
</div>

</body>
</html>