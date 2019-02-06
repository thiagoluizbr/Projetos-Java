
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		
		Gerente thiago = new Gerente();
		thiago.setNome("Thiago Luiz");
		thiago.setCpf("00000-00");
		thiago.setSalario(2500.00);
		
		System.out.println(thiago.getNome());
		System.out.println(thiago.getbonificacao());
		
		//thiago.salario = 300.0;
	}

}
