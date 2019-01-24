package ru.pudovkin.transactionservice;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction",propOrder = {"id","senderId","recipientId","sum"})
public class Transaction implements Serializable {
    private int id;
    @XmlElement(required = true)
    private int senderId;
    @XmlElement(required = true)
    private int recipientId;
    @XmlElement(required = true)
    private int sum;

    public Transaction(){
        this.id = 0;
        this.senderId = 0;
        this.recipientId = 0;
        this.sum = 0;
    }
    public Transaction(int id, int senderId, int recipientId, int sum) {
        this.id = id;
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", senderId=" + senderId +
                ", recipientId=" + recipientId +
                ", sum=" + sum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSenderId(), getRecipientId(), getSum());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(int recipientId) {
        this.recipientId = recipientId;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }



}
