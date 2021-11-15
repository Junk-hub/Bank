package com.company;

public class Transfer {
    private double sum;
    private boolean approved;
    private String comment;
    private long senderID;
    private long recipientID;

    //конструктор
    public Transfer(double sum, boolean approved, String comment, long senderID, long recipientID){
        this.sum  = sum;
        this.approved = approved;
        this.comment = comment;
        this.senderID = senderID;
        this.recipientID = recipientID;
    }
}
