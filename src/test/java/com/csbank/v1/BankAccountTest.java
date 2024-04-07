package com.csbank.v1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class BankAccountTest {

    @Test
    public void testConstruction() {
        BankAccount account = new BankAccount(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testSuccessfulDeposit() {
        BankAccount account = new BankAccount(1000);
        assertTrue(account.deposit(10));
        assertEquals(1010, account.getBalance());
    }

    @Test
    public void testSuccessfulWithdrawal() {
        BankAccount account = new BankAccount(1000);
        assertEquals(100, account.withdraw(100));
        assertEquals(900, account.getBalance());
    }

    // write the negative case.  cases that break your class!
}