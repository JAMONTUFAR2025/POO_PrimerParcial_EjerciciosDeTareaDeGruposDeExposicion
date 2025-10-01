package tareas;

import javax.swing.*;

public class SubMenuPrincipal
{
    public void subMenuPrincipal(int eleccion)
    {
        SubMenuIf smi = new SubMenuIf();
        SubMenuFor smf = new SubMenuFor();

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1. Ejercicios en clase\n2. Ejercicios de tarea\nIngrese un numero: "));

        if(eleccion == 1)
            smi.subMenuIf(opcion);
        else
            smf.subMenuFor(opcion);

    }
}
