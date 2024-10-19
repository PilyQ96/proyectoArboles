/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int DNI;
    protected Fecha Fnacimiento;

    public Persona() {
        nombre = " ";
        apellido = " ";
        DNI = 0;
        Fnacimiento = new Fecha();
    }
    
    public void cargarDatos1(){}
    
    public void mostrarDatos(){}
    
    
}
