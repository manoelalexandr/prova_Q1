package classe;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private double sm;
	private double grat;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sobrenome, double sm, double grat) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sm = sm;
		this.grat = grat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSm() {
		return sm;
	}

	public void setSm(double sm) {
		this.sm = sm;
	}

	public double getGrat() {
		return grat;
	}

	public void setGrat(double grat) {
		this.grat = grat;
	}
	
	public double salario() {
		double valor = sm + sm * grat/100;
		return valor;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do funcionário: ");
		sb.append(nome+ " " + sobrenome + "\n");
		sb.append("Salário: " + salario());
		return sb.toString();
	}
	
}
