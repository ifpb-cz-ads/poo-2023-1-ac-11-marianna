package PegadaDeCarbono;

public class Edificio implements PegadaDeCarbono {
    private int andares;

    public Edificio (int andares){
        this.andares = andares;
    }

    public void setAndares (int andares){
        this.andares = andares;
    }

    public int getAndares(){
        return andares;
    }

    public void elevador(){
        System.out.println("O elevador do prédio está subindo");
    }

    @Override
    public void getPegadaDeCarbono(){
        System.out.println("As pegadas de carbono de um edificio dependem de seu consumo de energia, entre outros fatores.");
    }
}
