package com.prgazevedo.timbuchalka.Section18.DebuggingAndUnitTesting.JUnit;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTestParameterized {

    private BankAccount account;

    @org.junit.jupiter.api.BeforeEach
    public void setup(){
        account = new BankAccount("Me","Last",1000, BankAccount.TYPE_ACCOUNT.CHECKING);
        System.out.println("Run a test");
    }

    private static Collection<Object[]> testConditions()
    {
        return Arrays.asList(new Object[][]
                {
                        {100.0, true, 1100.0},
                        {200.0, true, 1200.0},
                        {325.14, true, 1325.14},
                        {489.33, true, 1489.33},
                        {1000.0, true, 2000.0}
                });
    }


    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("testConditions")
    void deposit(double amount, boolean branch, double expected)
    {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), 0.01);
    }
}
