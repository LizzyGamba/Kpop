# Descripicón del proyecto 

El proyecto se basa en una tienda de gestión de 
la música más conocida del momento, del genero del KPOP en el cual nos encargamos de la gestión de la venta de los albumnes musica y photocards 

# Como usar cada EndPoint y pruebas 

Metodo - GET 

Este para obtener todos los productos y se usa de la siguiente forma 

url: http://localhost:8080/api/v1/kpop

<img width="1157" height="1348" alt="image" src="https://github.com/user-attachments/assets/892ccb4b-a66b-49c4-a63d-18212e0e2c5a" />


Metodo - GET por ID 

Este es para obtener un producto de la lista de albumnes de KPOP en especifico

Url: http://localhost:8080/api/v1/kpop/1
<img width="1159" height="1345" alt="image" src="https://github.com/user-attachments/assets/da8d4b04-97f5-4b18-9d15-81ee9243a427" />


Metodo - POST 

Este es para crear un nuevo registros y se necesita el siguiente Body para poder crearlo 

Url: http://localhost:8080/api/v1/kpop

Body: 

{
    "price": 250000,
    "name": "Wing",
    "artist": "BlapckPink",
    "stock": 5,
    "category": "Album de fotos"
}

<img width="1169" height="1355" alt="image" src="https://github.com/user-attachments/assets/74503db8-a5ad-41ac-b2a2-c3382b70b0ef" />


Metodo - PUT por Id 

Este es para actualizar los registros que ya se encuentran en la base 

Url: http://localhost:8080/api/v1/kpop/7

Body: 
{
    "price": 240000,
    "name": "the life beautiful",
    "artist": "Bp",
    "stock": 12,
    "category": "Album y fotos"
}


<img width="1110" height="1250" alt="image" src="https://github.com/user-attachments/assets/a42b0c15-8043-468b-b037-bd303c06cf92" />


Metodo - DELETE por Id 

Este es para eliminar de la base de datos un registros por Id 

Url: http://localhost:8080/api/v1/kpop/1

<img width="1110" height="1365" alt="image" src="https://github.com/user-attachments/assets/724e39e1-c94d-41ae-81a9-c7e058f50818" />


Base de datos general ejecutada en el localhost 

![Base de datos](image-5.png)
