package store;

import java.util.ArrayList;
import java.util.List;

public class Cashier {
    private long id;
    private String name;
    private static List<Cashier> allCashiers = new ArrayList<>();

    public Cashier(long id, String name) {
        this.id = id;
        this.name = name;
        allCashiers.add(this);
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
    
    public static List<Cashier> getAllCashiers() {
    	return allCashiers;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
