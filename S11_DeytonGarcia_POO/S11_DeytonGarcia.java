/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_DeytonGarcia_POO;

/**
 *
 * @author deyto
 */
public class S11_DeytonGarcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Persona_10 persona = new Persona_10("Juan", 25);
        Estudiante estudiante = new Estudiante("Ana", 20, "Ingeniería", 3);
        Empleado empleado = new Empleado("Carlos", 30, 50000.0, "Desarrollador");
        Jubilado jubilado = new Jubilado("Rosa", 65, "feliz", "Jardinería");

        // Llamar a métodos de cada objeto
        persona.saludar();
        persona.presentarEdad();

        if (persona instanceof Estudiante) {
            ((Estudiante) persona).estudiar(); // Solo llama a estudiar() si el objeto es de tipo Estudiante
        }

        estudiante.saludar();
        estudiante.presentarEdad();
        estudiante.estudiar();
        estudiante.presentarCarrera();

        empleado.saludar();
        empleado.presentarEdad();
        empleado.trabajar();
        empleado.presentarSalario();

        jubilado.saludar();
        jubilado.presentarEdad();
        jubilado.disfrutarJubilacion();
        jubilado.presentarPensionista();
    }
}