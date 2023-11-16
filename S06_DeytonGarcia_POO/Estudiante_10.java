/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_DeytonGarcia_POO;

import javax.swing.JOptionPane;

/**
 *
 * @author deyto
 */
public class Estudiante_10 {
    // Atributos
    private String nombre;
    private int edad;
    private String carrera;

    // Constructor 
    public Estudiante_10() {
        this.nombre = "Nombre por defecto";
        this.edad = 0;
        this.carrera = "Carrera por defecto";
    }

    // Sobrecarga de constructor
    public Estudiante_10(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Métodos
    public void mostrarDatos() {
        String mensaje = "Nombre: " + nombre + "\nEdad: " + edad + "\nCarrera: " + carrera;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

    // Sobrecarga de método
    public void mostrarDatos(String mensajeAdicional) {
        String mensaje = "Nombre: " + nombre + "\nEdad: " + edad + "\nCarrera: " + carrera + "\n" + mensajeAdicional;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método con valor de retorno
    public String obtenerInfo() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nCarrera: " + carrera;
    }

    // Sobrecarga de método con valor de retorno
    public String obtenerInfo(boolean incluirDetalles) {
        if (incluirDetalles) {
            return obtenerInfo() + "\nDetalles adicionales: [Información adicional]";
        } else {
            return obtenerInfo();
        }
    }
}
