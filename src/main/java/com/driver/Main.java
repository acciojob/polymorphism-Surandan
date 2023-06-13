package com.driver;
class Product {
      public int product(int x,int y) {
          return x*y;
      }
    public double product(double x,double y) {
        return x*y;
    }
    public int product(int x,int y,int z) {
        return x*y*z;
    }
}
public class Main {
     public static void main(String args[]) {
         Product p = new Product();
         double a = 3.0;
         double b = 4.0;
         int x = 3;
         int y = 4;
         int z = 5;
         System.out.println(p.product(x,y));
         System.out.println(p.product(3,4,5));
         System.out.println(p.product(a,b));
     }
}