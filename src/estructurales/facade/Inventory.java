package estructurales.facade;

public interface Inventory {

    static boolean busqueda(String nombre, boolean make){
        String accion  = make ? "make" : "improve";
        if(Math.random() > 0.5 ){
            System.out.println("Tienes los materiales necesarias para " + accion + " el " +nombre);
            return true;
        }else{
            System.out.println("No tienes los materiales necesarias para " + accion + " el " + nombre);
            return false;
        }
    }

    static void remover(String nombre, boolean make){
        String accion  = make ? "make" : "improve";
        System.out.println("Eliminando..");
    }

}
