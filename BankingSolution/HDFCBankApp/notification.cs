namespace Banking;

//Rerference Type
//Delegate Declaration


//functions which could be subscribed  at Runtime
public  delegate void  Handler();


//Class Declaration
public class NotificationManager{
    public void SendEmail(){
        Console.WriteLine("Email is sent to  your official email id");
    }

    public void SendSMS(){
        Console.WriteLine("Messafw is sent to  your official Contact Number");
    }


    public void BlockAccount(){
        Console.WriteLine("Your account has been blocked temp....");
    }

    public void PayIncomeTax(){
        Console.WriteLine("Deducting Income tax from your account");
    }
}