
public class TestaPessoa {

	public static void main(String[] args) {
		int choice =0, choice2  =0;
		int i = 0;
		Pessoa vetor [] = new Pessoa[10];
		while (choice != 5) {
		Pessoa p1 = new Pessoa();
		System.out.println("Bem vindo ao sistema de cadastro de pessoas:");
		System.out.print("1-Cadastrar \n2-Alterar \n3-Excluir \n4-Consultar \n5-Sair");
		choice = Teclado.lerInteiro("\nDigite o codigo:");
		switch (choice) {
		case 1:
			p1.setNome(Teclado.lerString("Digite o nome:"));
			p1.setCpf(Teclado.lerString("Digite o cpf:"));
			vetor[i] = p1;
			i++;
			break;
		
		case 2:
			String auxCpf;
			System.out.println("Digite o CPF da pessoa que deseja modificar:");
			auxCpf = Teclado.lerString("->");
			for (int j = 0; j < vetor.length; j++) {
				if(vetor[j] != null) {
				if (vetor[j].getCpf().equals(auxCpf)) {
					System.out.println("Nome:"+vetor[j].getNome()+" CPF:"+vetor[j].getCpf());
					System.out.print("O que deseja modificar?\n1-Nome\n2-CPF\n");
					choice2= Teclado.lerInteiro("Digite o Codigo:");
					if (choice2 == 1) {
						String auxNome;
						auxNome = Teclado.lerString("Digite o novo nome:");
						vetor[j].setNome(auxNome);
						break;
					}
					if ( choice2 == 2) {
						String auxCpf2;
						auxCpf2 = Teclado.lerString("Digite o novo CPF:");
						vetor[j].setCpf(auxCpf2);
						break;
					}
					if ( choice2!= 1 & choice2 != 2) {
						System.out.println("Codigo invalido!!");
						break;
					}
				}
				}
			}
			break;
		
		case 3 :
			String auxCpf3;
			System.out.println("Digite o CPF da pessoa que deseja excluir:");
			auxCpf3 = Teclado.lerString("->");
			for (int j = 0; j < vetor.length; j++) {
				if(vetor[j] != null) {
				if (vetor[j].getCpf().equals(auxCpf3)) {
					System.out.println("Pessoa exluida: Nome:"+vetor[j].getNome()+" CPF:"+vetor[j].getCpf());
					vetor[j].setNome(null); 
					vetor[j].setCpf(null); 
					vetor[j] = null;
					break;
				}
				}
			}
			break;
		case 4 : 
			
			for (int k =0; k< vetor.length; k++) {
				if(vetor[k] != null)
				System.out.println("Nome:"+ vetor[k].getNome()+ "\\" + vetor[k].getCpf());
			}
			break;
			
	}
	}
	}
}
