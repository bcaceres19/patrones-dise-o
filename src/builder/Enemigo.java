package builder;


//@Builder Anotacion de lombock para el builder
public class Enemigo {

    private int edad;

    private String nombre;

   private int dano;

   private int salud;

   private int armadura;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public static EnemigoBuilder builder(){
        return new EnemigoBuilder();
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", dano=" + dano +
                ", salud=" + salud +
                ", armadura=" + armadura +
                '}';
    }
}
