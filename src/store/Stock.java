package store;

import java.util.Date;

public class Stock {
    private long id;
    private String name;
    private double singlePrice;
    private Date date;

    public Stock(long id, String name, double singlePrice, Date date) {
        this.id = id;
        this.name = name;
        this.singlePrice = singlePrice;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(double singlePrice) {
        this.singlePrice = singlePrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singlePrice=" + singlePrice +
                ", date=" + date +
                '}';
    }
}
