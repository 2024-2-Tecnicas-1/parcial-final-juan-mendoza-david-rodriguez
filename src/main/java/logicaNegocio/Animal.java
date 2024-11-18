package logicaNegocio;

public abstract class Animal {

    private TipoHabitat habitat;

    public Animal(TipoHabitat habitat) {
        this.habitat = habitat;
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }

    abstract String emitirSonido();

    abstract String obtenerDieta();
}
