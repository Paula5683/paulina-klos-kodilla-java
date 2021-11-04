package com.kodilla.kodillahibernate.manytomany.facade;

public class SearchingException extends Exception{

    public static String EMPLOYEE_NOT_FOUND = "The Employee not found";
    public static String COMPANY_NOT_FOUND = "The company not found";

    public SearchingException (String message){
        super(message);
    }
}
