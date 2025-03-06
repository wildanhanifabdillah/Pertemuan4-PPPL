package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void testTambah(){
        Kalkulator calc = new Kalkulator(5,3);
        Assertions.assertEquals(8, calc.tambah());
        System.out.println("cek tambah");
    }

    @Test
    void testKurang(){
        Kalkulator calc = new Kalkulator(5,3);
        Assertions.assertEquals(2, calc.kurang());
        System.out.println("cek kurang");
    }

    @Test
    void testKali(){
        Kalkulator calc = new Kalkulator(5,3);
        Assertions.assertEquals(15, calc.kali());
        System.out.println("cek kali");
    }

    @Test
    void testBagi(){
        Kalkulator calc = new Kalkulator(15,3);
        Assertions.assertEquals(5, calc.bagi());
        System.out.println("cek bagi");
    }

    @Test
    void testTambahNotNull() {
        Kalkulator calc = new Kalkulator(5,10);
        Assertions.assertNotNull(calc.tambah());
    }

    void testTambahComplete() {
        Kalkulator calc = new Kalkulator(5, 10);
        Assertions.assertAll(

        );
    }

    @BeforeAll
    static void setup(){
        System.out.println("before all");
    }

    @BeforeEach
    void setupMethod(){
        System.out.println("before each");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    void afterEach(){
        System.out.println("after each");
    }
}