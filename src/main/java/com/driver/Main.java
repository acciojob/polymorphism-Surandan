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
         p.product(x,y);
         p.product(3,4,5);
         p.product(a,b);
     }
}