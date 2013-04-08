package br.edu.unisep.jeferson;

import java.lang.reflect.Method;
import java.util.Scanner;

public class App {

    public static void main(String args[]){
        try {
            Class operacao = Class.forName("br.edu.unisep.jeferson.Calculadora");
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            
            Method[] metodos = operacao.getMethods();
            
            Scanner sc = new Scanner(System.in);

            Method mt = metodos[sc.nextInt()];

            
            
        } catch (ClassNotFoundException ex) {
        
        }
    }

}