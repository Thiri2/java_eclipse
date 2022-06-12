package day11_abstract;

public class InterfaceDemo {

	public static void main(String[] args) {
		//OnclickListener listener = new OnclickListener();
		
		OnclickListener listener = new Button("Register");
		listener.onClick();
		listener.onDoubleClick();
	}
}
