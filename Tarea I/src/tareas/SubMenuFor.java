package tareas;

import javax.swing.*;

public class SubMenuFor
{
    public void subMenuFor(int opcion)
    {
        Bucle_For bfor = new Bucle_For();

        switch(opcion)
        {
            case 1:
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1. Tablas de multiplicar\n2. Reto Fizz Buzz\n3. Promedio notas estudiante\n4. Contar numeros pares e impares\nIngrese un numero: "));

                switch(opcion)
                {
                    case 1:
                        bfor.tablaMultiplicarEjercicioClase();
                        break;
                    case 2:
                        bfor.retoFizzBuzz();
                        break;
                    case 3:
                        bfor.promedioNotas();
                        break;
                    case 4:
                        bfor.paresImpares();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida.");
                }

                break;
            case 2:
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1. Numeros del 1 al 100\n2. Suma de los primeros 50 numeros\n3. Tablas de multiplicar\n4. Numeros pares\n5. Factorial de un numero\n6. Suma de numeros pares e impares\n7. Contador de multiplos\n8. Inverso de una cadena\n9. Numeros primos\n10. Piramide de asteriscos\nIngrese un numero: "));

                switch(opcion)
                {
                    case 1:
                        bfor.numerosUnoCien();
                        break;
                    case 2:
                        bfor.sumaPrimerosCincuenta();
                        break;
                    case 3:
                        bfor.tablaMultiplicarTarea();
                        break;
                    case 4:
                        bfor.numerosPares();
                        break;
                    case 5:
                        bfor.factorialEntero();
                        break;
                    case 6:
                        bfor.sumaParesImparesSeparados();
                        break;
                    case 7:
                        bfor.contadorMultiplos();
                        break;
                    case 8:
                        bfor.inversoCadena();
                        break;
                    case 9:
                        bfor.numerosPrimos();
                        break;
                    case 10:
                        bfor.imprimirPiramide();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida.");
                }

                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida.");
        }
    }
}
