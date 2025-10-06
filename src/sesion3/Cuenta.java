package sesion3;

public class Cuenta {
	private String numero;
	private String titular;
	private Double saldo;
	
	public Cuenta() {
		super();
		this.saldo=0d;
	}
	
	public Cuenta(Double saldo) {
		super();
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(Double cantidad)
	{
		this.saldo=500d;
	}
	
	public void retirar(Double cantidad)
	{
		this.saldo=-500d;
	}
	
	
}
