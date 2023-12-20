package tester;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.AppConfig;
import dependent.ATMImpl;

public class TestSpring {

	public static void main(String[] args) {
		// create instance of ClasspathXmlApplicationContext(String configFile) :
		// AutoCloseable
		// to start SC in the stand alone environment ,
		// using xml based metadata
		// instructions , placed in run time classpath(i.e <resoures>)
		try (AnnotationConfigApplicationContext ctx =				
				new AnnotationConfigApplicationContext(AppConfig.class)) {
			System.out.println("SC up n running .....");
			// withdraw 1000 from the atm
			// API of o.s.b.f.BeanFactory
			// <T> T getBean(String beanId/name , Class<T> class)
			ATMImpl ref1 = ctx.getBean("my_atm", ATMImpl.class);
			ref1.withdraw(1000);
			// another demand for bean
			ATMImpl ref2 = ctx.getBean("my_atm", ATMImpl.class);
			System.out.println(ref1 == ref2);// true : since singleton
		} // JVM : ctx.close --> SC shutting down --tries to call
			// destroy method on
			// singleton beans -- G.C of all spring beans
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
