/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea8;

/**
 *
 * @author Xavier
 */
public class Tarea8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] array = new Integer[10];
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*10);
            System.out.println("Array[" + i +"]:" + array[i]);
        }
        System.out.println("max: " + OperacionesGenericas.max(array));
        System.out.println("min: " + OperacionesGenericas.min(array));
        System.out.println("Posicion de 5: " + OperacionesGenericas.exists(array,5));
        System.out.println("Elemento borrado: " + OperacionesGenericas.pop(array, 5));
        for(int i=0;i<array.length;i++){
            System.out.println("Array[" + i +"]:" + array[i]);
        }
    }
    
}
