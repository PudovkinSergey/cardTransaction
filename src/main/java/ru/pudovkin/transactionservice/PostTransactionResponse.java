package ru.pudovkin.transactionservice;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder = {"transaction"})
@XmlRootElement(name = "PostTransactionResponse")
public class PostTransactionResponse {

    @XmlElement(name = "transaction",required = true)
    protected Transaction transaction;

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}