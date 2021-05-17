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
public class Aluno {
    
  public void CadastrarAluno(){
      //String a[] = new String [5];
      String m[] = {"Português", "Matemática", "Física","História", "Geografia"};
      double nota[] = new double[5];
      
      for (int i = 0; i < m.length; i++) {
          nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + m[i]));          
      }
      String result = "";
      
       for (int i = 0; i < m.length; i++) {
         result += m[i] + ": " + nota[i] + "\n";
      }
              
         JOptionPane.showMessageDialog(null, result);
        
      }
      
      
      
  }

