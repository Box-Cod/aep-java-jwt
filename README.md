# atividade-java-jwt

## end-points



POST - http://localhost:8081/users
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
    "role": "ROLE_ADMIN" ou "ROLE_USER"
}

POST - whttp://localhost:8081/users/login
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
}

GET - http://localhost:8081/users/test
header: 
{
  "Authorization": "Bearer <Token JWT>"
}
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
}

Rota role_user
GET - http://localhost:8081/users/test/user
header: 
{
  "Authorization": "Bearer <Token JWT>"
}
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
}

Rota role_admin
http://localhost:8081/users/test/admin
header: 
{
  "Authorization": "Bearer <Token JWT>"
}
body:
{
    "email": "teste@email.com",
    "password": "123456789",
    "username": "TESTE",
}
