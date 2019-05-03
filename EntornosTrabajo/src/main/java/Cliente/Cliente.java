package Cliente;

import org.junit.Test;

import Cuenta.CuentaBancaria;

public class Cliente {

	private String nombre;
	private String Apellidos;
	private int DNI;
	private String Direccion;
	private int Telefono;
	private CuentaBancaria cuentabancaria;

	public Cliente() {

	}



	public Cliente(String nombre, String apellidos, int dNI, String direccion, int telefono,
			CuentaBancaria cuentabancaria) {
		super();
		this.nombre = nombre;
		Apellidos = apellidos;
		DNI = dNI;
		Direccion = direccion;
		Telefono = telefono;
		this.cuentabancaria = cuentabancaria;
	}



	public String toString() {
		return "\nEl nombre del cliente :  " + nombre +  
				"  \nSus Apellidos son  : " + Apellidos + 
				"  \nDni del cliente : " + DNI
				+ " \ny la Direccion y el telefono son  : " + Direccion + "\n" + " y telefono :  " + Telefono  +
				    "\n datos cuenta Bancaria:" + cuentabancaria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}



	public CuentaBancaria getCuentabancaria() {
		return cuentabancaria;
	}



	public void setCuentabancaria(CuentaBancaria cuentabancaria) {
		this.cuentabancaria = cuentabancaria;
	}
	
	
	
	
	
	
}
