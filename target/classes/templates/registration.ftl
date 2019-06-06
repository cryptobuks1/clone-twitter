<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
<div class="regist_newuser mb-1">Add new user</div>
    ${message?ifExists}
    <@l.login "/registration" true />
</@c.page>