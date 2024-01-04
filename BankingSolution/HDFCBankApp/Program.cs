using Banking;
NotificationManager mgr=new NotificationManager();
//Compile Time Binding
//mgr.SendSMS();
//mgr.SendEmail();

/*
//Registration of callback function
Handler agent1=new Handler(mgr.SendSMS);
Handler agent2=new Handler(mgr.SendEmail);

Handler masterAgent=agent1;
//delegate chaining
//Multicast Delegate
masterAgent+=agent2;
masterAgent.Invoke();

*/

Account acct123=new Account(5000);
//Event Binding

//Attach event handler with event of object
//This Act of Subscription
acct123.notify+=new Handler(mgr.SendEmail);
acct123.notify+=new Handler(mgr.SendSMS);
acct123.underBalance+=new Handler(mgr.BlockAccount);
acct123.overBalance+=new Handler(mgr.PayIncomeTax);

acct123.Deposit(460000);
//acct123.Withdraw(61000);

float remainingBalance=acct123.Balance;
Console.WriteLine("Remaining Balance={0}",remainingBalance);