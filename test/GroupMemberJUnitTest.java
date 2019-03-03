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
 * @author 1895250
 */
public class GroupMemberJUnitTest {
    
    public GroupMemberJUnitTest() {
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
     public void getGroupMemberCurrentId() {
        
        
         System.out.println("Test for getGroupMemberCurrentId method in bill class");
         String name = "Anju Paul";
         String expectedResult="19-MAR-O-AP";
         
        
         String realResult=expense.calculator.GroupMember.getGroupMemberCurrentId(name);
         
         assertEquals(expectedResult,realResult);
     }
}
