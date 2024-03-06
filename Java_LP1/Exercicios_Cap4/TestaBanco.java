package Java_LP1.Exercicios_Cap4;

public class TestaBanco {
  
    public static void main (String args [])
    {
        Banco inter = new Banco();
        inter.setNumero(1001); 
        inter.setAgencia("coxipo"); 
        inter.setDataDeAbertura(new Data()); 
        inter.getDataDeAbertura().definirData(17, 02, 2024);
        inter.setNomeTitular("rafael"); 
        inter.setSaldo(3500); 
        inter.saque(200);
        inter.depositar(2000);
        System.out.println("Rendimento: "+inter.calculaRendimento());
        System.out.println(inter.recuperaDadosParaImpressao());
        Banco	c1	=	new	Banco();								
        c1.setNomeTitular("Danilo");
        c1.setSaldo(100);	
        Banco	c2	=	new	Banco();								
        c2.setNomeTitular("Danilo");
        c2.setSaldo(100);
        if	(c1	==	c2)	{
                        System.out.println("iguais");
        }	else	{
                        System.out.println("diferentes");								
        }
        Banco c3 = new Banco();
        c3.setNomeTitular("Rafael");
        c3.setSaldo(100);
        c2 = c3;
        if	(c3	==	c2)	{
            System.out.println("iguais");
        }	else	{
            System.out.println("diferentes");								
            }


    }
}
