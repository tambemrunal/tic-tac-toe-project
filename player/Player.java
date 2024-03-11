package player;
import java.util.*;

public class Player {
    private String name;
    private int age;
    private char symbol;
    private String address;
    private long mobileNo;
    private String emailId;

    public void SetDetails(String name,int age,char symbol,String address,long mobileNo,String emailId){
        this.name=name;
        this.age=age;
        this.symbol=symbol;
        this.address=address;
        this.mobileNo=mobileNo;
        this.emailId=emailId;
    }

    public void setNameAndSymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }

    public void displayDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.symbol);
        System.out.println(this.address);
        System.out.println(this.mobileNo);
        System.out.println(this.emailId);
    }

    public void displayNameAndSymbol(){
        System.out.println(this.name);
        System.out.println(this.symbol);
    }

    public void getPlayerName(){
        System.out.println(this.name);
    }

    public void getPlayerSymbol(){
        System.out.println(this.symbol);
    }
}
