package com.example.seaport;

public class AmountIncome extends Income {

    private int quantityPerMonth;

    public AmountIncome(String nameIncome, int quantityPerMonth, int income) {
        super(nameIncome, income);
        this.quantityPerMonth = quantityPerMonth;
    }

    public AmountIncome() {
        super();
        quantityPerMonth = 0;
    }

    public int getQuantityPerMonth() {
        return quantityPerMonth;
    }

    public void setQuantityPerMonth(int numberOfShips) {
        this.quantityPerMonth = numberOfShips;
    }

    public int calculateMonthIncome() {    // метод получения дохода за месяц
        return quantityPerMonth * getIncome();
    }
}
