package tareas;

import javax.swing.*;

public class SubMenuIf
{
    public void subMenuIf(int opcion)
    {
        Condicional_If cif = new Condicional_If();

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
    }
}
