package tareas;

import javax.swing.*;

public class Condicional_If {

    private int n1;
    private int n2;
    private int opcion;
    private int mayor;
    private int menor;

    // Ejercicios en clase
    // Ejercicio 1
    public void esMayorQueDiez()
    {
        int integer = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));

        if (integer > 10)
            System.out.println("Es mayor que 10.");
        else
            System.out.println("No es mayor que 10.");
    }

    // Ejercicio 2
    public void esMayorDeEdad()
    {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));

        if (age >= 18)
            System.out.println("Es mayor de edad.");
        else
            System.out.println("Es menor de edad.");
    }

    // Ejercicio 3
    public void palabraCorrecta()
    {
        String name = JOptionPane.showInputDialog("Ingrese su nombre: ");

        if (name.equals("Leo"))
            System.out.println("La palabra es correcta.");
        else
            System.out.println("La palabra es incorrecta.");
    }

    // Ejercicio 4
    public void positivoNegativo()
    {
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        if (number > 0)
            System.out.println("El numero es positivo.");
        else if (number < 0)
            System.out.println("El numero es negativo.");
        else
            System.out.println("El numero es 0.");
    }

    // Ejercicios de Tarea
    // Ejercicio 1
    public void parImpar()
    {
        JOptionPane.showMessageDialog(null,"Ejercicio 1: Identificar si un numero es par o impar");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero."));

        if(n1 % 2 == 0)
            JOptionPane.showMessageDialog(null, "Es un numero par.");
        else
            JOptionPane.showMessageDialog(null, "Es un numero impar.");
    }

    // Ejercicio 2
    public void descuentoProducto()
    {
        JOptionPane.showMessageDialog(null,"Ejercicio 2: Calcular descuento de un producto");
        String nombre = JOptionPane.showInputDialog("Digite el nombre del producto.");
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio del producto."));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del producto."));

        float subtotal = precio * cantidad;

        float descuento;
        if(subtotal > 100)
            descuento = 0.05f;
        else
            descuento = 0;

        float total = subtotal - (subtotal * descuento);

        JOptionPane.showMessageDialog(null, "Nombre del producto: " + nombre + "\nPrecio del producto: " + precio + "\nCantidad del producto: " + cantidad + "\nSubtotal: " + subtotal + "\nDescuento: " + descuento * 100 + "%\nTotal: " + total);
    }

    // Ejercicio 3
    public void mayorMenorDos() {
        JOptionPane.showMessageDialog(null, "Ejercicio 3: Mayor y menor de dos enteros");

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero entero."));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero entero."));

        if (n1 > n2)
        {
            mayor = n1;
            menor = n2;
        }
        else
        {
            mayor = n2;
            menor = n1;
        }

        if(mayor == menor)
            JOptionPane.showMessageDialog(null, "Ambos numeros valen lo mismo.");
        else
            JOptionPane.showMessageDialog(null, "El mayor es " + mayor + " y el menor es " + menor);
    }

    // Ejercicio 4
    public void mayorMenorTres()
    {
        JOptionPane.showMessageDialog(null, "Ejercicio 4: Mayor y menor de tres enteros");

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero entero."));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero entero."));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero entero."));

        mayor = 0;
        menor = 0;

        if (n1 >= n2 && n1 >= n3)
        {
            mayor = n1;

            if(n2 <= n3)
                menor = n2;
            else
                menor = n3;
        }
        else if(n2 >= n1 && n2 >= n3)
        {
            mayor = n2;

            if(n1 <= n3)
                menor = n1;
            else
                menor = n3;
        }
        else
        {
            mayor = n3;

            if(n1 <= n2)
                menor = n1;
            else
                menor = n2;
        }

        if(n1 == n2 && n1 == n3)
            JOptionPane.showMessageDialog(null, "Los tres numeros valen lo mismo.");
        else
            JOptionPane.showMessageDialog(null, "El mayor es " + mayor + " y el menor es " + menor + ".");
    }

    // Ejercicio 5
    public void rongoEdades()
    {
        JOptionPane.showMessageDialog(null,"Ejercicio 5: Validaciones de edad");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad."));

        if(edad < 18)
            JOptionPane.showMessageDialog(null, "Eres menor de edad.");
        else if(edad >= 18 && edad < 21)
            JOptionPane.showMessageDialog(null, "Eres mayor de edad.");
        else if(edad >= 21 && edad < 65)
            JOptionPane.showMessageDialog(null, "Tienes la mayoria de edad.");
        else
            JOptionPane.showMessageDialog(null, "Eres de la tercera edad.");
    }

    // Ejercicio 6
    public void calculadora()
    {
        JOptionPane.showMessageDialog(null,"Ejercicio 6: Calculadora");

        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero."));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero."));
        float resultado = 0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Calculadora\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\nIngrese un numero para la opcion."));

        if(opcion == 1)
        {
            resultado = n1 + n2;
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        }
        else if(opcion == 2)
        {
            resultado = n1 - n2;
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        }
        else if(opcion == 3)
        {
            resultado = n1 * n2;
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        }
        else if(opcion == 4)
        {
            if(n2 == 0)
            {
                JOptionPane.showMessageDialog(null, "No se puede dividir entre 0.");
            }
            else
            {
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Opcion no valida.");
        }
    }

    // Ejercicio 7
    public void diasSemana()
    {
        JOptionPane.showMessageDialog(null,"Ejercicio 7: Dias de la semana");

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero (rango: 1-7)."));

        if(opcion == 1)
            JOptionPane.showMessageDialog(null, "El dia es Lunes.");
        else if(opcion == 2)
            JOptionPane.showMessageDialog(null, "El dia es Martes.");
        else if(opcion == 3)
            JOptionPane.showMessageDialog(null, "El dia es Miercoles.");
        else if(opcion == 4)
            JOptionPane.showMessageDialog(null, "El dia es Jueves.");
        else if(opcion == 5)
            JOptionPane.showMessageDialog(null, "El dia es Viernes.");
        else if(opcion == 6)
            JOptionPane.showMessageDialog(null, "El dia es Sabado.");
        else if(opcion == 7)
            JOptionPane.showMessageDialog(null, "El dia es Domingo.");
        else
            JOptionPane.showMessageDialog(null, "Opcion no valida.");
    }
}
