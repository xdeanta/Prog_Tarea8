/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea8;

import java.util.Arrays;


/**
 *
 * @author Xavier
 */
public class OperacionesGenericas {
    public static <T extends Comparable<T>> T max(T[] args){
        T max = args[0];
        for(int i=0;i<args.length;i++){
            if(args[i].compareTo(max) > 0){
                max=args[i];
            }
        }
        return max;
    }
    public static <T extends Comparable<T>> T min(T[] args){
        T max = args[0];
        for(int i=0;i<args.length;i++){
            if(args[i].compareTo(max) < 0){
                max=args[i];
            }
        }
        return max;
    }
    public static <E> int exists(E[] args, E element){
        for(int i=0;i<args.length;i++){
            if(args[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
    public static <E> E pop(E[] args, E element){
        int index = exists(args,element);
        int j=0;
        E borrado=null;
        if(index >= 0){
            for(int i=0;i<args.length;i++){
                if(i==index){
                    borrado=args[i];
                    continue;
                }
                args[j]=args[i];
                j++;
            }
            args[args.length-1]=null;
            return borrado;
        }
        return null;
    }
}
