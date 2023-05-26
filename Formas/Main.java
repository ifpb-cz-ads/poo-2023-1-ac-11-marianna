package Formas;

import java.util.ArrayList;
public class Main {
    public static void main (String[] args){
        Quadrado q1 = new Quadrado(30);
        Retangulo r1 = new Retangulo(15, 27);
        Circulo c1 = new Circulo(38);

        ArrayList<Forma> listaObjetos = new ArrayList<>();

        listaObjetos.add(q1);
        listaObjetos.add(r1);
        listaObjetos.add(c1);

        for (Forma objeto: listaObjetos){
            System.out.println("Objeto: " + objeto.getClass().getSimpleName());
        
            if ( objeto instanceof Retangulo ) {
                Retangulo ret = (Retangulo) objeto;
                System.out.println("Base: " + ret.getBase());
                System.out.println("Altura: " + ret.getAltura());
            } else if (objeto instanceof Quadrado) {
                Quadrado quad = (Quadrado) objeto;
                System.out.println("Lado: " + quad.getLado());
            } else if (objeto instanceof Circulo) {
                Circulo circ = (Circulo) objeto;
                System.out.println("Raio: " + circ.getRaio());
            }

            System.out.println("Perímetro: " + objeto.Perimetro());
            System.out.println("Área: " + objeto.Area());
            
            System.out.println("-----------------------------");
        }
    }
}
