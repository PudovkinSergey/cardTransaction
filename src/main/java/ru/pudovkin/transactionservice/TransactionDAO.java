package ru.pudovkin.transactionservice;

import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {

    public static List<Transaction> getAllSendedTransactions(int id) {
        List<Transaction> transactionList= new ArrayList<>();
        transactionList.add(new Transaction(1,id,id+1,200));
        transactionList.add(new Transaction(2,id,id+2,400));
        transactionList.add(new Transaction(3,id,id+3,600));
        transactionList.add(new Transaction(4,id,id+4,800));
        return transactionList;
    }

    public static List<Transaction> getAllReceivedTransactions(int id) {
        List<Transaction> transactionList= new ArrayList<>();
        transactionList.add(new Transaction(1,id+4,id,200));
        transactionList.add(new Transaction(2,id+3,id,400));
        transactionList.add(new Transaction(3,id+2,id,600));
        transactionList.add(new Transaction(4,id+1,id,800));
        return transactionList;
    }

}
