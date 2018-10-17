package org.eclipse.gmt.modisco.java.neoemf.meta;

import org.eclipse.gmt.modisco.java.neoemf.impl.JavaPackageImpl;
import org.eclipse.gmt.modisco.java.meta.JavaPackage;
import org.eclipse.gmt.modisco.java.meta.JavaPackageFactory;

import javax.enterprise.inject.Produces;

public class JavaPackageFactoryImpl implements JavaPackageFactory{

    @Produces
    public JavaPackage createJavaPackage() {
        return JavaPackageImpl.init();
    }

}
