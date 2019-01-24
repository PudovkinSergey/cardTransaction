package ru.pudovkin.transactionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder = {"id"})
public class GetReceivedTransactionRequest {
    protected int id;

    public int getId() {
            return id;
        }

    public void setId(int id) {
            this.id = id;
        }
}

