package creational.singleton.BreakSingleton;

import creational.singleton.lazyloading.LoggerInstanceLazy;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WayToBreakSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, CloneNotSupportedException {

        LoggerInstanceLazy originalInstance = LoggerInstanceLazy.getInstance();
        LoggerInstanceLazy duplicateInstance = LoggerInstanceLazy.getInstance();

        System.out.println("Original Instance for singleton: "+ originalInstance.hashCode());
        System.out.println("Duplicate Instance for singleton: "+duplicateInstance.hashCode());

        //Break using Reflection
        System.out.println("Break Singleton using reflection");
        Class<?> singletonClass = Class.forName("creational.singleton.lazyloading.LoggerInstanceLazy");
        Constructor<LoggerInstanceLazy> constructor = (Constructor<LoggerInstanceLazy>) singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LoggerInstanceLazy brokenUsingReflection = constructor.newInstance();

        System.out.println("Original Instance for singleton: "+originalInstance.hashCode());
        System.out.println("Broken using reflection: "+brokenUsingReflection.hashCode());

        //Break using Serialization
        System.out.println();
        System.out.println("Break Using Serialization");

        //serialization process
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\serialization.ser"));
        objectOutputStream.writeObject( originalInstance);
        objectOutputStream.close();

        //deserialization
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\serialization.ser"));
        LoggerInstanceLazy brokenUsingSerialization = (LoggerInstanceLazy) objectInputStream.readObject();

        System.out.println("Original Instance for singleton: "+originalInstance.hashCode());
        System.out.println("Broken using Serialization: "+brokenUsingSerialization.hashCode());


        //Break using clone
        System.out.println();
        System.out.println("Break Using Clone");
        LoggerInstanceLazy brokenUsingClone = (LoggerInstanceLazy) originalInstance.clone();

        System.out.println("Original Instance for singleton: "+originalInstance.hashCode());
        System.out.println("Broken using Cloning: "+brokenUsingClone.hashCode());









    }
}
