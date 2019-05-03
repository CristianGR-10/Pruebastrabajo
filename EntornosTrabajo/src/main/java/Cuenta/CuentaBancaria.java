package Cuenta;

import Cliente.Cliente;

public class CuentaBancaria {

	private String NumCuenta;
	private String   saldoDisponible;
	private String nombreBanco;
	private int IdentificadorBanco;

	public CuentaBancaria() {

	}

	public CuentaBancaria(long numCuenta, int saldoDisponible, String nombreBanco, int identificadorBanco) {
		super();
		NumCuenta = numCuenta;
		this.saldoDisponible = saldoDisponible;
		this.nombreBanco = nombreBanco;
		IdentificadorBanco = identificadorBanco;

	}

	public String toString() {
		return " \nEl numero de cuenta es: "  + NumCuenta +
				"  \nel saldo disponible es : " + saldoDisponible + " € "+
				" \nNombre del Banco es :   " + nombreBanco +
				" \nIdenDelBanco  : "+ IdentificadorBanco ;

	}

	public String getNumCuenta() {
		return NumCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		NumCuenta = numCuenta;
	}

	public String getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(String saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public int getIdentificadorBanco() {
		return IdentificadorBanco;
	}

	public void setIdentificadorBanco(int identificadorBanco) {
		IdentificadorBanco = identificadorBanco;
	}



}
