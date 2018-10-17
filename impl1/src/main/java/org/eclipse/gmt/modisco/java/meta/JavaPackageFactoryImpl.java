package org.eclipse.gmt.modisco.java.meta;

import org.eclipse.gmt.modisco.java.impl.JavaPackageImpl;

import javax.enterprise.inject.Produces;

public class JavaPackageFactoryImpl implements JavaPackageFactory{

    @Produces
    public JavaPackage createJavaPackage() {
        return JavaPackageImpl.init();
    }

}
