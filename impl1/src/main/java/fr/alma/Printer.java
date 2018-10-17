package fr.alma;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Printer implements IPrint{

    private static boolean isInitialized = false;

    public static IPrint init(){
        if(isInitialized){return IPrint.eINSTANCE;}
        isInitialized = true;
        return new Printer();
    }

    public void print(){
        System.out.println("Printer from impl1");
    }

    public static void main(String[] args) {
        IPrint.eINSTANCE.print(); //Ce qui doit être fait dans le main
        //IPrint pr = new Printer();
        //pr.print();
    }

}
