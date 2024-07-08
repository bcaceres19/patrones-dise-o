package estructurales.adapter.ejemploDos;

public class MotorElectricoAdapter extends Motor{

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        this.motorElectrico = new MotorElectrico();
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor electrico adapter...");
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico adapter...");
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico adapter...");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}
