package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {
	
	@FXML
	private Label abrirWindow;
	
	@FXML
	public void newVentana() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CreacionCuenta.fxml"));
			
			AnchorPane ventanaDos = (AnchorPane) loader.load();

			
				
			
			Stage stage = new Stage();
			
			
			
			Scene scene = new Scene(ventanaDos);
			stage.setTitle("Creación de cuenta");
			stage.setScene(scene);
			stage.show();
			
			Stage thisStage= (Stage) abrirWindow.getScene().getWindow();
			thisStage.close();	

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
