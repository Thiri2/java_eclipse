package day11_abstract;

public class demo {

	public static void main(String[] args) {
		ProductService p_service = new ProductService();
		p_service.connectDatabase();
		p_service.insert();
		p_service.update();
		p_service.delete(101);
		p_service.findById(102);
		
		System.out.println("---Abstract class---");
		//DatabaseUtil db_onj = new DatabaseUtil();
		//cant create
		
		DatabaseUtil db_obj = new ProductService();
		db_obj.connectDatabase();
		db_obj.insert();
	}
}
