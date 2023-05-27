package PegadaDeCarbono;

public class Bicicleta implements PegadaDeCarbono{
    private String formatoCela;

    public Bicicleta(String formatoCela){
        this.formatoCela = formatoCela;
    }

    public void setFormato (String formato){
        this.formatoCela = formato;
    }

    public String getFormato(){
        return formatoCela;
    }

    public void pedala(){
        System.out.println("O ciclista está pedalando");
    }

    @Override
    public void getPegadaDeCarbono(){
        System.out.println("A bicicleta não emite carbono diretamente.");
    }
}
