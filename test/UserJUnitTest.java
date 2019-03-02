/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author temp
 */
public class UserJUnitTest {
    
    public UserJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getUserCurrentId() {
        
        
         System.out.println("Test number 1 for getUserCurrentId method");
         String firstName = "Anju";
         String lastName ="Paul";
         char fN=lastName.charAt(0);
         char lN=lastName.charAt(0);
         
         String expectedResult="19-MAR-E-AP";
         
        
         String realResult=expense.calculator.User.getUserCurrentId(firstName,lastName);
         
         assertEquals(expectedResult,realResult);
    
    }
}
