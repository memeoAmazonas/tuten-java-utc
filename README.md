#Get utc format

Autor Jose Ortiz

fecha 24/05/2020

## Requerimentos

```bash
apache maven
java version 1.8
```

  ```

##Despliegue

```posicionarse en la raiz del proyecto y abrir una consola, 
ejecutar los comando 
--mvn clean
--mvn install
```
Estos comandos generaran los recursos necesarios para el despliegue de la aplicacion

```
Ejecutar los comandos
mvn spring-boot:run
```
con este comando se inicia la aplicacion.

Es un servicio  **POST**, se encuentra alojado en la ruta(http://localhost:8081/get)

Sus parametros son: {
                    "hour": " ",
                    "timezone": " "
                    }, son recibidos en el body de la peticion.
                    ejemplo: 
                     { "hour": "18:31:45", "timezone": "-3" }, y el resultado es: 
                     {  
                     	"response":{
                     		"time":"21:31:45", 
                     		 "timezone":"utc" 
                     	} 
                      } 

NOTA: el parametro "timezone" puede ser un numero o una zona horaria, ejemplo: America/Caracas
                    

##puesta en produccion
```
generar el jar con el comando
mvn package
el jar se guardara en la carpeta target por defecto con el nombre test-timezone-0.0.1-SNAPSHOT.jar (Dicho nombre se puede cambiar)

Levantar el jar creado
java -jar <nombre del jar>
para levantar el jar nos posicionamos en la carpeta donde se encuentre el mismo y ejecutamos el comando
```

##Datos Generales de la aplicacion.
Se siguio el patron de Diseño MVC.
la estructura de carpetas:
```
    -Controller
        llamada de metodos
    -Services
            implementacion metodos, capa de negocios
    -dto
        contiene los objetos de comunicacion con las vistas de la aplicacion
