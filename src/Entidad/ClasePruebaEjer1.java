
package Entidad;


public class ClasePruebaEjer1 {
    public int[] crearVector(){
        int vectorPrueba [] = new int [10];
        return vectorPrueba;
    }
    
    public void llenarVector(int vectorPrueba[]){
        for (int i = 0; i < 15; i++) {
            vectorPrueba[i]=i+1; 
        }
    }
}
