package PegadaDeCarbono;

public class Carro implements PegadaDeCarbono{
    private String placa;

    public Carro(String placa){
        this.placa = placa;
    }
    public void setPlaca (String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public void abastece(){
        System.out.println("O carro está sendo abastecido");
    }

    @Override
    public void getPegadaDeCarbono(){
        System.out.println("O carro emite muito carbono.");
    }
}
