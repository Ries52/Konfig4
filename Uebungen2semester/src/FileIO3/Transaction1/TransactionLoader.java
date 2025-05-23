package FileIO3.Transaction1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransactionLoader {

    public ArrayList<Transaction> loadTransaction(String path){
        ArrayList<Transaction> loadTransaction2 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null){
                String[] li = line.split(";");


                //▪ TransactionDate (String)
                //▪ Product (String)
                //▪ Price (double)
                //▪ PaymentType (String)
                //▪ Name (String)
                //▪ City (String)
                //▪ State (String)
                //▪ Country (String)
                String TransactionDaten = li[0];
                String Product = li[1];
                double Price = Double.parseDouble(li[2]);
                String PaymentType = li[3];
                String Name = li[4];
                String City = li[5];
                String State = li[6];
                String Country = li[7];

                loadTransaction2.add(new Transaction(TransactionDaten,Product,Price,PaymentType,Name,City,State,Country));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return loadTransaction2;

    }

    //Schreiben Sie eine Klasse TransactionLoader mit einer statischen Methode public
    //ArrayList<Transaction> loadTransactions(String path). Die Methode lädt alle Transaktionen aus der
    //Datei transactions.csv. Betrachten Sie den Aufbau der Datei genauer und entscheiden Sie selbst, mit
    //welcher Strategie Sie den Inhalt laden. Fangen Sie entstehende Exceptions ab und werfen Sie hierfür
    //eine eigene Exception LoadException.


}
