package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

//    @Test
//    void testTambah(){
//        Kalkulator calc = new Kalkulator(5,3);
//        assertEquals(8, calc.tambah());
//        System.out.println("cek tambah");
//    }
//
//    @Test
//    void testKurang(){
//        Kalkulator calc = new Kalkulator(5,3);
//        assertEquals(2, calc.kurang());
//        System.out.println("cek kurang");
//    }
//
//    @Test
//    void testKali(){
//        Kalkulator calc = new Kalkulator(5,3);
//        assertEquals(15, calc.kali());
//        System.out.println("cek kali");
//    }
//
//    @Test
//    void testBagi(){
//        Kalkulator calc = new Kalkulator(15,3);
//        assertEquals(5, calc.bagi());
//        System.out.println("cek bagi");
//    }
//
//    @Test
//    void testTambahNotNull() {
//        Kalkulator calc = new Kalkulator(5,10);
//        assertNotNull(calc.tambah());
//    }
//
//    @Test
//    void testTambahComplete() {
//        Kalkulator calc = new Kalkulator(5, 10);
//        assertAll(
//
//        );
//    }
//
//    @BeforeAll
//    static void setup(){
//        System.out.println("before all");
//    }
//
//    @BeforeEach
//    void setupMethod(){
//        System.out.println("before each");
//    }
//
//    @AfterAll
//    static void afterAll(){
//        System.out.println("after all");
//    }
//
//    @AfterEach
//    void afterEach(){
//        System.out.println("after each");
//    }

    @Order(2)
    @ParameterizedTest
    @ValueSource(ints = {2, 10, 4, 8, 16})
    void testIsEven(int number) {
        Kalkulator calc = new Kalkulator();
        assertTrue(calc.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(strings = {"pp", "ii", "qq", "11"})
    void testCheckName(String name){
        assertNotNull(name);
    }

    @Order(3)
    @ParameterizedTest
    @MethodSource("org.example.DataProvider#provideArrayData")
    void testUsingArray(List<String> names){
        //test
    }

    @Order(1)
    @ParameterizedTest
    @CsvSource(
            {
                    "5, 10, 15",
                    "15, 10, 15",
                    "25, 10, 35"
            }
    )
    void testAddition(int a, int b, int expected){
        Kalkulator calc = new Kalkulator();
        assertEquals(expected, calc.tambah(a,b));
    }

    @Order(4)
    @ParameterizedTest
    @MethodSource("org.example.DataProvider#provideAdditionData")
    void testAdditionFromMethod(int a, int b, int expected){
        Kalkulator calc = new Kalkulator();
        assertEquals(expected, calc.tambah(a, b));
    }
}