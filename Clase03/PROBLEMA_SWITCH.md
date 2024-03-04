# Ejercicio: Calculadora de Calificaciones

Escribe un programa en Java que calcule la calificación de un estudiante basándose en su porcentaje de puntaje. 
El programa debe tomar el porcentaje de puntaje como entrada y luego utilizar una declaración `switch` para determinar y mostrar la calificación correspondiente según la siguiente escala de calificación:

- A: 90-100
- B: 80-89
- C: 70-79
- D: 60-69
- F: 0-59

El programa debe manejar entradas inválidas de manera adecuada, proporcionando un mensaje apropiado si el porcentaje no está dentro del rango válido (0-100).

Aquí tienes una estructura básica para comenzar:

```java
import java.util.Scanner;

public class CalculadoraDeCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el porcentaje de puntaje: ");
        double porcentaje = scanner.nextDouble();

        // Validar la entradaW
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("¡Entrada inválida! El porcentaje debe estar entre 0 y 100.");
        } else {
            // Utilizar una declaración switch para determinar la calificación
            // Tu código aquí...

            // Mostrar el resultado
            System.out.println("La calificación es: " + calificacion);
        }

        scanner.close();
    }
}
```

