package ru.pudovkin.transactionservice;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder = {"transactionList"})
@XmlRootElement(name = "GetSendedTransactionResponse")
public class GetSendedTransactionResponse {

    @XmlElement(name = "transactionList",required = true)
    protected List<Transaction> transactionList;

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
