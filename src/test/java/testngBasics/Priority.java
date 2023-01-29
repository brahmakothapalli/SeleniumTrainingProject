package testngBasics;

import org.testng.annotations.Test;

public class Priority {

    // order of execution in TestNG
    // If order not specified -- Tests will be executed in Alphabetical order
    // default priority -- 0

    @Test(priority = 1)
    public void launchBrowsers(){
        System.out.println("launchBrowsers");
    }

    @Test(priority = 2)
    public void launchingApp(){
        System.out.println("launchingApp");
    }

    @Test(priority = 3)
    public void login(){
        System.out.println("login");
    }

    @Test(priority = 4)
    public void searchProduct(){
        System.out.println("searchProduct");
    }

    @Test(priority = 5)
    public void addToCart(){
        System.out.println("addToCart");
    }

    @Test(priority = 6)
    public void placeOrder(){
        System.out.println("placeOrder");
    }

    @Test(priority = 7)
    public void logout(){
        System.out.println("logout");
    }

}
