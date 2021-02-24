package com.argen;

public class Main {

    public static void main(String[] args) {
        int age , temperature;
        System.out.println(method(45,10));
        System.out.println(method(20,-10));
        System.out.println(method(10 , 0));
        System.out.println(method(40,15));
        System.out.println(method(24, 13));

    }
    public static String method (int age , int temperature){
        if (age > 20 && age < 45 && temperature >- 20 && temperature<30){
            return " можно идти гулять";
        }
        else if(age < 20 && temperature > 0 && temperature > 28 ){
            return  " можно идти гулять ";
        }
        else if (age>45 && temperature >- 10 && temperature < 25){
            return " можно идти гулять ";
        }
        else{
            return " оставайтесь дома";
        }
    }
}
