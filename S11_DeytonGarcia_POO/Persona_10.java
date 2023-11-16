/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_DeytonGarcia_POO;

import javax.swing.JOptionPane;

/**
 *
 * @author deyto
 */
public class Persona_10 {
        // Atributos
    protected String nombre;
    protected int edad;

    // Constructor
    public Persona_10(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void saludar() {
        JOptionPane.showMessageDialog(null, "Hola, soy " + nombre + ".");
    }

    public void presentarEdad() {
        JOptionPane.showMessageDialog(null, "Tengo " + edad + " años.");
    }
}

// Clase Hija 1
class Estudiante extends Persona_10 {
    // Atributos adicionales
    private String carrera;
    private int semestre; // Nuevo atributo

    // Constructor
    public Estudiante(String nombre, int edad, String carrera, int semestre) {
        super(nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    // Métodos adicionales
    public void estudiar() {
        JOptionPane.showMessageDialog(null, nombre + " está estudiando " + carrera + " en el semestre " + semestre + ".");
    }

    public void presentarCarrera() {
        JOptionPane.showMessageDialog(null, "Estudio " + carrera + ".");
    }
}

// Clase Hija 2
class Empleado extends Persona_10 {
    // Atributos adicionales
    private double salario;
    private String cargo; // Nuevo atributo

    // Constructor
    public Empleado(String nombre, int edad, double salario, String cargo) {
        super(nombre, edad);
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos adicionales
    public void trabajar() {
        JOptionPane.showMessageDialog(null, nombre + " está trabajando como " + cargo + ".");
    }

    public void presentarSalario() {
        JOptionPane.showMessageDialog(null, "Mi salario es $" + salario + ".");
    }
}

// Clase Hija 3: Jubilado
class Jubilado extends Persona_10 {
    // Atributos adicionales
    private String pensionista;
    private String pasatiempo; // Nuevo atributo

    // Constructor
    public Jubilado(String nombre, int edad, String pensionista, String pasatiempo) {
        super(nombre, edad);
        this.pensionista = pensionista;
        this.pasatiempo = pasatiempo;
    }

    // Métodos adicionales
    public void disfrutarJubilacion() {
        JOptionPane.showMessageDialog(null, nombre + " está disfrutando de su jubilación como " + pensionista + " con el pasatiempo " + pasatiempo + ".");
    }

    public void presentarPensionista() {
        JOptionPane.showMessageDialog(null, "Soy un pensionista " + pensionista + ".");
    }
}


