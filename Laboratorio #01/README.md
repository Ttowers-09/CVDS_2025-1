
**UNIVERSIDAD ESCUELA COLOMBIANA DE INGENIERÍA JULIO GARAVITO**

**INTEGRANTES**

**Nombres:** Camilo Andres Quintero Rodriguez e Ivan Santiago F. Torres

**Asignacion:** Laboratorio 1 (Introducción a GIT)

**Asignatura:** Ciclos de Vida del desarrollo (CVDS)

**Docente:** Oscar David Ospina Rodriguez.

**RESPUESTAS**

**PARTE I (Trabajo Individual) Camilo Quintero**

1.  Crea un repositorio localmente.

    ![alt text](resources/image.png)

2.  Agrega un archivo de ejemplo al repositorio, el README.md puede ser una gran opción.

    ![alt text](resources/image-1.png)
    ![alt text](resources/image-2.png)

3.  Averigua para qué sirve y cómo se usan estos comandos git add y git commit -m "mensaje"

    - Git add nos sirve para agregar archivos nuevos o modificados en nuestro directorio de trabajo al área de preparación de Git

    - git commit -m genera una instancia que nos ayuda a registrar los cambios realizados en el repositorio local.

4.  Abre una cuenta de github, si ya la tienes, enlazarla con el correo
    ![alt text](resources/image-3.png)

5.  Crea un repositorio en blanco (vacío) en GitHub.

    > [[https://github.com/CamiloQuinteroR/lab01CVDS2025_1.git]](https://github.com/CamiloQuinteroR/lab01CVDS2025_1.git)

6.  Configura el repositorio local con el repositorio remoto.

    ![alt text](resources/image-4.png)

7.  Sube los cambios, teniendo en cuenta lo que averiguaste en el punto 3 Utiliza los siguientes comando en el directorio donde tienes tu proyecto, en este orden:

  
    ![alt text](resources/image0.png)

    > git add .

    >git commit -m \"mensaje, lo que hiciste con el archivo\"

    > git push \"url repositorio\"

8.  Configura el correo en git local de manera correcta

    Se configuró el correo institucional en git

9.  Vuelve a subir los cambios y observa que todo esté bien en el repositorio remoto (en GitHub).

    ![alt text](resources/image00.png)

    Se realizaron los cambios y todo esta bien en el repositorio remoto.
![alt text](resources/image000.png)

**PARTE I (Trabajo Individual) Ivan F. Torres**

1.  Crea un repositorio localmente.

    Navegamos por nuestro escritorio y creamos la carpeta.
    
    ![alt text](resources/image-6.png)
    
    Inicializamos nuestro repositorio.

    ![alt text](resources/image-7.png)

2.  Agrega un archivo de ejemplo al repositorio, el README.md puede ser una gran opción.

    Agregamos un elemento README.md
    ![alt text](resources/image-8.png)

3.  Averigua para qué sirve y cómo se usan estos comandos git add y git commit -m "mensaje"

    >- **Git add** nos sirve para agregar archivos nuevos o modificados en nuestro directorio de trabajo al área de preparación de Git

    >- **git commit** -m prepara todos los archivos

4.  Abre una cuenta de github, si ya la tienes, enlazarla con el correo institucional.

    ![alt text](resources/image-9.png)

5.  Crea un repositorio en blanco (vacío) en GitHub.

    ![alt text](resources/image-10.png)

6.  Configura el repositorio local con el repositorio remoto.  
    ![alt text](resources/image-11.png)

7.  Sube los cambios, teniendo en cuenta lo que averiguaste en el punto 3 Utiliza los siguientes comando en el directorio donde tienes tu proyecto, en este orden:

    a.  git add .

    b.  git commit -m \"mensaje, lo que hiciste con el archivo\"

    c.  git push \"url repositor

    ![alt text](resources/image-12.png)

8.  Configura el correo en git local de manera correcta

9.  Vuelve a subir los cambios y observa que todo esté bien en el repositorio remoto (en GitHub).

    ![alt text](resources/image-13.png)

**Parte II (Trabajo en parejas)**

1.  Se escogen los roles para trabajar en equipo, una persona debe escoger ser \"Owner\" o Propietario del repositorio y la otra \"Collaborator\" o Colaborador en el repositorio.

    Ivan: Owner

    Camilo: Collaborator

    "Para el trabajo en equipo decidimos cambiar el nombre del repositorio
    para continuar utilizando de manera conjunta el repositorio"

    ![alt text](resources/image-14.png)

2.  El owner agrega al colaborador con permisos de escritura en el repositorio que creó en la parte 1.
Invitar colaboradores a un repositorio personal.
    ![alt text](resources/image-15.png)
    ![alt text](resources/image-16.png)

3.  El owner le comparte la url via Teams al colaborador

    ![alt text](resources/image-17.png)

4.  El colaborador acepta la invitación al repositorio

    ![alt text](resources/image-18.png)

5.  Owner y Colaborador editan el archivo README.md al mismo tiempo e intentan subir los cambios al mismo tiempo.

    El owner edita el archivo:
    ![alt text](resources/image-19.png)

     El colaborador edita el archivo readme.md
    ![alt text](resources/image-20.png)
    
    El colaborador intenta subir los cambios
    ![alt text](resources/image-21.png)

6.  ¿Qué sucedió?

    Arroja un error con respecto a la modificación realizada por el colaborador.

7.  La persona que perdió la competencia de subir los cambios, tiene que
    resolver los conflictos, cuando haces pull de los cambios, los
    archivos tienen los símbolos \<\<\< === y  (son normales en
    la resolución de conflictos), estos conflictos debes resolverlos
    manualmente.

    ![alt text](resources/image-23.png)

    ![alt text](resources/image-24.png)

8.  Volver a repetir un cambio sobre el README.md ambas personas al tiempo para volver a tener conflictos.

    Cambio realizado por el colaborador
    ![alt text](resources/image-25.png)


    Cambio realizado por el owner

    ![alt text](resources/image-26.png)

    Owner realiza los cambios

    ![alt text](resources/image-27.png)

    Cuando el colaborador intenta subir la modificación se genera el conflicto

    ![alt text](resources/image-28.png)

9.  Resuelvan el conflicto con IntelliJ si es posible, Resolver conflictos en IntelliJ

    ![alt text](resources/image-29.png)

    Subimos los cambios corregidos

    ![alt text](resources/image-30.png)
    ![alt text](resources/image-31.png)

    De esta forma ya sabes resolver conflictos directamente sobre los archivos y usando un IDE como IntelliJ, esto te será muy útil en los futuros trabajos en equipo con Git.

**PARTE III (Trabajo de a parejas)**

1.  ¿Hay una mejor forma de trabajar con git para no tener conflictos?
    Si, pues podemos trabajar con ramas separadas, esto nos ayuda a evitar conflictos, gracias a que cada miembro del equipo puede trabajar sin interferir con el trabajo de los demás.

2.  ¿Qué es y cómo funciona el Pull Request?

    Las solicitudes de incorporación de cambios son un mecanismo para que los desarrolladores notifiquen a los miembros de su equipo que han terminado una función. Una vez la rama de función está lista, el desarrollador realiza la solicitud de incorporación de cambios mediante su cuenta. Así, todas las personas involucradas saben que deben revisar el código y fusionarlo con la rama main.

3.  Creen una rama cada uno y suban sus cambios

    ![alt text](resources/image-32.png)

    Owner crea su rama

    ![alt text](resources/image-33.png)
    
    Colaborador crea su rama

    ![alt text](resources/image-34.png)
    ![alt text](resources/image-35.png)

    Colaborador
    
    ![alt text](resources/image-37.png)
    ![alt text](resources/image-38.png)
    ![alt text](resources/image-39.png)

    Cambios realizados en la rama del colaborador
    ![alt text](resources/image-40.png)

    Ahora el owner sube sus cambios a su rama
    ![alt text](resources/image-41.png)
    ![alt text](resources/image-42.png)

    Verificamos que tanto owner como colaborador estén haciendo el proceso a la par:
    ![alt text](resources/image-43.png)

4.  Tanto owner como colaborador hacen un cambio en el README.md y hacen un Pull Request (PR) a la rama main/master.

    Luego de dar click en el banner amarillo se despliega lo siguiente:
    ![alt text](resources/image-44.png)
    ![alt text](resources/image-45.png)
    ![alt text](resources/image-46.png)

    Luego de darle click en merge Pull request al owner le salió asi:
    ![alt text](resources/image-47.png)
    
    y al colaborador le salió de la siguiente manera:
    ![alt text](resources/image-48.png)
    
    El colaborador debe resolver los conflictos:

(Recomendación : deben trabajar en equipo y distribuirse de mejor manera
quien va a modificar qué, para evitar modificar los mismos archivos al
mismo tiempo, si no se editan los mismos archivos la resolución de
conflictos es automática)

5. Teniendo en cuenta la recomendación, mezclen los cambios a la rama main a través de PR con el check/review/approval del otro compañero (Cuando se hace merge se deberían borrar las ramas en github)

    ![alt text](resources/image-49.png)
    ![alt text](resources/image-50.png)
    ![alt text](resources/image-51.png)
    ![alt text](resources/image-52.png)
    ![alt text](resources/image-53.png)


    Se corrigieron los cambios y se decidió dejar únicamente los cambios del colaborador.

    ![alt text](resources/image-54.png)

    Se realiza nuevamente el pull request después de solucionar los conflictos

    ![alt text](resources/image-55.png)

    Se eliminó la rama de colaborador después de subir los cambios.

    La ultima actualización del readme con respecto al laboratorio fue el siguiente fragmento de texto:
    
"#Repositorio para CVDS 2025-1, Ivan Santiago Torres y Camilo Quintero, segundo cambio" 
"#Repositorio para CVDS 2025-1, Ivan Santiago Torres y Camilo Quintero, segunda modificacion Ivan"
"Cambio tercera parte Camilo Quintero"

**WEBGRAFIA:**

- Atlassian. (s/f). *Pull-requests*. Atlassian. Recuperado el 26 de enero de 2025, de https://www.atlassian.com/es/git/tutorials/making-a-pull-request

