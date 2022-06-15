package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {

	@FXML
    private TextField txt_name;

    @FXML
    private PasswordField txt_password;
    
    @FXML
    private Label lbl_result;

    @FXML
    void btn_clear_click(ActionEvent event) {
    	txt_name.setText("");
    	txt_password.setText(null);
    }
    
    @FXML
    void btn_login_click(ActionEvent event) {
    	String name = txt_name.getText();
    	String pass = txt_password.getText();
    	
    	if(name.isEmpty()) {
    		lbl_result.setText("Please enter username");
    		return;
    	}
    	
    	if(pass.isEmpty()) {
    		lbl_result.setText("Please enter password");
    		return;
    	}
    	
    	if(name.equals("mmit") && pass.equals("admin")) {
    		lbl_result.setText("Login Success");
    	}else {
    		lbl_result.setText("Login Fail");
    	}
    }

    @FXML
    void lbn_click(MouseEvent event) throws IOException {
    	Main.changeScene("Register.fxml");
    }

}
