package com.example.ezcolth.ericssonproject;

/**
 * Created by ezcolth on 15/08/2017.
 */

public class ObjectChatMessage
{
    String senderEmail;
    String recieverEmail;
    String timestamp;
    String description;

    public ObjectChatMessage(String senderEmail, String recieverEmail, String timestamp, String description)
    {
        this.senderEmail = senderEmail;
        this.recieverEmail = recieverEmail;
        this.timestamp = timestamp;
        this.description = description;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getRecieverEmail() {
        return recieverEmail;
    }

    public void setRecieverEmail(String recieverEmail) {
        this.recieverEmail = recieverEmail;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
