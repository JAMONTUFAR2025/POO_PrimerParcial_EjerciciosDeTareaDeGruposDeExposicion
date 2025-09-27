// Josue Alejandro Montufar Zuniga
// 202510050077
// Tarea I

import tareas.Bucle_For;
import tareas.Condicional_If;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        Condicional_If cif = new Condicional_If();
        Bucle_For bfor = new Bucle_For();

        boolean acceso = true;
        int opcion = 0;

        while(acceso)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1. Ejercicios if\n2. Ejercicios for\n3. Salir\nIngrese un numero: "));

            switch(opcion)
            {
                case 1:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1. Ejercicios en clase\n2. Ejercicios de tarea\nIngrese un numero: "));

                    switch(opcion)
                    {
                        case 1:
                            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1. Es mayor que diez\n2. Es mayor de edad\n3. La palabra es correcta\n4. Es un numero positivo o negativo\nIngrese un numero: "));

                            switch(opcion)
                            {
                                case 1:
                                    cif.esMayorQueDiez();
                                    break;
                                case 2:
                                    cif.esMayorDeEdad();
                                    break;
                                case 3:
                                    cif.palabraCorrecta();
                                    break;
                                case 4:
                                    cif.positivoNegativo();
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
                            }

                            break;
                        case 2:
                            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1. Par o impar\n2. Descuento de producto\n3. Mayor o menor de dos numeros\n4. Mayor o menor de tres numeros\n5. Rango de edades\n6. Calculadora\n7. Dias de la semana\nIngrese un numero: "));
                            
                            switch(opcion)
                            {
                                case 1:
                                    cif.parImpar();
                                    break;
                                case 2:
                                    cif.descuentoProducto();
                                    break;
                                case 3:
                                    cif.mayorMenorDos();
                                    break;
                                case 4:
                                    cif.mayorMenorTres();
                                    break;
                                case 5:
                                    cif.rongoEdades();
                                    break;
                                case 6:
                                    cif.calculadora();
                                    break;
                                case 7:
                                    cif.diasSemana();
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida.");
                    }

                    break;
                case 2:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1. Ejercicios en clase\n2. Ejercicios de tarea\nIngrese un numero: "));

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

                    break;
                case 3:
                    acceso = false;
                    JOptionPane.showMessageDialog(null, "Has salido.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
            }
        }
    }
}
