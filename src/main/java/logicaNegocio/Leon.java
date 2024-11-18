package logicaNegocio;

public class Leon extends Animal {

    public Leon() {
        super(TipoHabitat.TERRESTRE);
    }
   
    public String emitirSonido() {
        return "Rugido"; 
    }

    public String obtenerDieta() {
        return "Carnívoro"; 
    }
}

