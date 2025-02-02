# PATTERNS - FACTORY
## Juan David Martinez
## Santiago Gualdron
## La Herramienta Maven
### Cuál es su mayor utilidad
Por medio de Maven podemos crear y gestionar proyectos 
basados en Java, reduciendo los procesos de compilacion
y poder compartir de manera mas sencilla un proyecto
### Fases de maven
Validar: si el proyecto es correcto y tenga toda la
información necesaria

Compilar: compilar codigo fuente del proyecto

Prueba: Utilizar pruebas unitarias adecuadas, las pruebas no deben 
requerir que el codigo este empaquetado o implementado

paquete: tomar el codigo compilado y empaquetarlo

prueba de integración: procesar e implementar el paquete

Verificar: comprobar que el paquete sea válido y cumpla con
criterios de calidad

instalar: instalar el paquete en el repositorio local, para usarlo como dependencia

implementar: Lanzamiento del proyecto, copia del paquete
final y se comparte

clean: limpia lo creado por compilaciones anteriores

sitio: generar documentacion del sitio para el proyecto

### Ciclo de vida de la construcción
Maven tiene 3 ciclos de vida principales
1. clean: limpia los archivos generados en compilaciones anteriores

este tiene 3 fases: "mvn clean package"
* pre-clean: tareas antes de limpiar
* clean: borrar el directorio /target
* post-clean: tareas después de limpiar

2. default: maneja la compilación, empaquetado y despliegue 

Esta es la fase mas importante: "mvn package"
* validate: verifica que la configuración del proyecto sea correcta
* compile:Compila el código fuente de java
* test: Ejecuta pruebas unitarias
* package: Empaqueta el codigo compilado en un JAR o WAR
* verify: Verifica que el paquete cumple con los requisitos de calidad
* install: Instala el paquete en el repositorio local
* deploy: Sube el paquete a un repositorio remoto para compartirlo

3. site: Genera documentación del proyecto
Esta conformado por: "mvn site"
* pre-site: preparación antes de general el sitio
* site: Genera la documentación
* post-site: tareas posteriores
* site-deploy: publica la documentacion en un servidor

### Para que sirven los plugins
Son complementos que añaden funcionalidades o apoyan un programa
### Qué es y para qué sirve el repositorio central de Maven
El repositorio local de maven es una carpeta en nuestro
sistema donde se guardan las dependencias, artefactos compilados
y archivos necesarios para construir el proyecto
Este repositorio evita que se deban descargar las mismas dependencias 
una y otra vez y nos permite trabajar en el proyecto sin conexión a internet
## CREAR UN PROYECTO CON MAVEN
Para crear un proyecto en maiven primero nos pararemos en la
carpeta en la cual lo vamos a crear con cd "ruta"
Luego vamos a creaamos el proyecto con el siguiente comando
![](images/1.png)
Por lo que una carpeta "Patterns" sera creada, luego vamos a posicionarnos
sobre la carpeta.
Esta es la estructura de archivos en la carpeta, utilizando
"tree /f"
![](images/2.png)

## AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO
![](images/3.png)
## Compilar y ejecutar
Por medio del comando "mvn package", compilamos el xml
![](images/4.png)
package: al utilizar este comando pasamos a las fases de maven
compilacion,prueba y paquete creando la caperta target
### otros parametros para mvn
mvn clean: elimina la carpeta target, tambien se puede utilizar 
mvn clean install

mvn compile: compila las clases en target/classes

mvn test: Ejecuta las pruebas unitarias del directorio
src/test/java

mvn install: despues de compilar, ejecutar pruebas y empaquetar
el comando instala el archivo empaquetado en el repositorio local de Maven
(.m2/repository)

mvn deploy: parecido a "mvn install", pero este sube el archivo
a un repositorio local o remoto

mvn validate: valida estructura y configuraciones

mvn site: genera un sitio web estatico para el proyecto
(javaDoc)

### Ejecutar un proyecto maven 
Por medio del comando "mvn exec:java -Dexec.mainClass="ruta_main" -Dexec.args="argumento"

### Saludo personalizado
![](images/5.jpeg)
![](images/6.jpeg)

### Saludo con nombre y apellido
![](images/7.PNG)

## HACER EL ESQUELETO DE LA APLICACIÓN

Despues de realizar los pasos de creación
de clases, realizamos el ShapeFactory de la siguiente
manera implementando el patrón de fábrica
![](images/9.png)
![](images/10.png)
![](images/8.PNG)

### ¿Cuál fábrica hiciste? y ¿Cuál es mejor?

### ejecucion de shapeMain
* Sin parámetros
![](images/11.png)

* Parámetro: qwerty
![](images/14.png)

* Parámetro: Pentagon
![](images/12.png)

* Parámetro: Hexagon
![](images/13.png)




