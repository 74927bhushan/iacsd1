package utils;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory factory;
	static {
		System.out.println("in static init block");
		factory = new Configuration()    //empty configuration
				.configure().buildSessionFactory();         // config object populated from hibernate.cfg.xml
	}
	public static SessionFactory getFactory() {
		return factory;
	}
	
	

}
