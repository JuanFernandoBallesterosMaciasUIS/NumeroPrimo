package ejecutable;

import javax.swing.JOptionPane;

public class NumeroPrimo {
    public static void main(String[] args) {
        // Declaración de variables

        boolean confir = false;
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero y positivo: "));

        if (n == 0 || n == 1 || n == 4) {
            JOptionPane.showMessageDialog(null, "El número " + n + " NO es un numero primo");
        } else {
            for (int x = 2; x < n / 2; x++) {

                if (n % x == 0) {
                    confir = true;
                }

            }

            if (confir) {
                JOptionPane.showMessageDialog(null, "El número " + n + " NO es un numero primo");

            } else {
                JOptionPane.showMessageDialog(null, "El número " + n + " es un numero primo");

            }

        }

    }
}