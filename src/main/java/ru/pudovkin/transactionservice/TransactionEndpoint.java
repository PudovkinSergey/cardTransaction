package ru.pudovkin.transactionservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class TransactionEndpoint {
    @PayloadRoot(namespace = "http://pudovkin.ru/transactions",localPart = "GetSendedTransactionsRequest")
    @ResponsePayload
    public GetSendedTransactionResponse processRespone(@RequestPayload GetSendedTransactionsRequest request){
        GetSendedTransactionResponse response = new GetSendedTransactionResponse();

        List<Transaction> transactionList= TransactionDAO.getAllSendedTransactions(request.getId());

        response.setTransactionList(transactionList);
        return response;
    }

    @PayloadRoot(namespace = "http://pudovkin.ru/transactions",localPart = "GetReceivedTransactionsRequest")
    @ResponsePayload
    public GetReceivedTransactionResponse processResponse (@RequestPayload GetReceivedTransactionRequest request){
        GetReceivedTransactionResponse response = new GetReceivedTransactionResponse();
        System.out.println(request.getId());
        List<Transaction> transactionList = TransactionDAO.getAllReceivedTransactions(request.getId());
        response.setTransactionList(transactionList);
        return response;
    }

    @PayloadRoot(namespace = "http://pudovkin.ru/transactions",localPart = "PostTransactionRequest")
    @ResponsePayload
    public PostTransactionResponse proccessResponse (@RequestPayload PostTransactionRequest request){
        PostTransactionResponse response = new PostTransactionResponse();
        System.out.println(request.getTransactionId()+"hhehehheh");
        Transaction transaction = TransactionDAO.createTransaction(request.getTransactionId(),request.getSenderId(),
                request.getRecipientId(),request.getSum());
        response.setTransaction(transaction);
        return response;
    }
}
