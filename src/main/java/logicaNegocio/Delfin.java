package logicaNegocio;

public class Delfin extends Animal {

    public Delfin() {
        super(TipoHabitat.ACUATICO); 
    }

    @Override
    public String emitirSonido() {
        return "Silbido";  
    }

    @Override
    public String obtenerDieta() {
        return "Piscívoro";
    }
}

