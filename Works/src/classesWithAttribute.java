
public class classesWithAttribute {
	public static void main(String[] args) {
		Product product = new Product(id:1, name:"Laptop",description:"Asus Laptop",price:3000,stockAmount:2,renkk:"Siyah");
//		Product.product = new product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}
}
