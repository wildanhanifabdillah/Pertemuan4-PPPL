package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testIsDoingMBKM() {

        Student student1 = new Student("Owok", 6, true);
        assertTrue(student1.isDoingMBKM(), "Mahasiswa smt 6 aktif harus melakukan MBKM");
    }
}
