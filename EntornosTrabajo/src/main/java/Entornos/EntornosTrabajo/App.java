package Entornos.EntornosTrabajo;

import Cliente.Cliente;
import Cuenta.CuentaBancaria;
import Operaciones.Operaciones;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("============PRIMER CLIENTE=====================");

		CuentaBancaria cuenta1 = new CuentaBancaria(345454324, 300, "La caixa", 3454);
//		System.out.println(cuenta1);
		System.out.println("===================================================");
		Cliente c1 = new Cliente(" Roberto ", " Lopez ", 235454335, " Calle cabo blanco ", 654234354, cuenta1);
		System.out.println(c1);

		System.out.println("================SEGUNDA CLIENTE =================================");

		CuentaBancaria cuenta2 = new CuentaBancaria(345454324, 500, "La caixa", 3454);
//		System.out.println(cuenta2);

		System.out.println("===================================================");
		Cliente c2 = new Cliente(" Pepe ", " Fernadez ", 525474335, " Calle cabo Pi ", 674833354, cuenta2);
		System.out.println(c2);

		Operaciones oper = new Operaciones();
		System.out.println("========OPERACION CLIENTES DEL MISMO BANCO=======");

		oper.Transferencia(c1, c2, 3454);

		System.out.println("=======OPERACION CON CLIENTES DIFERENTE BANCO===================");

		System.out.println(
				"--------------------------------------------------------------------------------------------------------");

		System.out.println("============== TERCER CLIENTE ====================");

		CuentaBancaria cuenta3 = new CuentaBancaria(345454324, 600, "La caixa", 3454);
//		System.out.println(cuenta1);
		System.out.println("===================================================");
		Cliente c3 = new Cliente("Cristian  ", "Garcia  ", 777454335, " Calle cabo blanco ", 689234354, cuenta3);
		System.out.println(c3);

		System.out.println("===============CUARTO CLIENTE=======================");

		CuentaBancaria cuenta4 = new CuentaBancaria(333454324, 500, "Sa nostra", 3334);
//		System.out.println(cuenta2);

		System.out.println("===================================================");
		Cliente c4 = new Cliente(" Rogelio", " Cap ", 825474335, " Calle cabo Pi ", 690833354, cuenta4);
		System.out.println(c4);

		System.out.println("=======OPERACION DE DISTINTO BANCO===================");

		Operaciones operDistintoBanco = new Operaciones();

		operDistintoBanco.TransferenciaDiferenteBanco(c3, c4, 3454);

		System.out.println("=======OPERACION CON EL MISMO CLIENTE===================");

		System.out.println(
				"--------------------------------------------------------------------------------------------------------");

		System.out.println("============== QUINTO CLIENTE ====================");

		CuentaBancaria cuenta5 = new CuentaBancaria(345454324, 200, "La caixa", 3454);
//		System.out.println(cuenta1);
		System.out.println("===================================================");
		Cliente c5 = new Cliente("Cristian  ", "Garcia  ", 777454335, " Calle cabo blanco ", 689234354, cuenta5);
		System.out.println(c5);

		System.out.println("===============SEXTO CLIENTE=======================");

		CuentaBancaria cuenta6 = new CuentaBancaria(333454324, 200, "La caixa", 3454);
//		System.out.println(cuenta2);

		System.out.println("===================================================");
		Cliente c6 = new Cliente(" Cristian", " Garcia ", 777454335, " Calle cabo blanco ", 689234354, cuenta6);
		System.out.println(c6);

		Operaciones opermismoCliente = new Operaciones();

		opermismoCliente.traspaso(c5,c6,200);

	}
}
