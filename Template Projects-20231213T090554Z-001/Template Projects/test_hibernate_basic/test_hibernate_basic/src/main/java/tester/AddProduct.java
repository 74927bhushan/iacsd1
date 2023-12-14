package tester;

import org.hibernate.SessionFactory;

import dao.ProductdaoImpl;
import pojos.Product;
import pojos.ProductCategory;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

public class AddProduct {

	public static void main(String[] args) {
		try(SessionFactory sf = getFactory();
				Scanner sc = new Scanner(System.in)){
			System.out.println("Hibernate booted"+sf);
			System.out.println("Enter product details ::name-,category-,price-,stock-,productdesc-,manufacture date-");
			Product prd = new Product(sc.next(),ProductCategory.valueOf(sc.next().toUpperCase()),sc.nextDouble(),sc.nextInt(),sc.next(),LocalDate.parse(sc.next()));
			ProductdaoImpl dao = new ProductdaoImpl();
			System.out.println(dao.addNewProduct(prd));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		}

	

}
