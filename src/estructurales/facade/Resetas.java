package estructurales.facade;

public interface Resetas {

    static boolean getResetas(String nombre, boolean make){
        String accion  = make ? "make" : "improve";
        if(Math.random() > 0.5 ){
            System.out.println("Tienes las skills necesarias para " + accion + " el " +nombre);
            return true;
        }else{
            System.out.println("No tienes las skills necesarias para " + accion + " el " + nombre);
            return false;
        }
    }

}
