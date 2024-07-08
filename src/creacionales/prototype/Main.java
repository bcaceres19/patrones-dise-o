package creacionales.prototype;

public class Main {

    public static void main(String[] args) {
        Guerrero guerroUno =  new Guerrero(100,100,100);
        Guerrero guerroDos =  (Guerrero) guerroUno.clone();
        System.out.println(guerroUno);
        System.out.println(guerroDos);
        guerroDos.setSalud(0);
        System.out.println(guerroUno);
        System.out.println(guerroDos);
    }


}
