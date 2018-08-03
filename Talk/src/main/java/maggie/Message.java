package main.java.maggie;

public class Message {

    public String content;

    public Long time;

    public String senduser;

    public  String reciveruser;

    public Message(String content,Long time,String senduser,String reciveruser){

        this.content=content;

        this.time=time;

        this.senduser=senduser;

        this.reciveruser=reciveruser;

    }

}
