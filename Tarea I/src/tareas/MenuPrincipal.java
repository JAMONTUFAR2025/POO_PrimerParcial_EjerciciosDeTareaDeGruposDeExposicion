package tareas;

import javax.swing.*;

public class MenuPrincipal
{
    public void menuPrincipal()
    {
        SubMenuPrincipal smp = new SubMenuPrincipal();

        boolean acceso = true;
        int opcion = 0;

        while(acceso)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1. Ejercicios if\n2. Ejercicios for\n3. Salir\nIngrese un numero: "));

            switch(opcion)
            {
                case 1:
                case 2:
                    smp.subMenuPrincipal(opcion);
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
