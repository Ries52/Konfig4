package FileIO3.Transaction1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TransactionObjectHandler {

    public void saveTransactions(ArrayList<Transaction> list, String path) throws TransactionObjectException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (Transaction transaction : list){
                bw.write(transaction.getTransactionDate() + ";" + transaction.getProduct() + ";"
                + transaction.getPrice() + ";" + transaction.getPaymentType() + ";" + transaction.getName()
                + ";" + transaction.getCity() + ";" + transaction.getState() + ";" + transaction.getCountry());
                bw.newLine();
            }


        }
        catch (Exception e) {
            throw new TransactionObjectException(e.getMessage());
        }
    }
    //Schreiben Sie eine Klasse TransactionObjectHandler mit einer statischen Methode public void
    //saveTransactions(ArrayList<Transaction> list, String path). Serialisieren Sie hier bitte die
    //Transaktionen, direkt als Object in eine entsprechende Datei.
}
