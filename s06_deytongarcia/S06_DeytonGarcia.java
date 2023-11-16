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
public class S06_DeytonGarcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Ejemplo de uso clase Estudiante_10
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        String carrera = JOptionPane.showInputDialog("Ingrese la carrera del estudiante:");

        Estudiante_10 estudiante = new Estudiante_10 (nombre, edad, carrera);
        estudiante.mostrarDatos();
        
        // Ejemplo de uso clase Calculadora_10
        Calculadora_10 calc1 = new Calculadora_10(10, 5); // Utiliza la sobrecarga del constructor

        // Muestra el resultado de las operaciones básicas
        JOptionPane.showMessageDialog(null, "Suma: " + calc1.sumar());
        JOptionPane.showMessageDialog(null, "Resta: " + calc1.restar());
        JOptionPane.showMessageDialog(null, "Multiplicación: " + calc1.multiplicar());
        JOptionPane.showMessageDialog(null, "División: " + calc1.dividir());

        // Ejemplo de sobrecarga de método
        char operador = JOptionPane.showInputDialog("Ingrese el operador (+, -, *, /):").charAt(0);
        int resultado = calc1.realizarOperacion(operador);
        JOptionPane.showMessageDialog(null, "Resultado de la operación: " + resultado);

        // Ejemplo de método con valor de retorno
        String infoCalculadora = calc1.obtenerInfo();
        JOptionPane.showMessageDialog(null, "Información de la Calculadora:\n" + infoCalculadora, "Información de la Calculadora", JOptionPane.INFORMATION_MESSAGE);
    
    }
}
    
   
    

