/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06_deytongarcia;

import javax.swing.JOptionPane;

/**
 *
 * @author deyto
 */
public class Calculadora_10 {
    // Atributos
    private int operando1;
    private int operando2;

    // Constructor 
    public Calculadora_10() {
        this.operando1 = 0;
        this.operando2 = 0;
    }

    // Sobrecarga de constructor
    public Calculadora_10(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    // Métodos de operaciones básicas
    public int sumar() {
        return operando1 + operando2;
    }

    public int restar() {
        return operando1 - operando2;
    }

    public int multiplicar() {
        return operando1 * operando2;
    }

    // Método para realizar la división
    public double dividir() {
        if (operando2 != 0) {
            return (double) operando1 / operando2;
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre cero.", "Error de División", JOptionPane.ERROR_MESSAGE);
            return 0; 
        }
    }

    // Sobrecarga de método
    public int realizarOperacion(char operador) {
        switch (operador) {
            case '+':
                return sumar();
            case '-':
                return restar();
            case '*':
                return multiplicar();
            case '/':
                return (int) dividir(); 
            default:
                JOptionPane.showMessageDialog(null, "Error: Operador no válido.", "Error de Operación", JOptionPane.ERROR_MESSAGE);
                return 0; 
        }
    }

    // Método con valor de retorno
    public String obtenerInfo() {
        return "Operando 1: " + operando1 + "\nOperando 2: " + operando2;
    }
}