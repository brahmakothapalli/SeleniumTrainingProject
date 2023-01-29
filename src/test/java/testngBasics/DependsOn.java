package testngBasics;

import org.testng.annotations.Test;

public class DependsOn {

    @Test(priority = 1)
    public void setUp(){
        System.out.println("SetUp");
    }


    @Test(priority = 2)
    public void addingProductToCart(){
        System.out.println("Customer adding the products "); //--
//        assert false;
    }

    @Test(priority = 3, dependsOnMethods = {"setUp", "addingProductToCart"}) // -- multiple tests
    public void placeOrder(){

        System.out.println("Customer Placing the Order");
    }

    @Test(dependsOnMethods = {"placeOrder"})
    public void sendInvoice(){
        System.out.println("Sending Invoice to customer");
    }
}
