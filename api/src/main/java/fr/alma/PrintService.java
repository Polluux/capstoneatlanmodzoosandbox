package fr.alma;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.inject.Inject;

public class PrintService {

    @Inject
    IPrint printer;

    PrintService(){
        initialize();
    }

    public IPrint getPrinter() {
        return printer;
    }

    private void initialize() {
        WeldContainer weld = new Weld().initialize();
        try {
            printer = weld.select(IPrint.class).get();
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
    }
}
