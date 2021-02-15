
package com.jose.genera;

import javax.swing.JOptionPane;

/**
 * Clase que genera trabajadores
 * @author Jose Lopez
 * @version 1.0
 * @since 8.0
 */
public class Trabajador {
    
    String nombre;
    String apellidos;
    int edad;
    int sueldo;
    int idTrabajador;
    private static int idSiguiente = 1;

    /**
     * 
     * Constructor vacio
     * 
     */
    
    public Trabajador(){
        
        this.idTrabajador = idSiguiente;
        idSiguiente++;
    }
    
    /**
     * 
     * Constructor con parametros
     * 
     * @param nombre Nombre del trabajador
     * @param apellidos Apellidos del trabajador
     * @param edad Edad del trabajador
     * @param sueldo Sueldo de trabajador

     */
    
    public Trabajador (String nombre, String apellidos, int edad, int sueldo){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sueldo = sueldo;
        
        this.idTrabajador = idSiguiente;
        idSiguiente++;
    }

    
    
    /**
     * @serialData
     * El sueldo tiene que ser un valor decimal
     * @deprecated Este metodo está en desuso, ahora se aplica el 20% del salario como inventivo
     * @param sueldo Sueldo del trabajador
     * @return 
     * Retorna el 10% del sueldo del trabajador
     */

    
    public double calculaIncentivo10(double sueldo){
        
        return sueldo * 0.10;
    }
    
    /**
    * Retorna el 20% del sueldo del trabajador
    * @serialData
    * El sueldo tiene que ser un valor decimal
    * @param sueldo Sueldo del trabajador
    * @return Incentivo
    */
    
    public double calculaIncentivo20(int sueldo){
        
        return sueldo * 0.20;
    }
    
    /**
     * 
     * Metodo que calcula la cantidad de salario prorrateada en funcion de los meses que se le indiquen
     * @throws 
     * ArithmeticException En caso de que la cantidad de meses a calcular en el prorrateo introducida sea cero
     * @param sueldo 
     */
    
    public void calculaProrrateo(int sueldo){
        
        int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca meses a prorratear su salario anual"));
        
        try{
           
            System.out.println("La cantidad a percibir en " + meses + " meses prorrateados es de: " + (sueldo/meses) + " mensuales.");
            
            
        }catch(ArithmeticException e){
            
            System.out.println("Al menos tiene que indicar mayor a 1 mes.");
                    
        }
    }

    
    /**
     * Permite modificar el nombre del trabajador
     * @param nombre Nombre del trabajador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite modificar apellidos del trabajador
     * @param apellidos Apellidos del trabajador
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Permite modificar edad del trabajador
     * @param edad Edad del trabajador
     */    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Permite modificar sueldo del trabajador
     * @param sueldo Sueldo del trabajador
     */  
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
    * Devuelve el nombre del trabajador
    * @return Nombre del trabajador
    */
    public String getNombre() {
        return nombre;
    }
    
    /**
    *  Devuelve apellidos del trabajador
    * @return Apellidos del trabajador
    */
    public String getApellidos() {
        return apellidos;
    }
    
    /**
    * Devuelve el edad del trabajador
    * @return Edad del trabajador
    */
    public int getEdad() {
        return edad;
    }
    
    /**
    * Devuelve el sueldo del trabajador
    * @return Sueldo del trabajador
    */   
    public int getSueldo() {
        return sueldo;
    }
    
    /**
     * Devuelve el ID del trabajador
     * @return ID del trabajador
     */
    public int getIdTrabajador() {
        return idTrabajador;
    }

    /**
    * Devuelve cadena de String con todos los datos del trabajador
    * @return Cadena con datos del trabajador
    */
    @Override
    public String toString() {
        return "Trabajador{" + "nombre= " + nombre + ", apellidos= " + apellidos + ", edad= " + edad + ", sueldo= "
                + sueldo + ", idTrabajador= " + idTrabajador + '}';
    }


}
