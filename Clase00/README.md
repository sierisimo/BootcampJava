# Modulo 1

## Historia y Filosofía de Java

1. **Origen y Evolución de Java:**
   - Exploración del contexto en el que Java fue desarrollado, destacando su origen en Sun Microsystems y su evolución a lo largo del tiempo.
  
2. **Principios y Objetivos de Diseño:**
   - Análisis de los principios fundamentales que guían el diseño de Java, como la portabilidad, simplicidad, robustez, y la importancia de la orientación a objetos.

## Configuración del Entorno de Desarrollo

1. **Elección de un IDE:**
   - Evaluación de distintos entornos de desarrollo integrados (IDEs) disponibles para trabajar con Java, considerando factores como la interfaz, funcionalidades y facilidad de uso.

2. **Instalación y Configuración del JDK:**
   - Guía detallada sobre cómo descargar, instalar y configurar el Kit de Desarrollo de Java (JDK) en diferentes sistemas operativos.

3. **Configuración de un Proyecto Básico:**
   - Pasos para la creación de un proyecto simple en un IDE, abordando la estructura inicial, configuración de compilación y ejecución, y la importancia de los archivos de configuración.

## Estructura Básica de un Programa Java

1. **Creación de Clases y Métodos:**
   - Introducción a la definición de clases y la implementación de métodos en Java, con ejemplos prácticos.

2. **Declaración de Variables y Tipos de Datos:**
   - Descripción de cómo declarar variables y utilizar diferentes tipos de datos, incluyendo enteros, decimales, caracteres y cadenas de texto.

3. **Flujo de Ejecución y Estructuras de Control Básicas:**
   - Explicación de cómo fluye la ejecución en un programa Java, junto con la implementación de estructuras de control como condicionales (if, else) y bucles (for, while).

## Compilación y Ejecución de Programas

1. **Proceso de Compilación en Java:**
   - Detalles sobre el proceso de compilación, desde la traducción del código fuente hasta la generación de archivos bytecode.

2. **Ejecución de Programas Java:**
   - Instrucciones para ejecutar programas Java en la Máquina Virtual de Java (JVM), incluyendo la interpretación del bytecode.

3. **Manejo Básico de Errores y Excepciones:**
   - Introducción al manejo de errores y excepciones en Java, destacando la importancia de la detección y gestión de problemas durante la ejecución.

## Presentacion

Los temas antes listados, se encuentran mayormente en la siguiente presentacion en google docs: [Link a presentacion](https://docs.google.com/presentation/d/1-edwcxWiN3N7GAwxK75A9Xnze2ciOSewfojJpPVxAs0/edit#slide=id.g2b9c5c5e395_0_239)

## Codigo y ejemplos

La manera en que muchas veces somos presentados con un nuevo lenguaje de programacion es usando un "Hello World", que es el programa mas simple que se encarga de mostrar "Hello World" en la pantalla, para **Java** el "Hello World" no luce tan sencillo y no es tan intuitivo, pero no te asustes, vamos a ir aprendiendo que significa cada una de las partes del codigo:

```java
public class Hello {
  public static void main(String[] args) {
    System.out.print("Hello World!");
  }
}
```

Para que este codigo pueda funcionar en nuestra computadora, debemos tener el JDK configurado (en la presentacion viene mencion a como se puede configurar), guardar el codigo en un archivo llamado `Hello.java` y en una terminal/consola posicionarnos en la carpeta donde tengamos el codigo, despues escribiremos:

```shell
javac Hello.java
```


Si todo es correcto, en la misma carpeta/directorio encontraremos que ahora tenemos un archivo llamado  `Hello.class`. Para ejecutar nuestro programa usaremos:

```shell
java Hello
```

Nota que no agregamos el `.class` al ejecutar el programa. En nuestra terminal deberiamos ver: `Hello World!`

## Conclusiones

Entendimos un poco de la historia de java y logramos compilar y ejecutar nuestro primer programa en Java!
