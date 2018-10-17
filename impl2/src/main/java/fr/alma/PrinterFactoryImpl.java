package fr.alma;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

public class PrinterFactoryImpl implements PrinterFactory {

    @Produces @Default
    public IPrint createPrinter() {
        return Printer.init();
    }
}
