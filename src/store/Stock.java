package store;

import java.util.Date;
import java.util.List;

public class Stock {
    private long id;
    private String name;
    private double singlePrice;
    private Date expiryDate;
    private static List<Stock> allStocks; 

    public Stock(long id, String name, double singlePrice, Date expiryDate) {
        this.id = id;
        this.name = name;
        this.singlePrice = singlePrice;
        this.expiryDate = expiryDate;
        allStocks.add(this);
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

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public static List<Stock> getAllStocks() {
    	return allStocks;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singlePrice=" + singlePrice +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
