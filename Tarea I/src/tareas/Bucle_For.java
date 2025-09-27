package tareas;

import java.util.Scanner;

public class Bucle_For
{
    // Ejercicios de Exposicion en Clase
    // Ejercicio 1 Tablas de Multiplicar
    public void tablasDeMultiplicar()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        System.out.println("Tabla del " + numero);
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Ejercicio 2
    // FizzBuzz el reto es recorrer los numeros del 1 al 100
    // Reemplazando los multiplos de 3 por Fizz
    // Los multiplos de 5 por Buzz y los multiplos de 3 y 5 por FizzBuzz
    public void retoFizzBuzz()
    {
        for(int i = 1; i <= 100; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if(i % 3 == 0)
                System.out.println("Fizz");
            else if(i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    // Ejercicio 3 Promedio notas estudiante
    public void promedioNotas()
    {
        Scanner entrada = new Scanner(System.in);

        float notas, suma = 0, promedio = 0;

        for(byte i = 1; i <= 5; i++)
        {
            System.out.println("Ingrese la nota " + i + ": ");
            notas = entrada.nextFloat();

            suma += notas;

            if(i == 5)
                promedio = suma / i;
        }

        System.out.println("El promedio es: " + promedio);

        if(promedio >= 70)
            System.out.println("Aprobado.");
        else
            System.out.println("Reprobado.");

        entrada.close();
    }

    // Ejercicio 4 Contar numeros pares e impares
    public void paresImpares()
    {
        int pares = 0, impares = 0;

        for(int i = 1; i <= 10; i++)
        {
            if(i % 2 == 0)
                pares++;
            else
                impares++;
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    // Ejercicios de Exposicion de Tarea
}
