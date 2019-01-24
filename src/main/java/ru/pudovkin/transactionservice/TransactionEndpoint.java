package ru.pudovkin.transactionservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class TransactionEndpoint {
    @PayloadRoot(namespace = "http://pudovkin.ru/sendedtransactions",localPart = "GetSendedTransactionsRequest")
    @ResponsePayload
    public GetSendedTransactionResponse processSendedTransactionReuest(@RequestPayload GetSendedTransactionsRequest request){
        GetSendedTransactionResponse response = new GetSendedTransactionResponse();

        List<Transaction> transactionList= TransactionDAO.getAllSendedTransactions(request.getId());

        response.setTransactionList(transactionList);
        return response;
    }
}
