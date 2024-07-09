package comportamiento.templateMethod.ejemploDos;

public abstract class EnemyTemplate {

    public abstract void setSkills();

    public abstract void attack();

    public abstract void protect();

    public abstract void resultd();

    public final void template(){
        setSkills();
        attack();
        protect();
        resultd();
    }

}
