package Formas;

public abstract class Quadrilateros implements Forma{
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double lado4;

    public Quadrilateros(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    @Override
    public double Perimetro(){
        return this.lado1 + this.lado2 + this.lado3+ this.lado4;
    }

    @Override
    public double Area(){
        return this.lado1 * this.lado2;
    }
}
