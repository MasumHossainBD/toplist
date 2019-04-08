package masum.thunderapp.royalbrothers;

public class datapojo {
private String name;
private  int balance;
public datapojo(){

}
public datapojo(int balance, String name){
    this.balance=balance;
    this.name=name;

}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
