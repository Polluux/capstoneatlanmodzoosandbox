package fr.alma;

public interface IPrint {

    IPrint eINSTANCE = new PrintService().getPrinter();

    void print();

}
