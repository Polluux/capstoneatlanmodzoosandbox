package fr.alma;

public class Printer implements IPrint {

    private boolean isInitialized = false;

    public IPrint init(){
        if(isInitialized){return IPrint.eINSTANCE;}
        return this;
    }

    public void print() {
        System.out.println("Printer from impl2");
    }

    public static void main(String[] args) {
        //IPrint.eINSTANCE.print(); //Ce qui doit être fait dans le main
        IPrint pr = new Printer();
        pr.print();
    }

}
