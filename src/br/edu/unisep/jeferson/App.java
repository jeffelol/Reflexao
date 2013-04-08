package br.edu.unisep.jeferson;

import java.lang.reflect.Method;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try {
            Class calculadora = Class.forName("br.edu.unisep.jeferson.Calculadora");
            System.out.println("Escolha a operação:");
            System.out.println("2 - Adição");
            System.out.println("3 - Subtração");
            System.out.println("4 - Divisão");
            System.out.println("7 - Multiplicação");

            Method[] metodos = calculadora.getDeclaredMethods();

            Scanner sc = new Scanner(System.in);
            Method met = metodos[sc.nextInt()];

            Method get = calculadora.getDeclaredMethod(met.getName());
            
            System.out.println("Digite o primeiro valor: ");
            float valor = sc.nextFloat();
            
            System.out.println("Digite o segundo valor: ");
            float valor2 = sc.nextFloat();

            Object obj;
            obj = calculadora.newInstance();

            Method set = calculadora.getDeclaredMethod("setValor", Float.TYPE);

            set.invoke(obj, valor);

            set = calculadora.getDeclaredMethod("setValor2", Float.TYPE);
            set.invoke(obj, valor2);

            System.out.println("Resultado: " + get.invoke(obj));

    }
    catch (Exception ex) {
        System.out.println();
        }
    }
}