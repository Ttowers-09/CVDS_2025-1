**UNIVERSIDAD ESCUELA COLOMBIANA DE INGENIERÍA JULIO GARAVITO**

**INTEGRANTES**

**Nombres:** Camilo Andres Quintero Rodriguez e Ivan Santiago F. Torres

**Asignacion:** Laboratorio 2 (Patterns)

**Asignatura:** Ciclos de Vida del desarrollo (CVDS)

**Docente:** Oscar David Ospina Rodriguez.

**RESPUESTAS:**



**PRE-RREQUISITOS**

0. Verificamos que los dispositivos cuente con maven instalado para poder trabajar.
    ![alt text](resources/image-1.png)

**EJERCICIO DE LAS FIGURAS**

1. Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).

    ![alt text](resources/image.png)

2. Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:

    ![alt text](resources/image-2.png)
    ![alt text](resources/image-3.png)
    ![alt text](resources/image-4.png)

3. Se debió haber creado en el directorio, un nuevo proyecto Patterns a partir de un modelo o arquetipo, que crea un conjunto de directorios con un conjunto de archivos básicos.

    ![alt text](resources/image-5.png)

4. Cambie al directorio Patterns y para ver el conjunto de archivos y directorios creados por el comando mvn, ejecute el comando tree.

    ![alt text](resources/image-6.png)

**AJUSTAR ALGUUNAS CONFIGURACIONES EN EL PROYECTO**

5. Edite el archivo pom.xml y realize la siguiente actualización:
- hay que cambiar la versión del compilador de java a la versión 8, para ello, agregue la sección properties antes de la selección de dependencias:

    ![alt text](resources/image-8.png)

- Código modificado:

    ![alt text](resources/image-9.png)

**COMPILAR Y EJECUTAR**

6. Para compilar ejecute el siguiente comando:
    > $ mvn package

    ![alt text](resources/image-10.png)

- Verificaremos que se hallan realizado los cambios:

    ![alt text](resources/image-11.png)

7. Busque cuál es el objetivo del parámetro "packahe" y que otros parámetros se podrían enviar al comando mvn.

- El parámetro **"package"** se usa para compilar el código fuente, ejecutar pruebas y empaquetar el proyecto en un archivo distribuible, como en un archivo .jar o .war en el directorio target.
- Otros parámetros que se podrían enviar al comando mvn son:
    - **mvn clean install:** Elimina la carpeta de destino, compila el proyecto, ejecuta pruebas, lo empaquetará y lo agregará al repositorio local.
    -**mvn test:** Válida el proyecto, cómpila el código fuente y ejecuta las pruebas unitarias.
    -**mvn package:** Compila el proyecto y empaqueta el código compilado junto con todos los recursos en un archivo JAR.
    -**mvn archetype:create:** Crea un proyecto desde cero.
    -**mvn compile:** Compila un proyecto.
    -**mvn install:** Instala un proyecto en el repositorio local.
    -**mvn site:site** Genera un sitio para el proyecto.

8. Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro "mainClass"
- Agregamos el Plugin:

    ![alt text](resources/image-12.png)

- Ejecutamos el código, se verá de la siguiente manera:

    ![alt text](resources/image-13.png)

9. Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada en la aplicación:

    ![alt text](resources/image-14.png)

- Se verá de la siguiente manera:

    ![alt text](resources/image-15.png) 

10. Utilizar la primera posición del parámetro que llega al método "main" para realizar el saludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:

    ![alt text](resources/image-16.png)

- Se verá de la siguiente manera:

    ![alt text](resources/image-17.png)

11. Busca cómo enviar parámetros al plugin "exec"

    ![alt text](resources/image-18.png)

12. Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!

- Sin parámetro:

    ![alt text](resources/image-19.png)

- Con parámetro definido:

    ![alt text](resources/image-20.png)

13. Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!

    ![alt text](resources/image-21.png)

14. Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?

    ![alt text](resources/image-22.png)

- Lo que sucedió fue que únicamente me tomo el primer párametro, en este caso "Camilo"

15. Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.

- Código modificado:

    ![alt text](resources/image-23.png)

- Resultado:

    ![alt text](resources/image-24.png)

16. Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!

- Resultado: 

    ![alt text](resources/image-25.png)


**HACER EL ESQUELETO DE LA APLICACIÓN**

17. Cree el paquete edu.eci.cvds.patterns.shapes y el paquete edu.eci.cvds.patterns.shapes.concrete.

    ![alt text](resources/image-26.png)
    ![alt text](resources/image-27.png)

18. Cree una interfaz llamada Shape.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes de la siguiente manera:

    ![alt text](resources/image-28.png)


19. Cree una enumeración llamada RegularShapeType.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes así:

    ![alt text](resources/image-30.png)

- Se verá de la siguiente manera:

    ![alt text](resources/image-31.png)

20. En el directorio src/main/java/edu/eci/cvds/patterns/shapes/concrete cree las diferentes clases (Triangle, Quadrilateral, Pentagon, Hexagon), que implementen la interfaz creada y retornen el número correspondiente de vértices que tiene la figura.

- Triángulo:

    ![alt text](resources/image-32.png)

- Cuadrilátero:

    ![alt text](resources/image-38.png)

- Pentágono:

    ![alt text](resources/image-36.png)

- Hexágono:

    ![alt text](resources/image-37.png)

- Verificamos que efectivamente se crearon las clases:

    ![alt text](resources/image-33.png)

21. Cree el archivo ShapeMain.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes con el metodo main:

    ![alt text](resources/image-34.png)

- Verificamos la creación:

    ![alt text](resources/image-35.png)

22. Analice y asegúrese de entender cada una de las instrucciones que se encuentran en todas las clases que se crearon anteriormente. Cree el archivo ShapeFactory.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes implementando el patrón fábrica (Hint: https://refactoring.guru/design-patterns/catalog), haciendo uso de la instrucción switch-case de Java y usando las enumeraciones.

    ¿Cuál fábrica hiciste? y ¿Cuál es mejor?

- Nosotros implementamos el patrón de diseño simple factory, de la siguientye manera:
    ![alt text](resources/image-39.png)

    Sabemos que el código se ve bastante limpio y fácil de entender, además de eso permite el principio O de S.O.L.I.D puesto que si necesitamos más figuras esta abierto a modificación.