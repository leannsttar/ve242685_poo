package EjerciciosComplementarios;

import javax.swing.*;
import java.util.Random;


public class BolitaDescuento {
    public static void main(String[] args) {


        String[] options = {"Sacar bolita"};
        JOptionPane.showOptionDialog(
                null,
                "Saque una bolita para determinar su descuento. \n\nSi la bolita es roja, se le aplica un 10%\n" +
                        "de descuento sobre la compra; si la bola es verde, se le aplica un 5% de descuento y si la bolita es\n" +
                        "blanca, no tiene descuento.",
                "Descuento",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );


        Random rand = new Random();
        int bolita = rand.nextInt(2);


        if (bolita == 0) {
            JOptionPane.showMessageDialog(null, "Usted sacò la bolita roja \nObtiene un 10% de descuento", "Bolita roja", JOptionPane.INFORMATION_MESSAGE);
        } else if (bolita == 1) {
            JOptionPane.showMessageDialog(null, "Usted sacò la bolita verde \nObtiene un 5% de descuento", "Bolita verde", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usted sacò la bolita blanca \nNo obtiene descuento :(", "Bolita blanca", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
