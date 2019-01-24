package ru.pudovkin.transactionservice;

import javax.xml.bind.annotation.XmlRegistry;
import java.util.ArrayList;
import java.util.List;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory(){

    }
    public GetSendedTransactionResponse createGetSendedTransactionResponse(){
        return new GetSendedTransactionResponse();
    }
    public GetSendedTransactionsRequest createGetSendedTransactionRequest(){
        return new GetSendedTransactionsRequest();
    }

    public List<Transaction> createTransactionList(){
        return new ArrayList<Transaction>();
    }


}
