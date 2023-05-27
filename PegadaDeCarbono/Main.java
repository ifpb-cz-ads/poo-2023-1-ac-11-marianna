package PegadaDeCarbono;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> listaObjetos = new ArrayList<>();

        Edificio edificio = new Edificio(10);
        Carro carro = new Carro("OP34T6");
        Bicicleta bicicleta = new Bicicleta("Triangular");

        listaObjetos.add(edificio);
        listaObjetos.add(carro);
        listaObjetos.add(bicicleta);

        
        for (PegadaDeCarbono objeto : listaObjetos) {
            System.out.println("Objeto: " + objeto.getClass().getSimpleName());
            System.out.print("Pegadas de carbono: ");
            objeto.getPegadaDeCarbono();
            System.out.println("-----------------------------");
        }

    }

}
