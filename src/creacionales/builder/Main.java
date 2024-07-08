package creacionales.builder;

public class Main {

    public static void main(String[] args) {
        Enemigo enemigo = Enemigo.builder()
                .setArmadura(12)
                .build();
        System.out.println(enemigo);

        //1 o n(muchas condiciones NO NUMEROS) condiciones
        //Una condicion retorna ya sea false(No se cumple la condicion) o true(
        // si se cumpl) (Boleanos)
        if((3<5  && 5 > 0 && 4<2) && (3<2 && 5>4)){ //Primero se ejecutan estas condiciones

        }

        if(3.4 > 5 && (4.3 > 3 && 4 < 5)){

        }

        if(3.4 > 3 && 5.3 < 3){

        }

    }

}
