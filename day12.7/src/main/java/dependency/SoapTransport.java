package dependency;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//prototype , id=soap
@Component("soap")
@Scope("prototype")
public class SoapTransport implements Transport {
	public SoapTransport() {
		System.out.println("in cnstr of " +getClass().getName());
	}

	@Override
	public void informBank(byte[] data) {
		System.out.println("informing bank using " + getClass().getName() + " layer");

	}

}
