package store;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private long id;
    private static long issuedReceipts;
    private String nameOfCashier;
    private LocalDateTime dateAndTimeOfReceipt;
    private ArrayList<Stock> stockListOfReceipt = new ArrayList<>();
    
    public Receipt(String nameOfCashier, LocalDateTime dateAndTimeOfReceipt,
    		ArrayList<Stock> list) {
    	issuedReceipts++;
    	this.id = issuedReceipts;
    	this.dateAndTimeOfReceipt = dateAndTimeOfReceipt;
    	this.nameOfCashier = nameOfCashier;
    	this.stockListOfReceipt = list;
    }
    
    public void saveReceiptOnFile() throws IOException {
    	String filename = String.valueOf(issuedReceipts) + ".txt";
    	StringBuilder receiptContents = new StringBuilder();
    	String timeOfIssuedReceipt = String.valueOf(dateAndTimeOfReceipt.getHour()) + ":" 
    			+ String.valueOf(dateAndTimeOfReceipt.getMinute()) + ":" 
    				+ String.valueOf(dateAndTimeOfReceipt.getSecond());
    	
    	receiptContents.append("Receipt number: " + id + "\n");
    	receiptContents.append("Issued by cashier: " + nameOfCashier + "\n");
    	receiptContents.append("Issued on: " + dateAndTimeOfReceipt.toLocalDate()
    		+ " " + timeOfIssuedReceipt + "\n");
    	List<Stock> stockList = stockListOfReceipt;
    	
    	for(int i = 0; i < stockList.size(); i++) {
    		Stock currentItem = stockList.get(i);
    		receiptContents.append(currentItem.getName() + " " + currentItem.getSinglePrice() + "\n");
    	}
    	
    	File file = new File("src\\" + filename);
    	PrintWriter writer = new PrintWriter(file);
    	writer.write(receiptContents.toString());
    	writer.close();
    }
    
    public long getId() {
		return id;
	}

	public String getNameOfCashier() {
		return nameOfCashier;
	}

	public LocalDateTime getDateAndTimeOfReceipt() {
		return dateAndTimeOfReceipt;
	}

	public List<Stock> getStockListOfReceipt() {
		return stockListOfReceipt;
	}
}
