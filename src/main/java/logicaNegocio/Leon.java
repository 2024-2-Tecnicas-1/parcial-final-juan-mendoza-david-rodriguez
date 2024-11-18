package logicaNegocio;

public class Leon extends Animal {

    private TipoHabitat habitat;

    public Leon() {
        this.habitat = TipoHabitat.TERRESTRE;
    }

    public String emitirSonido() {
        return "Rugido";
    }

    public String obtenerDieta() {
        return "Carnívoro";
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }
}
