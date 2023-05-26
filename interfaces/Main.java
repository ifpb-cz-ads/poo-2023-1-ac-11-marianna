package interfaces;

public class Main {
    public static void main(String[] args){
        Triatleta t1 = new Triatleta("Julio");
        t1.setEndereco("Av. João Pessoa, 123");

        System.out.println("O nome do atleta é " + t1.getNome() + " e seu endereço é " + t1.getEndereco());
        t1.aquecer();
        t1.correr();
        t1.correrDeBicicleta();
        t1.nadar();
    }
}
