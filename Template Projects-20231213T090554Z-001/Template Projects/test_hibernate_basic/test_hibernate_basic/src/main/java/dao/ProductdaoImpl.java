package dao;

import pojos.Product;

import static utils.HibernateUtils.getFactory;

import org.hibernate.*;

public class ProductdaoImpl  implements ProductDao{

	@Override
	public
	String addNewProduct(Product product) {
		String mesg = "Adding product failed";
		Session session = getFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		try {
			session.save(product);
			tx.commit();
			mesg="product added with id "+product.getProductid();
			//success
		}catch (Exception e) {
		//handle exception 
			//error:rollback tx
			if(tx!=null) {
				tx.rollback();
				//re throw the exc to the the caller : to inform about the error
			}throw e;
		}finally {
			if(session !=null) {
				session.close();//level 1 cache is destroyed and session pooled out database connection
			}
		}
		return mesg;
	}
}
