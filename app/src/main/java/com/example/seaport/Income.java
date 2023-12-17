package com.example.seaport;

public class Income {

    private int id;
    private String nameIncome;
    private int income;

    private static int countId = 1;    // счётчик id дохода

    public Income(String nameIncome, int income) {
        this.id = countId;
        this.nameIncome = nameIncome;
        this.income = income;

        countId++;
    }

    public Income() {
        id = 0;
        nameIncome = "unkown";
        income = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameIncome() {
        return nameIncome;
    }

    public void setNameIncome(String nameIncome) {
        this.nameIncome = nameIncome;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
