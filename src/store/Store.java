package store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Stock> stockList;
    private List<Cashier> cashierList;
    private static int numberOfReceipts = 0;
    private static Double totalRevenue = 0.00; 

    public Store() {
        this.stockList = new ArrayList<>();
        this.cashierList = new ArrayList<>();
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStoreList(List<Stock> stockList) {
        this.stockList = stockList;
    }

    public List<Cashier> getCashierList() {
        return cashierList;
    }

    public void setCashierList(List<Cashier> cashierList) {
        this.cashierList = cashierList;
    }

    public int getNumberOfReceipts() {
        return numberOfReceipts;
    }

    public void setNumberOfReceipts(int numberOfReceipts) {
        this.numberOfReceipts = numberOfReceipts;
    }
    
    public void populateStockList() {
    	this.stockList = Stock.getAllStocks();
    }
    
    public void populateCashierList() {
    	this.cashierList = Cashier.getAllCashiers();
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeList=" + stockList +
                ", cashierList=" + cashierList +
                ", numberOfReceipt=" + numberOfReceipts +
                '}';
    }
}
