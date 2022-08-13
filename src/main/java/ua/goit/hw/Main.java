package ua.goit.hw;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Product> product = new ArrayList<>();

    public static void main(String[] args) {
        initDate();
        System.out.println(product.toString());

    }

    public static Double calculateTotalCost(String inputDate){
        return null;
    }

    public static void initDate(){
        product.add(new Product("A",1.25, 3,3.00));
        product.add(new Product("B",4.25, 0,0.00));
        product.add(new Product("C",1.00, 6,5.00));
        product.add(new Product("D",0.75, 0,0.00));
    }

}
