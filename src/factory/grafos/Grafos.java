package factory.grafos;

import java.util.Scanner;

public class Grafos {

    private int[][] aristas;
    private int[][] copiris;
    Scanner sc = new Scanner(System.in);

    public Grafos(int n) {
        this.aristas = new int[n][n];
        this.copiris = new int[n][n];
    }

    public int[][] getCopiris() {
        return copiris;
    }

    public void setCopiris(int[][] copiris) {
        this.copiris = copiris;
    }
    public void ponderadoNODir() {
        //System.out.println("digite el valor de las lineas digite \"s\" en caso haya relacion");
        //Zona I
        aristas[0][0] = 0;
        aristas[0][1] = 9;
        aristas[0][2] = 0;
        aristas[0][3] = 2;
        aristas[0][4] = 0;
        aristas[0][5] = 0;
        aristas[0][6] = 0;
        aristas[0][7] = 0;
        //Zona A
        aristas[1][0] = 9;
        aristas[1][1] = 0;
        aristas[1][2] = 1;
        aristas[1][3] = 0;
        aristas[1][4] = 1;
        aristas[1][5] = 0;
        aristas[1][6] = 0;
        aristas[1][7] = 0;
        //Zona  B
        aristas[2][0] = 0;
        aristas[2][1] = 1;
        aristas[2][2] = 0;
        aristas[2][3] = 1;
        aristas[2][4] = 7;
        aristas[2][5] = 0;
        aristas[2][6] = 6;
        aristas[2][7] = 0;
        //Zona C
        aristas[3][0] = 2;
        aristas[3][1] = 0;
        aristas[3][2] = 1;
        aristas[3][3] = 0;
        aristas[3][4] = 0;
        aristas[3][5] = 0;
        aristas[3][6] = 10;
        aristas[3][7] = 0;
        //Zona D
        aristas[4][0] = 0;
        aristas[4][1] = 1;
        aristas[4][2] = 7;
        aristas[4][3] = 0;
        aristas[4][4] = 0;
        aristas[4][5] = 2;
        aristas[4][6] = 0;
        aristas[4][7] = 18;
        //Zona E
        aristas[5][0] = 0;
        aristas[5][1] = 0;
        aristas[5][2] = 0;
        aristas[5][3] = 0;
        aristas[5][4] = 2;
        aristas[5][5] = 0;
        aristas[5][6] = 0;
        aristas[5][7] = 9;
        //Zona F
        aristas[6][0] = 0;
        aristas[6][1] = 0;
        aristas[6][2] = 6;
        aristas[6][3] = 10;
        aristas[6][4] = 0;
        aristas[6][5] = 0;
        aristas[6][6] = 0;
        aristas[6][7] = 2;
        //Zona T
        aristas[7][0] = 0;
        aristas[7][1] = 0;
        aristas[7][2] = 0;
        aristas[7][3] = 0;
        aristas[7][4] = 18;
        aristas[7][5] = 9;
        aristas[7][6] = 2;
        aristas[7][7] = 0;
        copiris = aristas;
        System.out.println();
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < aristas.length; i++) {
            for (int j = 0; j < aristas[0].length; j++) {
                s+=aristas[i][j]+"\t";
            }
            s+="\n";
        }
        return s ;
    }
    public void volverLlenar() {
        for (int i = 0; i < aristas.length; i++) {
            for (int j = i; j < aristas[0].length; j++) {
                copiris[i][j]= copiris[j][i] = aristas[i][j];
            }
        }
    }
    public Dijkstra dijkstra(int vertice, int fin, int trae,String suple, Dijkstra a) {
        if (copiris[vertice][fin]!=0 && a.getCantidad()>copiris[vertice][fin]+trae) {
            a.setCantidad(copiris[vertice][fin]+trae);
            copiris[vertice][fin]=copiris[fin][vertice]=0;
            a.setRecorrido(suple);
        }

        for (int i = 0; i < copiris.length; i++) {	//for en 1
            if (copiris[vertice][i]!=0 && a.getCantidad()>(copiris[vertice][i]+trae) ) {
                int tempo =	copiris[vertice][i]+trae;
                copiris[vertice][i] = copiris[i][vertice] = 0;//eliminando
                String suple2= suple+" "+i+" ";			//reemplaza valores
                a=dijkstra(i, fin, tempo,suple2, a);
            }
        }
        volverLlenar();
        return a;
    }

}
