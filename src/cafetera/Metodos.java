/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
public class Metodos {

    ArrayList<Cafe> colaCafes = new ArrayList<>();

    public Integer elegirAzucar() {
        Integer azucar = 5;

        azucar = Integer.parseInt(JOptionPane.showInputDialog("Elija cantidad de azucar (Min:0 Max:10)"));

        return azucar;
    }

    public String elejirCafe() {
        String tipoCafe = "";
        String[] possibilities = {"Cafe solo", "Cafe con leche", "Capuchino"};
        String elecion = (String) JOptionPane.showInputDialog(null, "", "panel de control", JOptionPane.PLAIN_MESSAGE, null, possibilities, null);

        if (elecion == null) {
            elecion = "";
        }

        switch (elecion) {

            case "Cafe solo":
                tipoCafe = "cafe solo";
                break;

            case "Cafe con leche":
                tipoCafe = "cafe con leche";
                break;

            case "Capuchino":
                tipoCafe = "capuchino";
                break;
                
            default:
                break;
        }

        return tipoCafe;

    }

}