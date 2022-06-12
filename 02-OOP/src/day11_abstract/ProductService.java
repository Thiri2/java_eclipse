package day11_abstract;

public class ProductService extends DatabaseUtil{

	public void insert() {
		System.out.println("Insert into product value(?,?,?)");
	}

	@Override
	public void update() {
		System.out.println("update product set price = ?");
		
	}

	@Override
	public boolean delete(int id) {
		System.out.println("delete form product where productid = " + id);
		return true;
	}

	@Override
	public Object findById(int id) {
		System.out.println("SELECT * FROM product WHERE product_id = " + id);
		return null;
	}



	
}
