package estructurales.facade;

public class FachadaHerreria {


    public void trabajo(String nombre, boolean make) {
        if(make){
            Forja forja = new Forja();
            forja.trabajo(nombre);
            if(Resetas.getResetas(nombre, make)){
                if(!forja.buscar(nombre)){
                    return;
                }
                forja.remover(nombre);
                forja.trabajo(nombre);
                System.out.println("Ha sido creado " + nombre);
            }else{
                System.out.println("No ha sido posble " + forja.ACCION + " el " + nombre);
            }
        }else{
            BancoTrabajo bancoTrabajo = new BancoTrabajo();
            bancoTrabajo.trabajo(nombre);
            if(Resetas.getResetas(nombre, make)){
                if(!bancoTrabajo.buscar(nombre)){
                    return;
                }
                bancoTrabajo.remover(nombre);
                bancoTrabajo.trabajo(nombre);
                System.out.println("Ha sido creado " + nombre);
            }else{
                System.out.println("No ha sido posble el " + nombre);
            }
        }
    }

}
