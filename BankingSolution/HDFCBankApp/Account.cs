namespace Banking;

public class Account{

    //publish Events in Account class
    public event Handler notify;
    public event Handler underBalance;
    public event Handler overBalance;

    public float Balance{get;set;}
    public Account(float amount){
        this.Balance=amount;
        
    }

    public void  Withdraw(float amount){
        this.Balance-=amount;
         notify();
        if(this.Balance<=5000){
            underBalance();
        }
    }

    public void Deposit(float amount){
        this.Balance+=amount;
         notify();
         if(this.Balance>=250000){
            overBalance();
         }
    }
}