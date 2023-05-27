package Conta;

public abstract class Conta {

    private int numero;
    private Cliente nome_titular;
    protected double saldo;

    public Conta(int numero, String nome_titular, String cpfTitular){
        this.numero = numero;
        this.nome_titular = new Cliente(nome_titular, cpfTitular);
        this.saldo = 0;
    }

    public void depositar(double valor){
        this.saldo = this.getSaldo() + valor;
    }

    public abstract boolean sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
    public int getNumero() {
        return numero;
    }
    public Cliente getNome_titular() {
        return nome_titular;
    }
        
    public void setNome_titular (Cliente nome_titular){
        this.nome_titular = nome_titular;
    }
}