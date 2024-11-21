package testNG.annotation.demo;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupDemo {

    @BeforeGroups({"database","ui"})
    public void setupDatabase() {
        System.out.println("Setting up database connection...");
    }

    @AfterGroups({"database","ui"})
    public void teardownDatabase() {
        System.out.println("Closing database connection...");
    }

    @Test(groups = "database")
    public void testDatabaseInsert() {
        System.out.println("Testing database insert...");
    }


    @Test(groups = "ui")
    public void testUIHomePage() {
        System.out.println("Testing UI home page...");
    }
}

