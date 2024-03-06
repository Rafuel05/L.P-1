package Java_LP1.Exercicios_Cap4;

public class Banco {
    private int identificador;
    private static int proxIdentificador;

    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;
    //Banco.saldo	=	1234; nao faz sentido (exercicio 8)
    //Banco.calculaRendimento(); nao faz sentido (exercicio 8)
    public  Banco (String nomeTitular){
        this.nomeTitular = nomeTitular;
        identificador = proxIdentificador++;
    }
    public Banco(){

    }
    public int getIdentificador() {
        return this.identificador;
    }

    public void saque (double v)
    {
        saldo = saldo - v;
        System.err.println("Valor sacado: " + v + "$ \nValor atual na conta: " + saldo+"$" ); 
    }
    public void depositar ( double v)
    {
        saldo = saldo +v;
        System.err.println("Valor depositado: " + v + "$ \nValor atual na conta:" + saldo+"$" ); 
    }
    public double calculaRendimento ( ){
        double rend;
        rend = saldo *0.1;
        return rend;
    }
     public String recuperaDadosParaImpressao(){
        String dados;
        dados = "Titular: "+ nomeTitular +"\nNumero: "+numero+"\nAgencia: "+agencia+"\nSaldo: "+saldo+"$\nData de Abertura da Conta: ";
       // dados += dataDeAbertura.dia+"/"+dataDeAbertura.mes+"/"+dataDeAbertura.ano;
       dados += dataDeAbertura.formatandoData(); 
       return dados;
     }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Data getDataDeAbertura() {
        return dataDeAbertura;
    }
    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
 }
