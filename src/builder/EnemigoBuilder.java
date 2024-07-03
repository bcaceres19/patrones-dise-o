package builder;

public class EnemigoBuilder {

    private int edad;

    private String nombre;

    private int dano;

    private int salud;

    private int armadura;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDano() {
        return dano;
    }

    public int getSalud() {
        return salud;
    }

    public int getArmadura() {
        return armadura;
    }

    public EnemigoBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public EnemigoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EnemigoBuilder setDano(int dano) {
        this.dano = dano;
        return this;
    }

    public EnemigoBuilder setSalud(int salud) {
        this.salud = salud;
        return this;
    }

    public EnemigoBuilder setArmadura(int armadura) {
        this.armadura = armadura;
        return this;
    }

    public Enemigo build() {
        Enemigo enemigo = new Enemigo();
        enemigo.setNombre(getNombre());
        enemigo.setEdad(getEdad());
        enemigo.setArmadura(getArmadura());
        enemigo.setDano(getDano());
        enemigo.setSalud(getSalud());
        return enemigo;
    }
}
