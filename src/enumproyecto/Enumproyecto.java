/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumproyecto;

/**
 *
 * @author UdeG_
 */

enum Lenguajes{
    
    JAVA(30),JAVASCRIP(35),PHP(40),C(50);
    
    private int dificultad;
    Lenguajes (){}
    Lenguajes (int dificultad){
    
    this.dificultad=dificultad;    
    }
    
    public int getDificultad() {
        return dificultad;
    }
    }

    

public class Enumproyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //System.out.println(Lenguajes.JAVA.getDificultad());
        for (Lenguajes lenguajes : Lenguajes.values()){
            System.out.println(lenguajes + "-" + lenguajes.getDificultad());
        }
        // TODO code application logic here
    }
    
}
