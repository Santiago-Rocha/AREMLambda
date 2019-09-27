# Laboratorio 2
Este proyecto ofrece cálculos estadísticos básicos como la media y la desviación estándar de un conjunto de números a través de un servicio web usando Spark. 

Puede probar el servicio desplegado en [heroku](https://arem2.herokuapp.com/)

## Prerrequisitos
Es necesario tener instalado Java 1.8 y Apache Maven 3.6.0
## Descripción
### Lista Encadenada 
El proyecto contiene una lista encadenada que contiene nodos y una cabeza. La cabeza da la lista tiene referencias al primer y último nodo.

![image](https://user-images.githubusercontent.com/13685178/63139762-0a9bc300-bfa5-11e9-8d54-96cef4462b79.png)

Cada nodo de la lista tiene el valor que le corresponde y una referencia al siguiente nodo, en caso de que la referencia sea nula este es el último elemento de la lista

![image](https://user-images.githubusercontent.com/13685178/63139832-5484a900-bfa5-11e9-92b6-af3128de431d.png)

### Operaciones
La media fue calculada utilizando la siguiente formula

![image](https://user-images.githubusercontent.com/13685178/63140069-29e72000-bfa6-11e9-8478-7d15f11e9547.png)

la desviación estándar fue calcualada utilizando la sigueinte formula

![image](https://user-images.githubusercontent.com/13685178/63140033-0f14ab80-bfa6-11e9-83cf-7c807f1acb7a.png)


## Diseño
### Diagrama de clases
![image](https://user-images.githubusercontent.com/13685178/63568394-b2cc0180-c53a-11e9-8d2d-b898b63a08d5.png)

### Diagrama de componentes
![image](https://user-images.githubusercontent.com/13685178/63568345-81533600-c53a-11e9-8c55-56432f92f13d.png)


## Ejecutar
### Descagar dependencias y compilar
```
mvn package
```
### Ejecutar test de unidad
```
mvn test
```
### Documentación
```
mvn javadoc:jar
```
La documentación generada por el comando anterior se encuentra en la ruta **target\apidocs**
### Ejecutar
```
java -cp target/classes:target/dependency/* edu.escuelaing.arem.designprimer.SparkWebApp
```
Al ejecutar este comando debe ir a la direccion 
http://localhost:4567/ para probar el proyecto funcionando
## Autor 
Santiago Rocha Durán - Escuela Colombiana de Ingenieria Julio Garavito
## Licencia
Este proyecto está licenciado bajo GNU General Public License - ver [LICENSE](https://github.com/Santiago-Rocha/AREM2/blob/master/LICENSE.txt) para más detalles 


