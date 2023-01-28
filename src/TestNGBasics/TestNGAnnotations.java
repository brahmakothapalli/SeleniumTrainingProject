package TestNGBasics;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeClass
    public void DbConnection(){

        System.out.println("Connection DB/3rd party tool");
    }

    //@beforeMethod - executed before each test method
    @BeforeMethod
    public void SetUp(){
        System.out.println("Open the application \n");
    }

    @Test
    public void LoginTest(){
        System.out.println("I am 1st Test \n");
        System.out.println("Login Successful");

    }

    @Test
    public void SendAnEmail(){
        System.out.println("I am 2nd Test \n");
        System.out.println("Email Sent Successful");
    }

    @Test
    public void CheckPayments(){
        System.out.println("Rare action -- connection thrird party tool/DB connection");
    }

    @Test
    public void Checkout(){

        System.out.println("Rare action -- connection thrird party tool/DB connection");

    }

    // @AfterMethod -- executed after each test method
    @AfterMethod
    public void WindUp(){
        System.out.println("Logout");
        System.out.println("Update the result");
    }

    @AfterClass
    public void WindClass(){
        System.out.println("After Class Execution");
    }

}
