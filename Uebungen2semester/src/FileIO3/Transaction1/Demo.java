package FileIO3.Transaction1;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {

        try {
            TransactionLoader transactionLoader = new TransactionLoader();
            //"C:\\UebenProgrammieren\\sub-ordner\\dokumente\\transactions.csv"
            ArrayList<Transaction> transactions = new ArrayList<>();

            for (Transaction transaction : transactionLoader.loadTransaction("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\transactionssave.csv")) {
                transactions.add(transaction);
            }

            Collections.sort(transactions, new PriceProductComparator());

            System.out.println("Alle Transationen:");
            System.out.println(transactions);

            TransactionObjectHandler transactionObjectHandler = new TransactionObjectHandler();
            transactionObjectHandler.saveTransactions(transactions, "C:\\UebenProgrammieren\\sub-ordner\\dokumente\\transactionssave1.csv");


            TransactionManager transactionManager = new TransactionManager(transactions);
            System.out.println();
            System.out.println("Länder und die anzahl der Transationen:");
            System.out.println(transactionManager.getTransactionCountByCity());
            System.out.println();
            System.out.println("Anzahl der Transationen für dieses Land:");
            System.out.println(transactionManager.getCountOfTransaction("Austria"));
            System.out.println();
            System.out.println("Alle Transactionen für dieses Product:");
            System.out.println(transactionManager.getTransactionsToProduct("Laptop"));
            System.out.println();
            System.out.println("Durchnschnittswert der transactionen für zahlungsart:");
            System.out.println(transactionManager.getAverageTransactionAmountByPaymentType());
        }
        catch(Exception e){
            System.out.println("Fehler");
        }

    }
    //Schreiben Sie ein Demo-Anwendung, wo Sie die Transaktionen laden, den Comparator anwenden
    //und die sortierten Ergebnisse ausgeben.



    //Erweitern Sie die Demoanwendung, um das Schreiben der Datei zu testen. Betrachten Sie die Datei in
    //einem Editor und vergleichen Sie die Unterschiede.
}
