class bank {
    String accountHolder;
    double balance;
    bank(String name, double amount){
        accountHolder=name;
        balance=amount;
    }
    void deposit(double amt){
        balance+=amt;
    }
    void withdraw(double amt){
        if(amt<=balance){
            balance-=amt;
        }
        else{
            System.out.println("insufficient balance");
        }
    }
    void display(){
        System.out.println(accountHolder+" has balance:"+balance);
    }
    
}
public class bankacc{
    public static void main(String[] args) {
        bank me=new bank("zoyba", 8383.3637f);
        me.display();

    }

}