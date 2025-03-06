package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSystemTest {

    static TransactionSystem ts;

    @BeforeAll
    static void classSetup(){
//        ts = new TransactionSystem(50000);
        TransactionSystem.openCollection();
    }

    @AfterAll
    static void classCleanup(){
        TransactionSystem.closeCollection();
    }

    @AfterEach
    void methodCleanup(){
        System.out.println(ts.getBalance());
    }

    @BeforeEach
    void setupMethod(){
        ts = new TransactionSystem(50000);
    }

    @Test
    void testDeposit(){
        ts.deposit(100000);
        Assertions.assertEquals(150000,ts.getBalance());
    }

    @Test
    void testWithdraw(){
        ts.deposit(100000);        ts.withDraw(50000);
        Assertions.assertEquals(100000,ts.getBalance());
    }
}