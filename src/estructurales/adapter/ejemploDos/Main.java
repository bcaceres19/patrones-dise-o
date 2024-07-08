package estructurales.adapter.ejemploDos;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Motor motor;

    public static void main(String[] args) {
        System.out.println("");
        int opcion;
        do{
            opcion = preguntarOpcion();
            switch(opcion) {

                case 1:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;
                case 2:
                    motor = new MotorElectricoAdapter();
                    usarMotor();
                    break;
                case 3:
                    System.out.println("¡Cerrando programa!");
                    break;
                default:
                    System.out.println("La opción ingresada NO es válida.");
            }
            System.out.print("\n\n");
        }while(opcion!=4);
    }

    private static int preguntarOpcion() {
        System.out.print(
                "MENÚ DE OPCIONES\n"
                        +"---- -- --------\n"
                        +"1. Encender motor económico.\n"
                        +"2. Encender motor eléctrico.\n"
                        +"3. Salir.\n"
                        +"Seleccione opción: "
        );
        return Integer.parseInt( scanner.nextLine() );
    }

    private static void usarMotor() {
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

}
