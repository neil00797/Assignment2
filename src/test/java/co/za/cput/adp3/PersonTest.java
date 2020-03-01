package co.za.cput.adp3;

import org.junit.*;

import javax.swing.*;

import java.util.Scanner;

import static org.junit.Assert.*;

public class PersonTest {
    Person Neil, Brandon, Johnson;

    @Before
    public void setUp(){
        Neil = new Person("Neil");
        Brandon = new Person("Neil");
        Johnson = Neil;
    }

    @After
    public void tearDown(){

    }

    //i. Test Equality
    @Test
    public void testEquality() {
        Scanner input = new Scanner(System.in);
        int expectedNum = 10;
        int actualNum = 3 + 6;

        assertEquals(expectedNum, actualNum);
    }

    //ii. Test Identity
    @Test
    public void testIdentity(){
        System.out.println(Neil.hashCode());
        System.out.println(Johnson.hashCode());

        Assert.assertTrue(Neil==Johnson);
    }
    //iii. Failing Test
    @Test
    public void failedTest(){
        fail("Test Failed");
    }

    //iv. Timeout Test
    @Test(timeout = 30000)
    public void testTimeout(){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2:"));
        int total = num1 + num2;
        JOptionPane.showMessageDialog(null,"Total = " + total);
    }

    //v. Disabling Test
    @Ignore
    @Test
    public void testIgnore(){
        int actual = 0;
        String unexpected = "0";
        assertNotSame(unexpected, actual);
    }
}
