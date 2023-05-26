package Conta;

class ContaPoupanca extends Conta implements Investimento {

    public ContaPoupanca(int numero, String nome_titular, String cpfTitular){
        super(numero, nome_titular, cpfTitular);
    }

    @Override
    public void reajustar(double percentual){
        saldo = saldo + saldo * percentual;
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
