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
public class S07v2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona_10 persona1 = new  Persona_10();
        Persona_10 persona2 = new  Persona_10("Juan Pérez", 30, 1.80); 

        persona1.saludar();
        persona2.presentarse("¡Hola");

        int edadPersona1 = persona1.obtenerEdad();
        JOptionPane.showMessageDialog(null, "Edad de la Persona 1: " + edadPersona1, "Edad", JOptionPane.INFORMATION_MESSAGE);

        String infoPersona2 = persona2.obtenerInfo();
        JOptionPane.showMessageDialog(null, infoPersona2, "Información de la Persona 2", JOptionPane.INFORMATION_MESSAGE);

        double alturaEnPiesPersona2 = persona2.convertirAlturaPies(3.28084);
        JOptionPane.showMessageDialog(null, "Altura en pies de la Persona 2: " + alturaEnPiesPersona2, "Altura en Pies", JOptionPane.INFORMATION_MESSAGE);

        persona1.felicitarCumpleanos(1);
        }
    
}
