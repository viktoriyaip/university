package store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Store> storeList;
    private List<Cashier> cashierList;
    private  int numberOfReceipt;

    public Store(int numberOfReceipt) {
        this.storeList = new ArrayList<>();
        this.cashierList = new ArrayList<>();
        this.numberOfReceipt = numberOfReceipt;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public List<Cashier> getCashierList() {
        return cashierList;
    }

    public void setCashierList(List<Cashier> cashierList) {
        this.cashierList = cashierList;
    }

    public int getNumberOfReceipt() {
        return numberOfReceipt;
    }

    public void setNumberOfReceipt(int numberOfReceipt) {
        this.numberOfReceipt = numberOfReceipt;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeList=" + storeList +
                ", cashierList=" + cashierList +
                ", numberOfReceipt=" + numberOfReceipt +
                '}';
    }
}
