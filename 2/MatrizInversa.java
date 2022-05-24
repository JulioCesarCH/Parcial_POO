package parcial;
import javax.swing.*;
public class MatrizInversa {
    private int A[][];
    private int T[][];
    private int f;
    private int c;
    private int val;

    public MatrizInversa()
    {
        f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Filas para la Matriz A"));

        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Columnas para la Matriz A"));

        this.A = new int[f][c];
        this.T = new int[c][f];
    }

    public void agregarMatrizA()
    {
        for (int f=0; f< this.A.length; f++)
        {
            for (int c=0; c < this.A[f].length; c++)
            {
                this.val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor para A["+f+","+c+"]"));

                this.A[f][c] = this.val;
            }
        }
    }

    public int[][] matrizInversa(int matriz[][]) {
        int det=1/determinante(matriz);
        int[][] nmatriz=matrizAdjunta(matriz);
        multiplicarMatriz(det,nmatriz);
        return nmatriz;
    }

    public int[][] matrizTranspuesta(int matriz[][]){
        int[][]nuevam=new int[matriz[0].length][matriz.length];
        for(int i=0; i<matriz.length; i++)
        {
            for(int j=0; j<matriz.length; j++)
                nuevam[i][j]=matriz[j][i];
        }
        return nuevam;
    }

    public static void multiplicarMatriz(int n, int matriz[][]) {
        for(int i=0;i<matriz.length;i++)
            for(int j=0;j<matriz.length;j++)
                matriz[i][j]*=n;
    }

    public static int[][] matrizAdjunta(int matriz[][] ){
        return matrizTranspuesta(matrizCofactores(matriz));
    }

    public static int[][] matrizCofactores(int matriz[][]){
        int[][] nm=new int[matriz.length][matriz.length];
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz.length;j++) {
                int[][] det=new int[matriz.length-1][matriz.length-1];
                int detValor;
                for(int k=0;k<matriz.length;k++) {
                    if(k!=i) {
                        for(int l=0;l<matriz.length;l++) {
                            if(l!=j){
                                int indice1=k<i ? k : k-1 ;
                                int indice2=l<j ? l : l-1 ;
                                det[indice1][indice2]=matriz[k][l];
                            }
                        }
                    }
                }
                detValor=determinante(det);
                nm[i][j]=detValor * (int)Math.pow(-1, i+j+2);
            }
        }
        return nm;
    }

    public static int determinante(int matriz[][]){
        int det;
        if(matriz.length==2){
            det=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
            return det;
        }
        int suma=0;
        for(int i=0; i<matriz.length; i++){
        int[][] nm=new int[matriz.length-1][matriz.length-1];
            for(int j=0; j<matriz.length; j++){
                if(j!=i){
                    for(int k=1; k<matriz.length; k++){
                        int indice=-1;
                        if(j<i)
                            indice=j;
                        else if(j>i)
                            indice=j-1;
                            nm[indice][k-1]=matriz[j][k];
                    }
                }
            }
            if(i%2==0)
                suma+=matriz[i][0] * determinante(nm);
            else
                suma-=matriz[i][0] * determinante(nm);
        }
        return suma;
    }



    public void mostrarMatrizTranspuesta()
    {   
        this.matrizTranspuesta(A);
        this.matrizInversa(A);

        for(int f=0; f < this.T.length; f++)
        {    
            // MATRIZ A
            for(int c=0; c < this.A[f].length; c++)
            {   
                System.out.printf("%5d ", this.A[f][c]);
            }
          System.out.print(" | ");
            //MATRIz TRANSPUESTA
            for(int c=0; c < this.T[f].length; c++)
            {   
                System.out.printf("%5d ", this.T[f][c]);
            }
          System.out.print(" | ");
          System.out.println();
        }
    }

    public static void main(String args[])
    {
        MatrizInversa matriztranspuesta = new MatrizInversa();
        matriztranspuesta.agregarMatrizA();
        System.out.println("\t\tA\t\ttranspuesta");
        for (int x = 0; x < 62; x++) {
            System.out.print("_");
        }
        matriztranspuesta.mostrarMatrizTranspuesta();
    }
}
