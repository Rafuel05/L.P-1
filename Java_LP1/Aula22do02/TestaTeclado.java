public class TestaTeclado {

	public static void main(String[] args) {
		int v [] = new int[5];
		for (int i =0;i <v.length;i++) {
		int numero = Teclado.lerInteiro("Digite um numero:");
		v [i] = numero;
		}
		int maior = 0;
		for (int j = 0; j < v.length; j++)
		{
			if (v[j]>maior) {
				maior = v[j];
			}
		}
		System.out.println("O maior numero digitado:"+maior);
		

	}

}
