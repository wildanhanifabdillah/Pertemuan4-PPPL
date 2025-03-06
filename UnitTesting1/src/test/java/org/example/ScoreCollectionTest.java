package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreCollectionTest {

    private ScoreCollection scoreCollection;

    @BeforeEach
    public void setUp() {
        // Inisialisasi objek ScoreCollection sebelum setiap test dijalankan
        scoreCollection = new ScoreCollection();
    }

    @Test
    public void testAverageScoreSingleElement() {
        // Menambahkan satu skor dan menghitung rata-rata
        scoreCollection.addScore(80);
        assertEquals(80.0, scoreCollection.averageScore(), "Rata-rata harus 80.0 untuk satu skor");
    }

    @Test
    public void testAverageScoreMultipleElements() {
        // Menambahkan beberapa skor dan menghitung rata-rata
        scoreCollection.addScore(80);
        scoreCollection.addScore(90);
        scoreCollection.addScore(100);
        assertEquals(90.0, scoreCollection.averageScore(), "Rata-rata harus 90.0 untuk skor [80, 90, 100]");
    }

    @Test
    public void testAverageScoreEmptyList() {
        // Tidak menambahkan skor apa pun (list kosong)
        assertEquals(0.0, scoreCollection.averageScore(), "Rata-rata untuk list kosong harus 0.0");
    }

    @Test
    public void testAverageScoreTwoElements() {
        // Menambahkan dua skor dan menghitung rata-rata
        scoreCollection.addScore(70);
        scoreCollection.addScore(90);
        assertEquals(80.0, scoreCollection.averageScore(), "Rata-rata harus 80.0 untuk skor [70, 90]");
    }
}
