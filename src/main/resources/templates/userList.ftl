<#import "parts/common.ftl" as c>

<@c.page>
<div class="user_list">
<h2>List of users</h2>

<table class="table_user_list">
    <thead>
    <tr class="text_user_list">
        <th>Name</th>
        <th>Role</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
    <tr>
        <td>${user.username}</td>
        <td><#list user.roles as role> ${role}<#sep>, </#list></td>
        <td><a class="button_cvoi_user_list" href="/user/${user.id}">Edit</a></td>
        <td><a class="button_cvoi_user_list" href="/user/${user.id}">Delete</a></td>
    </tr>
    </#list>
    </tbody>
</table>
</div>
</@c.page>