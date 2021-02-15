
package com.jose.principal;

import com.jose.genera.Trabajador;

/**
 *
 * @author Jose Lopez
 * @version 1.0
 * @since 08/02/2021
 */
public class Principal {

    /**
     * Metodo principal que ejecuta el programa 
     * @param args 
     */
    public static void main(String[] args) {
     
        
        Trabajador t1 = new Trabajador("Jose", "Lopez Santana", 31, 21000);
        int incentivo = (int)t1.calculaIncentivo20(t1.getSueldo());
        int sueldoFinal = t1.getSueldo() + incentivo;
        
        
        System.out.println("El trabajador " + t1.getNombre() + " " + t1.getApellidos() 
                + " con ID: " + t1.getIdTrabajador() + ", con sueldo base de " + t1.getSueldo() + "€.");
        System.out.println("Incentivo del 20% sobre el sueldo: " + incentivo + "€.");
        System.out.println("Sueldo final, incentivo + sueldo: " + sueldoFinal + "€.");
        
        t1.calculaProrrateo(sueldoFinal);
        


         
    }
    
}
