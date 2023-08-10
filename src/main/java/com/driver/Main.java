package com.driver;

public class Main {
    static class Product {
        public Product() {
        }

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();

        p.product(3, 5);
        p.product(3, 5, 4);
        p.product(4.5 , 5.5);

//        int f1 = p.product(3, 5);
//        int f2 = p.product(3, 5, 4);
//        double f3 = p.product(4.5 , 5.5);
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);
    }

}
