package store;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Stock {
    private long id;
    private String name;
    private double singlePrice;
    private LocalDate expiryDate;
    private static List<Stock> allStocks; 

    public Stock(long id, String name, double singlePrice, LocalDate expiryDate) {
    	if(allStocks == null) {
    		allStocks = new ArrayList<>();
    	}
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

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
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
