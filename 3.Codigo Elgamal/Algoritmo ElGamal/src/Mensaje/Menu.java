package Mensaje;

import java.io.IOException;
import javax.swing.JOptionPane;
import Mensaje.Métodos;

public class Menu {

    public void Mensaje(int A,int a,int p,int g) throws IOException {
        Métodos m = new Métodos();
        Hash h= new Hash();
        int opc=0;
        while (opc != 4) {
            opc = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la opción que desea\n"
                    + "1.Cifrar\n"
                    + "2.Descifrar\n"
                    + "3.Salir"));

            switch (opc) {
                    case 1:
                        System.out.println();
                        System.out.println("Has seleccionado cifrar texto");
                        System.out.println();
                        m.cifrarmensaje(A,a,p,g);
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Has seleccionado descifrar texto");
                        System.out.println();
                        //m.descifrarmensaje(n,d,e);
                        
                        break;

                    case 3:
                        System.out.println();
                        System.out.println("Crear hash");
                        h.getHash();
                        System.out.println();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
        }
    }

}
