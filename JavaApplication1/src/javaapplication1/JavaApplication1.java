/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alunodev08
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner teclado = new Scanner (System.in);
        
       int ns = 10;
       int ch = 0;
       int tn = 0;
       
       
       while((ns != ch) && (tn < 16)){
           tn++;
           System.out.println("Tentativa " + tn);
           System.out.println("Chuta ai...");
           ch = teclado.nextInt();
        
        if(ns == ch){
            System.out.println("Você acertou!! \n");
        }
        else{ if(tn == 16)
                System.out.println("Suas tentativas acabaram, tente novamente mais tarde.");
              else
                System.out.println("Você errou. \nTente novamente. \n");
        }
      }
    }
}
