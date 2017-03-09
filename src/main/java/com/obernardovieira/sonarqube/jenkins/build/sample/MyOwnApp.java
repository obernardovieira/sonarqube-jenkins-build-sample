package com.obernardovieira.sonarqube.jenkins.build.sample;

import java.util.logging.Level;
import java.util.logging.Logger;

class ParentClass
{
    public boolean doSomething() { return false; }
}
class FirstChildClass extends ParentClass
{
    public boolean doSomething() { return true; }  // Noncompliant
}

public class MyOwnApp
{
    private final static Logger LOGGER =
            Logger.getLogger(MyOwnApp.class.getName());
    
    private MyOwnApp()
    {
        throw new IllegalAccessError("Utility class");
    }

    public static void main(String[] args) throws Exception
    {
        doSomething();
    }
    
    public static void doSomething()
    {
        LOGGER.log(Level.SEVERE, "Hello World!");
    }
}
