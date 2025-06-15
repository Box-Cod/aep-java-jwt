# atividade-java-jwt

### End-points

## POST - http://localhost:8081/users

<pre>
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
    "role": "ROLE_ADMIN" ou "ROLE_USER"
}
</pre>

## POST - http://localhost:8081/users/login
<pre>
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
}
</pre>

## GET - http://localhost:8081/users/test
<pre>
header: 
{
  "Authorization": "Bearer TokenJWT"
}
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
}
</pre>

Rota role_user
## GET - http://localhost:8081/users/test/user
<pre>
header: 
{
  "Authorization": "Bearer <\Token JWT>\"
}
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
}
</pre>
  
Rota role_admin
## GET - http://localhost:8081/users/test/admin
<pre>
header: 
{
  "Authorization": "Bearer (Token JWT)"
}
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
}
</pre>
