/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07v2_10_DeytonGarcia_POO;

import javax.swing.JOptionPane;

/**
 *
 * @author deyto
 */
public class Persona_10 {
        // Atributos
    private String nombre;
    private int edad;
    private double altura;

    // Constructor por defecto
    public Persona_10() {
        this.nombre = "Nombre por defecto";
        this.edad = 0;
        this.altura = 0.0;
    }

    // Sobrecarga de constructor
    public Persona_10(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Método 
    public void saludar() {
        JOptionPane.showMessageDialog(null, "Hola, soy " + nombre + ".");
    }

    public void presentarse(String saludoPersonalizado) {
        JOptionPane.showMessageDialog(null, saludoPersonalizado + ", soy " + nombre + ".");
    }

    // Método con valor de retorno 
    public int obtenerEdad() {
        return edad;
    }

    // Sobrecarga de método 
    public String obtenerInfo() {
        return "Nombre: " + nombre + "\nEdad: " + edad + " años\nAltura: " + altura + " metros";
    }

    // Método con parámetros 
    public double convertirAlturaPies(double conversionFactor) {
        return altura * conversionFactor;
    }

    public void felicitarCumpleanos(int incrementoEdad) {
        edad += incrementoEdad;
        JOptionPane.showMessageDialog(null, "¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }
}
