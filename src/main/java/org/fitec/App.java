package org.fitec;

import org.apache.commons.lang.RandomStringUtils;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App 
{
    public int addition(int a, int b){

        return(a+b);
    }

    public int modulo(int a, int b){

        return(a/b);
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String studentsNumber = ResourceBundle.getBundle("param").getString( "students.Number");
        String date = ResourceBundle.getBundle("param").getString("date");
        System.out.println("Student Number =" + studentsNumber);
        System.out.println("la date est " +date);
        String random= RandomStringUtils.randomNumeric(10);
        System.out.println("chaine = " +random);
    }
}
