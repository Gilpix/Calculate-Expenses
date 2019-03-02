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
public class GroupJUnitTest {
    
    public GroupJUnitTest() {
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
     public void getGroupCurrentId() {
        
        
         System.out.println("Test for getGroupCurrentId method in bill class");
         String name = "raminder Singh";
         Calendar cal = Calendar.getInstance();
         
         String expectedResult="19-MAR-E-RS";
         
        
         String realResult=expense.calculator.Groups.getGroupCurrentId(name);
         
         assertEquals(expectedResult,realResult);
     }
}
