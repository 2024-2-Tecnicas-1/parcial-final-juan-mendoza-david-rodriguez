package logicaNegocio;

public class Delfin extends Animal {

    public Delfin() {
        super(TipoHabitat.ACUATICO); 
    }

    public String emitirSonido() {
        return "Silbido";  
    }

    public String obtenerDieta() {
        return "Piscívoro";
    }
}

