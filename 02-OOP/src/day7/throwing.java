package day7;

public class throwing {
	
	static void checkMark(int mark) {
		if(mark < 0 || mark > 100) {
			ArithmeticException e = new ArithmeticException("Invalid mark!");
			throw e;
		}
	}
	
	public static void main(String[] args) throws ArithmeticException {
		
		try {
			checkMark(-1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
//		try {
//			int[] nums = {100,200,300};
//			int index = 5;
//			if(index >= nums.length) 
//				throw new ArrayIndexOutOfBoundsException("Out of Range");
//			//manually throw solve with try catch
//			
//			System.out.println(nums[index]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
	}
}
;