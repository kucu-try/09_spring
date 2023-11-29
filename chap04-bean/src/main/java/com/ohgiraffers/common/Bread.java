package com.ohgiraffers.common;

import java.util.Date;

public class Bread extends Product{
    private Date breakedDate;

    public Bread() {
        super();
    }


    public Bread(String name, int price, Date breakedDate) {
        super(name, price);
        this.breakedDate = breakedDate;
    }

    public Date getBreakedDate() {
        return breakedDate;
    }

    public void setBreakedDate(Date breakedDate) {
        this.breakedDate = breakedDate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.breakedDate;
    }
}
