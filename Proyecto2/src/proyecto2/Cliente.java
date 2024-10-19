/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import EntradaSalida.Consola;
import interfaz.Comparador;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona implements Comparador{
    private int nroC;
    private double saldo;

    public Cliente() {
        super();
        nroC = 0;
        saldo = 0;
    }

    public int getNroC() {
        return nroC;
    }

    public void setNroC(int nroC) {
        this.nroC = nroC;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Fecha getFnacimiento() {
        return Fnacimiento;
    }

    public void setFnacimiento(Fecha Fnacimiento) {
        this.Fnacimiento = Fnacimiento;
    }  
    
    public void CargarDatos(){
        System.out.println("ingresa nombre");
        nombre = Consola.leerString();
        apellido = " ";
        System.out.println("ingresa DNI");
        DNI = Consola.leerInt();   
    }
    
    public void mostrarDatos(){}
    
    @Override
    public boolean igualQue(Object op2) {
        Cliente x = (Cliente) op2;
        return (getDNI() == x.getDNI());
    }

    @Override
    public boolean menorQue(Object op2) {
        Cliente x = (Cliente) op2;
        return (getDNI() < x.getDNI());
    }

    @Override
    public boolean menorIgualQue(Object op2) {
        Cliente x = (Cliente) op2;
        return (getDNI() <= x.getDNI());
    }

    @Override
    public boolean mayorQue(Object op2) {
        Cliente x = (Cliente) op2;
        return (getDNI() > x.getDNI());
    }

    @Override
    public boolean mayorIgualQue(Object op2) {
        Cliente x = (Cliente) op2;
        return (getDNI() >= x.getDNI());
    }
    
}
