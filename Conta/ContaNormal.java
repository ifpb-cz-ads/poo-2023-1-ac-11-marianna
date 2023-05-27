package Conta;

class ContaNormal extends Conta {

    public ContaNormal(int numero, String nome_titular, String cpfTitular){
        super(numero, nome_titular, cpfTitular);
    }

    @Override
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        else return false;
    }
}
