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
public class FriendsJUnitTest {

    public FriendsJUnitTest() {
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
    public void getFriendsCurrentId() {

        System.out.println("Test number 1 for getFriendsCurrentId method");
        String name = "Anju Paul";
        String expectedResult = "19-MAR-O-AP";

        String realResult = expense.calculator.Friends.getFriendsCurrentId(name);

        assertEquals(expectedResult, realResult);
    }
}
