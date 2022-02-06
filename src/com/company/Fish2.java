package com.company;

public class Fish2 {
    private String name;
    private String colore;
    private int year;
    private int damege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid Fish name [" + name + "]");
        } else {
            this.name = name;
        }
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        if (!colore.matches("[A-Za-z0-9]*")) {
            System.out.println("Invalid colore [" + colore + "]");
        } else {
            this.colore = colore;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            System.out.println("Invalid year [" + year + "]");
        } else {

            this.year = year;
        }
    }

    public int getDamege() {
        return damege;
    }

    public void setDamege(int damege) {
        if (damege < 0) {
            System.out.println("invalid damage [" + damege + "]");
        } else {
            this.damege = damege;
        }
    }

    }

