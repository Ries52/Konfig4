package FileIO3.Transaction1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TransactionManager {
    private ArrayList<Transaction> transactionlist;

    public TransactionManager(ArrayList<Transaction> transactionlist) {
        this.transactionlist = transactionlist;
    }


    //Schreiben Sie eine Klasse TransactionManager, wo Sie eine Liste von Transaktionen im Konstruktor
    //übernehmen und in einem privaten Attribut speichern.


    //Schreiben Sie eine Methode public HashMap<String, Integer> getTransactionCountByCity(), welche je
    //City die Anzahl der Transaktionen zurückliefert.
    public HashMap<String,Integer> getTransactionCountByCity(){
        HashMap<String,Integer> transactonmap = new HashMap<>();
        for (int i = 0 ; i<transactionlist.size();i++){
            Transaction transaction = transactionlist.get(i);
            if (transactonmap.containsKey(transaction.getCountry())){
                int zwischenspeicher = transactonmap.get(transaction.getCountry());
                transactonmap.put(transaction.getCountry(),zwischenspeicher+1);
            }else {
                transactonmap.put(transaction.getCountry(),1);
            }
        }
        return transactonmap;
    }




    //Schreiben Sie eine Methode public Integer getCountOfTransaction(String country), welche für das
    //übergebene Land, die Anzahl der Transaktionen ermittelt.
    public Integer getCountOfTransaction(String country){
        int anzahl = 0;
        for (int i = 0; i<transactionlist.size();i++){
            Transaction transaction = transactionlist.get(i);
            if (transaction.getCountry().equals(country)){
                anzahl += 1;
            }
        }
        return anzahl;
    }
    //Schreiben Sie eine Methode public ArrayList<Transaction> getTransactionsToProduct(String product),
    //welche je Produkt eine Liste von Transaktionen retour liefert.
    public ArrayList<Transaction>getTransactionsToProduct(String product){
        ArrayList<Transaction> anzahltransactionlist = new ArrayList<>();
        for (int i = 0; i<transactionlist.size();i++){
            Transaction transaction = transactionlist.get(i);
            if (transaction.getProduct().equals(product)){
                anzahltransactionlist.add(transaction);
            }
        }
        return anzahltransactionlist;
    }

    //Schreiben Sie eine Methode public HashMap<String, Double>
    //getAverageTransactionAmountByPaymentType(), welche je PaymentType den durchschnittlichen
    //Transaktionswert zurückliefert. Eventuell müssen Sie hier eine Hilfsmethode oder Hilfsklasse
    //schreiben.

    public HashMap<String,Double> getAverageTransactionAmountByPaymentType(){

        HashMap<String,Double> anzahlderPaymentTypes = new HashMap<>();
        HashMap<String,Double> gesamtpreisderPaymentTypes = new HashMap<>();
        for (int i = 0; i<transactionlist.size(); i++){
            Transaction transaction = transactionlist.get(i);
            if (anzahlderPaymentTypes.containsKey(transaction.getPaymentType())){
                double zwischenspeicher = anzahlderPaymentTypes.get(transaction.getPaymentType());
                anzahlderPaymentTypes.put(transaction.getPaymentType(),zwischenspeicher+1);
            }else {
                anzahlderPaymentTypes.put(transaction.getPaymentType(),1.0);
            }

            if (gesamtpreisderPaymentTypes.containsKey(transaction.getPaymentType())){
                double zwischenspeicher = gesamtpreisderPaymentTypes.get(transaction.getPaymentType());
                gesamtpreisderPaymentTypes.put(transaction.getPaymentType(),zwischenspeicher+transaction.getPrice());
            }else {
                gesamtpreisderPaymentTypes.put(transaction.getPaymentType(),1.0);
            }
        }
        HashMap<String,Double> avangerlist = new HashMap<>();

        //key.add(anzahlderPaymentTypes.keySet().toString());
        for (String k : gesamtpreisderPaymentTypes.keySet()){
            double durchschnitt = gesamtpreisderPaymentTypes.get(k)/anzahlderPaymentTypes.get(k);
             avangerlist.put(k,durchschnitt);
        }

        return avangerlist;
    }
    //Erweitern Sie die Demoanwendung und probieren Sie ihre Funktionen aus.
}
