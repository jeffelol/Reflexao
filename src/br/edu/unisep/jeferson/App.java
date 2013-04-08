package br.edu.unisep.jeferson;

import java.lang.reflect.Method;

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
            
            for(Method mts : metodos){

            }
            
        } catch (ClassNotFoundException ex) {
        
        }
    }

}
