/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Llaves;

import static Llaves.Llaves.*;
import Mensaje.Menu;
import java.io.IOException;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class CrearLlaves {

    public static void crearllaves() throws IOException {
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();
        int A, o, d = 0, j = 0, mcd = 3;
        int p = Integer.valueOf(JOptionPane.showInputDialog("Ingrese valor primo para p"));
        int g = Integer.valueOf(JOptionPane.showInputDialog("Ingrese valor para el generador g"));
        int a = Integer.valueOf(JOptionPane.showInputDialog("Ingrese valor para la clave privado a"));

        if (p > 0 && g > 0 && a > 0) {
            System.out.println("Valor p:" + p);
            System.out.println("Valor g:" + g);
            System.out.println("Valor a:" + a);
            A = hallarA(p, g, a);
            JOptionPane.showMessageDialog(null, "Claves Públicas: (" + A + ")");
            JOptionPane.showMessageDialog(null, "Claves Privada: (" + a + ")");
            m.Mensaje(a, a, p, g);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese valores Mayores a 0");
            crearllaves();
        }
    }
}