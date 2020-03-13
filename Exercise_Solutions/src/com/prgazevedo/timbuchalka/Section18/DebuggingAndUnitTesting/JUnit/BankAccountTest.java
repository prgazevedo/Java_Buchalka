package com.prgazevedo.timbuchalka.Section18.DebuggingAndUnitTesting.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests using JUnit
 * -Assure JUnit is installed
 * -Alt-Enter over the class Name -> generate test
 * -Correct errors by allowing auto import of libraries
 * - add fails and asserts
 * -Either run all tests by changing context to the Test class
 * -Run each test
 *
 * Useful asserts:
 *  - assertNotEquals()
 *  - assertArrayEquals() links and elements are the same
 *  - assertNULL and assertNotNull
 *  - assertSame and assertNotSame() obj are the same
 *  - assertThat compares actual value agains a matcher
 *
 * @url {https://stackoverflow.com/questions/20295578/difference-between-before-beforeclass-beforeeach-and-beforeall}
 *  +-------------------------------------------------------------------------------------------------------+
 * ¦                                       Feature                            ¦   Junit 4    ¦   Junit 5   ¦
 * ¦--------------------------------------------------------------------------+--------------+-------------¦
 * ¦ Execute before all test methods of the class are executed.               ¦ @BeforeClass ¦ @BeforeAll  ¦
 * ¦ Used with static method.                                                 ¦              ¦             ¦
 * ¦ For example, This method could contain some initialization code          ¦              ¦             ¦
 * ¦-------------------------------------------------------------------------------------------------------¦
 * ¦ Execute after all test methods in the current class.                     ¦ @AfterClass  ¦ @AfterAll   ¦
 * ¦ Used with static method.                                                 ¦              ¦             ¦
 * ¦ For example, This method could contain some cleanup code.                ¦              ¦             ¦
 * ¦-------------------------------------------------------------------------------------------------------¦
 * ¦ Execute before each test method.                                         ¦ @Before      ¦ @BeforeEach ¦
 * ¦ Used with non-static method.                                             ¦              ¦             ¦
 * ¦ For example, to reinitialize some class attributes used by the methods.  ¦              ¦             ¦
 * ¦-------------------------------------------------------------------------------------------------------¦
 * ¦ Execute after each test method.                                          ¦ @After       ¦ @AfterEach  ¦
 * ¦ Used with non-static method.                                             ¦              ¦             ¦
 * ¦ For example, to roll back database modifications.                        ¦              ¦             ¦
 * +-------------------------------------------------------------------------------------------------------+
 */

class BankAccountTest {
    private BankAccount account;
    private static int count;

    @org.junit.jupiter.api.BeforeAll
    public static void setupAll(){

        System.out.println("Setup All the test");
        System.out.println("Count = "+count++);
    }


    @org.junit.jupiter.api.BeforeEach
    public void setupEach(){
        System.out.println("Running a test");
        account = new BankAccount("Me","Last Name",1000, BankAccount.TYPE_ACCOUNT.CHECKING);
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = account.deposit(200,true);
        /**
         * The delta parameter is to allow some leeway in the return value: balance
         */
        assertEquals(1200,balance,0);
        assertEquals(1200,account.getBalance(),0);
    }


    @org.junit.jupiter.api.Test
    void withdraw_branch() {
        double balance = account.withdraw(600,true);
        assertEquals(400,account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test //(expected = IllegalArgumentException.class) only works in JUnit4
    void withdraw_not_branch() {
        //double balance = account.withdraw(600,false);
        //assertEquals(400,account.getBalance(),0);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {account.withdraw(600.00, false);});
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {

        account.deposit(200,true);
        assertEquals(1200,account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdrawal() {

        account.withdraw(200,true);
        assertEquals(800,account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() {
        assertTrue(account.isChecking(), "The account is not checking account");
    }

    @org.junit.jupiter.api.AfterEach
    public void AfterMethod(){
        System.out.println("This executes after the test cases");
        System.out.println("Count = "+count++);
    }

    @org.junit.jupiter.api.AfterAll
    public static void AfterClass(){
        System.out.println("This executes after All the test cases");
        System.out.println("Count = "+count++);
    }
    //    @org.junit.jupiter.api.Test
//    public void dummyTest(){
//        assertEquals(20,21);
//    }
}