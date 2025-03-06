package org.example;

public class Student {
    private String name;
    private int semester;
    private boolean isActive;

    // Konstruktor
    public Student(String name, int semester, boolean isActive) {
        this.name = name;
        this.semester = semester;
        this.isActive = isActive;
    }

    // Getter dan Setter untuk properti
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Fungsi untuk menentukan apakah mahasiswa sedang melakukan MBKM
    public boolean isDoingMBKM() {
        return semester >= 6 && isActive;
    }
}
