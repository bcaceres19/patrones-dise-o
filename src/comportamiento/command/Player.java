package comportamiento.command;

public class Player {

    private int posX, posY, posZ;

    public Player(int posX, int posY, int posZ) {
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    public void moveFront(){
        posZ++;
        System.out.println("Posicion z: " + posZ);
    }

    public void moveBack(){
        posZ--;
        System.out.println("Posicion z: " + posZ);
    }

    public void moveRight(){
        posX++;
        System.out.println("Posicion x: " + posX);
    }

    public void moveLeft(){
        posX--;
        System.out.println("Posicion x: " + posX);
    }

    public void jump(){
        posY++;
        System.out.println("Player Y: " + posY);
        try {
            Thread.sleep(500);
            posY--;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Position y: " + posY);
    }

}
