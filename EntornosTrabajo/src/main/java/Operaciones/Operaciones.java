
package Operaciones;

import Cuenta.CuentaBancaria;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

import Cliente.Cliente;
import Cuenta.CuentaBancaria;

public class Operaciones {
	private final int MAX_CLIENTES = 10;
	private Cliente cliente[];
	private CuentaBancaria cuentabancaria[];

	public Operaciones() {
		cliente = new Cliente[MAX_CLIENTES];

	}
	@Test
	public int BuscarCliente(int DNI) {
		for (int i = 0; i < cliente.length; i++) {
			if (cliente[i] != null && cliente[i].getDNI() == DNI)
				;
			return i;
		}
		return -1;
	}

	@Test
	public    void   Transferencia(Cliente cliente1, Cliente cliente2, int IdentificadorBanco) {
		int Operacion = 0;

		if (cliente1.getCuentabancaria().getIdentificadorBanco() == cliente2.getCuentabancaria()
				.getIdentificadorBanco()) {

			System.out.println("*******************************************");
			System.out.println("Operacion Acceptada");
			System.out.println("*******************************************");
			System.out.println("Dinero cliente 1 : " + cliente1.getCuentabancaria().getSaldoDisponible() + " € ");
			System.out.println("Dinero cliente 2 : " + cliente2.getCuentabancaria().getSaldoDisponible() + " € ");
			System.out.println("*******************************************");
			System.out.println("Operacion Clientes *La CaiXa*");
			System.out.println("*******************************************");
			System.out.println("Despues de la operacion");
			System.out.println("*******************************************");

			Operacion = Operacion + 50;
			cliente2.getCuentabancaria()
					.setSaldoDisponible(cliente2.getCuentabancaria().getSaldoDisponible() - Operacion);
			cliente1.getCuentabancaria()
					.setSaldoDisponible(cliente1.getCuentabancaria().getSaldoDisponible() + Operacion);

			System.out.println( "\n 'Actual' Cliente :1  tiene de Saldo Disponible en su cuenta  : "
			+ cliente1.getCuentabancaria().getSaldoDisponible() + " € "
			+ "\n  'Actual' Cliente :2  tiene de Saldo Disponible  en su cuenta  :"
			+ cliente2.getCuentabancaria().getSaldoDisponible() + " € ");
			
		} else {
			System.out.println("Operacion Denegada");
		}

		

	}

	@Test
	public void TransferenciaDiferenteBanco(Cliente cliente1, Cliente cliente2, int IdentificadorBanco) {
		int Operacion = 0;
		if (cliente1.getCuentabancaria().getIdentificadorBanco() != cliente2.getCuentabancaria()
				.getIdentificadorBanco()) {
			System.out.println("******************************************");
			System.out.println("Operacion Acceptada");
			System.out.println("Dinero cliente 1 : " + cliente1.getCuentabancaria().getSaldoDisponible() + " € ");
			System.out.println("Dinero cliente 2 : " + cliente2.getCuentabancaria().getSaldoDisponible() + " € ");

			System.out.println("*******************************************");
			System.out.println("Operacion Clientes *La CaiXa a Sa Nostra*");
			System.out.println("*******************************************");

			System.out.println("Despues de la operacion");
			System.out.println("*******************************************");
			Operacion = Operacion + 50;
			cliente1.getCuentabancaria()
					.setSaldoDisponible(cliente1.getCuentabancaria().getSaldoDisponible() - Operacion);
			cliente2.getCuentabancaria()
					.setSaldoDisponible(cliente2.getCuentabancaria().getSaldoDisponible() + Operacion);

			
			System.out.println( "\n 'Actual' Cliente 1 :   tiene de Saldo Disponible en su cuenta  : "
			+ cliente1.getCuentabancaria().getSaldoDisponible() + " € "
			+ "\n 'Actual' Cliente 2 :  tiene de Saldo Disponible  en su cuenta  :"
			+ cliente2.getCuentabancaria().getSaldoDisponible() + " € ");
			
		} else {
			System.out.println("Operacion Denegada");
		}

	

	}

	@Test
	public void traspaso(Cliente cliente, Cliente cliente1,int saldoDisponible) {
		int TraspasoDinero = 50;
		boolean b = true;
		boolean c = false;
		if (TraspasoDinero < saldoDisponible) {
			System.out.println( String.valueOf(b) + "\n *****Operacion Aceptada***** ");

		} else {
		System.out.println( String.valueOf(c) + " \n******Operacion Denegada ******");
		}
	
}
}
