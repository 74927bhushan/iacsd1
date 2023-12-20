package dependent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dependency.Transport;
//singleton  n eager
@Component("my_atm")
public class ATMImpl implements ATM {
	//Field level D.I
	@Autowired 
	@Qualifier("httpTransport")//autowire=byName
	private Transport myTransport;

	public  ATMImpl() {		
		System.out.println("in cnstr of " + getClass().getName() + " " + myTransport);
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing " + amt);
		byte[] data = ("depositing " + amt).getBytes();
		myTransport.informBank(data);// atm impl (depnt ) is calling depcy (Transport layer)
	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing " + amt);
		byte[] data = ("withdrawing " + amt).getBytes();
		myTransport.informBank(data);
	}

	// custom init method
	@PostConstruct
	public void anyInit() // throws Exception
	{
		// SC will invoke this method after D.I for singleton as well as prototype
		System.out.println("in init " + myTransport);
	}

	// custom destroy method
	@PreDestroy
	public void anyDestroy() // throws Exception
	{
		// SC will invoke this method just before Garbage collecting
		// of singleton beans
		System.out.println("in destroy " + myTransport);
	}
}
