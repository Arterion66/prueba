package t4d;

/**
 * <h2> Clase Cuenta </h2>
 * Esta clase simula ser una cuenta bancaria
 * 
 * @author Juan Garcia
 * @version 1.0
 * 
 */


public class Cuenta {
	
	/**
	 * Atributo balance
	 * 
	 * Indica la cantidad total de dinero (en euros)
	 * acumulada en la cuenta bancaria 
	 *
	 */
	
	private int balance;

	/**
	 * 
	 * @param cantidad Dinero a ingresar en la cuenta
	 * 
	 */

	
	public Cuenta () {
		
	}
	public Cuenta (int balance) {
		this.balance=balance;
	}
	
	public int depDinero (int dinero) {//1
		balance=balance+dinero;
		return balance;
	}
	
	/**
	 * 
	 * @param cantidad Dinero a extraer de la cuenta
	 * 
	 */
	
	public int retDinero (int dinero) {//2
		balance=balance-dinero;
		return balance;
	}
	
	/**
	 * 
	 * @param destino Indica la cuenta en la que se deposita el dinero transferido
	 * @param cantidad Especifica la cantidad a extraer de la cuenta origen
	 *
	 */
	
	public void transDinero (Cuenta c1,Cuenta c2,int Dinero) {//3
		c1.retDinero(Dinero);
		c2.depDinero(Dinero);
	}
	
	/**
	 * 
	 * @return Devuelve el dinero actual de la cuenta
	 * 
	 */

	
	public void cancCuenta(Cuenta c) {
		c.balance=0;
	}
	
	public int getBalance() {
		return balance;
	}
	
	/**
	 * 
	 * @param balance Fijar el dinero en la cuenta a uno concreto
	 * 
	 */


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
		
}