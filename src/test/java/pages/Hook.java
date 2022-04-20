package pages;

import io.cucumber.java.AfterAll;
import utils.Driver;

public class Hook {

    @AfterAll
    public static void after_all(){
        Driver.quitDriver();
        System.out.println("after all");
    }
}
