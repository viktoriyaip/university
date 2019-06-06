package store;

import java.io.IOException;

public class CustomThread implements Runnable {

    private Receipt receipt;

    public CustomThread(Receipt receipt)
    {
        this.receipt = receipt;
    }

    @Override
    public void run()
    {
        try {
            System.out.println("hello");
            receipt.saveReceiptOnFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
