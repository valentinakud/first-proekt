/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @author val12
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog(null, "Введите радиус окружности");
        double r = Double.parseDouble(in);
        double s = Math.PI*r*r;
        BigDecimal bd = new BigDecimal(s);
        JOptionPane.showMessageDialog(null, bd.setScale(2, RoundingMode.HALF_UP));
        System.out.println("First");
    }
    
}
