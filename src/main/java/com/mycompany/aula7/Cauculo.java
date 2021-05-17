/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula7;

import javax.swing.JOptionPane;

/**
 *
 * @author Fillipe
 */
public class Cauculo {
    
    public void soma(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Valor A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Valor B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Valor C"));
        int resultado = a+b+c;
        
        JOptionPane.showMessageDialog(null,"Resultado: " + resultado);
    }   
    public int soma(int a, int b, int c){
        return a+b+c;
    }
}
