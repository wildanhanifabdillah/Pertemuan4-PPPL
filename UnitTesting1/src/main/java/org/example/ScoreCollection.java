package org.example;

import java.util.ArrayList;

public class ScoreCollection {

    private ArrayList<Integer> scores;

    public ScoreCollection() {
        this.scores = new ArrayList<Integer>();
    }

    public void addScore(Integer score) {
        this.scores.add(score);
    }

//    public double averageScore() {
//        double total = 0;
//
//        for (int i=1; i<this.scores.size(); i++) {
//            total += this.scores.get(i);
//        }
//
//        return total/this.scores.size();
//    }

    public double averageScore() {
        if (this.scores.size() == 0) {
            return 0;  // Jika tidak ada skor, kembalikan 0
        }

        double total = 0;

        // Mulai dari index 0 untuk menghitung total skor
        for (int i = 0; i < this.scores.size(); i++) {
            total += this.scores.get(i);
        }

        return total / this.scores.size(); // Rata-rata
    }
}
