package org.demo;

public class BillPughSingleton {

   private BillPughSingleton(){
   }

   // instance is static it will only be created once when class is loaded
   private static class SingletonHelper{
       private static final BillPughSingleton INSTANCE = new BillPughSingleton();
   }

   public static BillPughSingleton getInstance(){
       return SingletonHelper.INSTANCE;
   }


}
