package com.jkatz.epam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PizzaOrder {
    private Date date;
    private String name;

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Assume that orders are already filled with necessary orders
    //please  get names the 3 most recent placed order and put into new collection
    final List<PizzaOrder> orders = new ArrayList<>();
    ///getMostRecentPlacedOrder(orders);

    public  List<PizzaOrder> getMostRecentPlacedOrder(PizzaOrder orders[]) {
        int numberOfOrder =0;
        List<PizzaOrder> mostRecent = new ArrayList<>();
        for (int i= 0; i<orders.length;i++) {
            if(numberOfOrder<3){
                mostRecent.add(orders[i]);
                numberOfOrder +=1;
            }

        }
        return mostRecent;
    }
}

