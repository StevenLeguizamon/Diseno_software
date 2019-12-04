package Mensaje;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class Métodos {

    public void cifrarmensaje(int A, int a, int p, int g) throws IOException {
        char[] C = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z', ',', ';', '.', ':', '-', '_'};

        int y1 = 0, y2 = 0;

        FileReader fr = new FileReader("Texto.txt");
        BufferedReader br = new BufferedReader(fr);
        String texto = br.readLine();
        //Texto leido del txt
        char[] m = texto.toCharArray();
        int[] cifradoy1 = new int[m.length];
        int[] cifradoy2 = new int[m.length];
        int b = Integer.valueOf(JOptionPane.showInputDialog("Ingrese valor para b"));
        System.out.println("Valor b: " + b);
        if (b > 2 && b < (p - 1)) {
            System.out.println("Mensaje Cifrado");

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < C.length; j++) {

                    if (m[i] == C[j]) {

                        cifradoy1[i] = (int) ((Math.pow(g, b)) % p);
                        cifradoy2[i] = (int) ((Math.pow(A, b)) * j) % p;
                        

                    }

                }
            }

            System.out.println();
            System.out.println("Mensaje cifrado");
            PrintWriter pw = new PrintWriter("cifrado.txt");
            pw.println();
            pw.close();
            for (int i = 0; i < m.length; i++) {
                System.out.println("(" + cifradoy1[i] + "," + cifradoy2[i] + ")");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un valor mayor a 2 y menor a " + (p - 1));
            cifrarmensaje(A, a, p, g);
        }
    }

    public void descifrarmensaje(int n, int d, int e) throws IOException {
        char[] C = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z', ',', ';', '.', ':', '-', '_'};

        int num1, val1;
        FileReader fr = new FileReader("cifrado.txt");
        BufferedReader br = new BufferedReader(fr);
        String texto = br.readLine();
        //Texto leido del txt
        char[] des = texto.toCharArray();
        char[] descifrado = new char[des.length];
        for (int i = 0; i < des.length; i++) {
            System.out.print(des[i]);
        }
        System.out.println();
        for (int i = 0; i < des.length; i++) {
            for (int j = 0; j < C.length; j++) {
                if (des[i] == C[j]) {
                    //System.out.println("Se encuentra en la posición:"+j);
                    num1 = (int) ((Math.pow(j, d)) % n);
                    System.out.println("Num:" + num1);
                    if (num1 > C.length) {

                        val1 = (int) num1 % C.length;
                        System.out.println("   val:" + val1);
                        descifrado[i] = C[val1];
                    } else {

                        descifrado[i] = C[num1];
                    }
                }
            }
        }

        for (int i = 0; i < descifrado.length; i++) {
            System.out.print(descifrado[i]);
        }
    }

}

