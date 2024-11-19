package org.demo;

public enum EnumSingleton {
    INSTANCE;

    // enum ensures only one instance is created
    // it ensures safety in case of serialization also , which other methods does not provide
    // it cannot be instantiated through reflection

    // to prevent reflection based instantiation
    /*private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Singleton instance already created! Reflection attack prevented.");
        }
    }*/

    public void someMethod(){
        System.out.println("Method in enum singleton class");
    }

    /*public static void main(String[] args) {
        // Access the single instance of SingletonEnum
        SingletonEnum singleton1 = SingletonEnum.INSTANCE;
        SingletonEnum singleton2 = SingletonEnum.INSTANCE;

        // Check if both references point to the same instance
        System.out.println(singleton1 == singleton2);  // Output: true, both references are the same

        // Calling a method on the singleton instance
        singleton1.doSomething();  // Output: Doing something with the Singleton instance.
    }*/

    // HOw we create object using reflection
    /*Class<?> singletonClass = Class.forName("Singleton");

    // Get the private constructor
    Constructor<?> constructor = singletonClass.getDeclaredConstructor();

    // Make the constructor accessible
            constructor.setAccessible(true);

    // Try to create a new instance via reflection
    Singleton instance1 = (Singleton) constructor.newInstance();*/
}
