# book-seller-spring-boot

## API

### Authentication
#### Sign-Up
```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "userName": "TaroYamada",
    "password": "password",
    "email": "taro.yamada@example.com",
    "firstName": "太郎",
    "lastName": "山田"
}
```
#### Sign-In
```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "userName": "TaroYamada",
    "password": "password"
}
```

### User
#### Get by UserName
#### Delete

### Book
#### Save

#### Get All
```
GET /api/book HTTP/1.1
Host: localhost:8080
```
#### Delete

### Purchase
#### Save
