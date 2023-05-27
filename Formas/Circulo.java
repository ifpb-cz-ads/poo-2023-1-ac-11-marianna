package Formas;

public class Circulo implements Forma {
    private double raio;

    public Circulo (double raio){
        this.raio = raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    @Override
    public double Perimetro(){
        return 2 * Math.PI * this.raio;
    }

    @Override
    public double Area(){
        return Math.PI * Math.pow(this.raio, 2);
    }
}
