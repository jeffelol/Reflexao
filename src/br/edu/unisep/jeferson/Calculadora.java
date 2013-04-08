
package br.edu.unisep.jeferson;

public class Calculadora {

    private float valor, valor2;

    public double adicao(){
        return (valor + valor);
    }
    
    public double subtracao(){
        return (valor - valor2);
    }
    
    public double divisao(){
        return (valor / valor2);
    }
    
    public double multiplicacao(){
        return (valor * valor2);
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
}
