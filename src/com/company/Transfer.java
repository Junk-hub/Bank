package com.company;

public class Transfer {
    private double sum;
    private boolean approved;
    private long senderID;
    private long recipientID;

    //конструктор
    public Transfer(double sum, boolean approved, long senderID, long recipientID){
        this.sum  = sum;
        this.approved = approved;
        this.senderID = senderID;
        this.recipientID = recipientID;
    }
}
