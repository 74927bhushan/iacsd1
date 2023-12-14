package pojos;

import java.time.LocalDate;
import javax.persistence.*;

//product table :id,name,category,price,stock,description,manu_date
@Entity      //class level run time annotation to tell hibernate ,following class is an entity to managed by hibernate
@Table(name="products") //Table name
public class Product {
 @Id    //constraint Primary Key 
 //will be added on the column 
 @GeneratedValue (strategy = GenerationType.IDENTITY)// to specify the automatic generation of pk's : default stat :AUTO
  @Column(name="productID")
	private Integer productid;
 @Column(length=100,nullable=false)  //not null constraint// it will give the varchar size as 100 char max;
	private String name;
 //by default column type :int to store enum ordinal,to replace it by enum name
 @Enumerated(EnumType.STRING)//varchar
 @Column(length=20)
	private ProductCategory category;
	private double price;
	private int stock;
	@Column(name="product_desc",length=200)
	private String productdesc;
	@Column(name="manufacture_date")
	private LocalDate manufactureDate;
	
	public Product() {
		
	}

	public Product(String name, ProductCategory category, double price, int stock, String productdesc,
			LocalDate manufactureDate) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.productdesc = productdesc;
		this.manufactureDate = manufactureDate;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", stock=" + stock + ", productdesc=" + productdesc + ", manufactureDate=" + manufactureDate + "]";
	}
	
	
}
