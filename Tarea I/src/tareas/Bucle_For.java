package tareas;

import java.util.Scanner;

public class Bucle_For
{
    // Ejercicios de Exposicion en Clase
    // Ejercicio 1 Tablas de Multiplicar
    public void tablaMultiplicarEjercicioClase()
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
        }

        promedio = suma / 5;

        System.out.println("El promedio es: " + promedio);

        if(promedio >= 70)
            System.out.println("Aprobado.");
        else
            System.out.println("Reprobado.");
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
    // Ejercicios basicos
    // Ejercicio 1 Imprimir los numeros del 1 al 100
    public void numerosUnoCien()
    {
        System.out.println("Numeros del 1 al 100: ");
        for(int i = 1; i <= 100; i++)
            System.out.println(i);
    }

    // Ejercicio 2 Imprimir la suma de los numeros del 1 al 50
    public void sumaPrimerosCincuenta()
    {
        int suma = 0;
        System.out.print("Suma de los numeros del 1 al 50: ");
        for(int i = 1; i <= 50; i++)
            suma += i;

        System.out.println(suma);
    }

    // Ejercicio 3 Tabla de multiplicar mediante entrada de entero
    public void tablaMultiplicarTarea()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabla multiplicar de un numero: ");
        System.out.print("Ingrese un numero entero: ");
        int num = sc.nextInt();

        System.out.println("Tabla del " + num + ": ");
        for(int i = 1; i <= 10; i++)
            System.out.println(num + " * " + i + " = " + (num * i));
    }

    // Ejercicio 4 Mostrar numeros pares
    public void numerosPares()
    {
        System.out.println("Numeros pares del 2 al 100: ");
        for(int i = 2; i <= 100; i+=2)
            System.out.println(i);
    }

    // Ejercicio 5 Factorial de un numero mediante entrada de entero
    public void factorialEntero()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Factorial de un numero entero: ");
        int num = sc.nextInt();
        int factorial = 1;

        System.out.print(num + "! = ");
        if(num == 1 || num == 0)
        {
            System.out.println("El factorial es 1.");
        }
        else if(num < 0)
        {
            System.out.println("No se puede calcular el factorial.");
        }
        else
        {
            for(int i = num; i > 0; i--)
            {
                factorial *= i;

                if(i > 1)
                    System.out.print(i + "* ");
                else
                    System.out.println("1 = " + factorial);
            }
        }
    }

    // Ejercicios intermedios
    // Ejercicio 6 Suma de numeros pares e impares por separado del 1 al 100
    public void sumaParesImparesSeparados()
    {
        int sumaPares = 0, sumaImpares = 0;

        System.out.println("Suma de numeros pares y numeros impares por separado del 1 al 100: ");
        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
                sumaPares += i;
            else
                sumaImpares += i;
        }

        System.out.println("Suma de numeros pares: " + sumaPares);
        System.out.println("Suma de numeros impares: " + sumaImpares);
    }

    // Ejercicio 7 Contador de multiplos de un numero entero del 1 al 100
    public void contadorMultiplos()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Contador de multiplos de un numero entero del 1 al 100: ");
        int num = sc.nextInt();
        int contador = 0;

        System.out.print("Los multiplos de " + num + " son: ");
        for(int i = num; i <= 100; i+=num)
        {
            System.out.print(i);
            if(i + num <= 100)
                System.out.print(", ");

            contador++;
        }

        System.out.println("Total de multiplos encontrador: " + contador);
    }

    // Ejercicio 8 Inverso de una cadena
    public void inversoCadena()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inverso de una cadena: ");
        System.out.print("Digite un texto: ");
        String texto = sc.next();

        System.out.print("Texto invertido: ");
        for(int i = texto.length() - 1; i >= 0; i--)
            System.out.print(texto.charAt(i));
    }

    // Ejercicios desafiantes
    // Ejercicio 9 Mostrar numeros primos entre 1 y 100
    public void numerosPrimos()
    {
        int contador;

        System.out.println("Imprimir numeros primos entre 1 y 100: ");

        for(int i = 1; i <= 100; i++)
        {
            contador = 0;

            for(int j = 1; j <= i; j++)
            {
                if(i % j == 0)
                    contador++;
            }

            if(contador == 2)
                System.out.println(i);
        }
    }

    // Ejercicio 10 Imprimir una piramide
    public void imprimirPiramide() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Imprimir una piramide: ");
        System.out.print("Ingrese el numero de pisos de la piramide: ");
        int pisos = sc.nextInt();

        for (int i = 1; i <= pisos; i++)
        {
            for(int j = 1; j <= pisos - i; j++)
                System.out.print(" ");

            for(int k = 1; k <= i; k++)
                System.out.print("* ");

            System.out.print("\n");
        }
    }
}
