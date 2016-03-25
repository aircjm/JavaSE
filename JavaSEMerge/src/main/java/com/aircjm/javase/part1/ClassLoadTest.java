package com.aircjm.javase.part1;

class BirthDate {
    private int day;

    private int month;

    private int year;

    public BirthDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void display() {
        System.out.println(day + "-" + month + "-" + year);
    }
}

public class ClassLoadTest {
    public void change1(int i) {
        i = 1234;
    }

    public void change2(BirthDate b) {
        b = new BirthDate(22, 3, 2004);
    }

    public void change3(BirthDate b) {
        b.setDay(22);
    }

    public static void main(String[] args) {
        ClassLoadTest classLoadTest = new ClassLoadTest();
        int date = 9;
        System.out.println("2345");


        int ia = 4;
        BirthDate d1 = new BirthDate(7, 7, 1970);
        BirthDate d2 = new BirthDate(1, 1, 2009);
        classLoadTest.change1(date);
        classLoadTest.change2(d1);
        classLoadTest.change3(d2);
        System.out.println("date=" + date);
        d1.display();
        d2.display();
    }
}
