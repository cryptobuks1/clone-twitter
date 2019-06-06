<#import "parts/common.ftl" as c>

<@c.page>
<div class="login_style">
<h5 class="zagolovok_useredit">User editor</h5>


<form action="/user" method="post">
    <input type="text" name="username" value="${user.username}" />
    <#list roles as role>
    <div>
        <label><input type="checkbox" name="${role}" ${user.roles?seq_contains(role)?string("checked", "")} />${role}</label>
    </div>
    </#list>
    <input type="hidden" value="${user.id}" name="userId" />
    <input type="hidden" value="${_csrf.token}" name="_csrf" />
    <button class="button_cvoi button_profile btn btn-primary" type="submit">Save</button>
</form>
</div>
</@c.page>