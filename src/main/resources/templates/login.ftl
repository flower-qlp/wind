<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
<#include "content/http.ftl">
</head>
<body>
<div class="content">
    用户名:<input id="user-name" type="text" value="" name="user-name" placeholder="用户用">
    密码 :<input id="pass-ward" type="text" value="" name="user-name" placeholder="密码">
    <input type="button" value="提交" id="submit">
</div>

<script src="${basePath}/js/jquery-3.3.1.min.js"></script>

<script type="text/javascript">
    $(document).ready(function () {
        alert("Hello!");
        $("#submit").click(function () {
            login();
        })
    });

    function login(userName, passWord) {
        var data = {
            "userName": userName,
            "passWord": passWord
        }
        $.ajax({
            url: baseUrl + "/user/login",
            type: "post",
            dataType: "json",
            contentType: "application/json;charset=utf8",
            data: JSON.stringify(data),
            success: function (result) {
                console.log(result.data)
            }
        })
    }
</script>
</body>
</html>