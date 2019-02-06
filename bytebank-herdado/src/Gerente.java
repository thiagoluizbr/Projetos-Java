//Gerente herda da class Funcionario
public class Gerente extends Funcionario implements Autenticavel{
	
	private Autenticacao autenticador;

	public Gerente() {
		this.autenticador = new Autenticacao();
	}
	
	
	public double getbonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Gerente!");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
