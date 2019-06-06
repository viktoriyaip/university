package main;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

import store.CustomThread;
import store.Receipt;
import store.Stock;

public class Main {

    public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		LocalDate expiryDate = LocalDate.of(2019, 8, 15);
		LocalDate expiryDate2 = LocalDate.of(2022, 6, 17);
		Stock stock = new Stock(100, "Pastry", 1.56, expiryDate);
		Stock stock2 = new Stock(150, "Pizza", 13.50, expiryDate2);
		ArrayList<Stock> list = new ArrayList<>();
		list.add(stock);
		list.add(stock2);
		Receipt receipt = new Receipt("Ahmed", date, list);
		Receipt receipt1 = new Receipt("Pesho", date, list);

		CustomThread t1 = new CustomThread(receipt);
		CustomThread t2 = new CustomThread(receipt1);

		Thread a = new Thread(t1);
		a.start();
		Thread b = new Thread(t2);
		b.start();



	}
}
