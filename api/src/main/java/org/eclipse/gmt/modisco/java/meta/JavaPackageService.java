package org.eclipse.gmt.modisco.java.meta;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.inject.Inject;

public class JavaPackageService {

    @Inject
    JavaPackage eINSTANCE;

    JavaPackageService(){initialize();}

    public JavaPackage getPackage(){return eINSTANCE;}

    private void initialize() {
        WeldContainer weld = new Weld().initialize();
        try {
            eINSTANCE = weld.select(JavaPackage.class).get();
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
    }
}
