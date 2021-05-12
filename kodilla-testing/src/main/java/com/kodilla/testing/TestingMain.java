package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
       SimpleUser simpleUser = new SimpleUser("theForumUser");
       String result = simpleUser.getUsername();

       if (result.equals("theForumUser")){
           System.out.println("test OK");
       }
       else {
           System.out.println("Error");
       }
        Calculator calculator = new Calculator();
       int add = calculator.add(50,3);
       int sub = calculator.substract(100,1);

       if (add == 53){
           System.out.println("Works good");
       }
       else {
           System.out.println("Error");
       }
       if (sub == 99){
           System.out.println("Works good");
       }
       else{
           System.out.println("Error");
       }
    }
}
