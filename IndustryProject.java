import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;
import java.awt.*;

public class IndustryProject extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
	MenuBar menuBar = new MenuBar();
	
	Menu operationMenu = new Menu("Operation");
		menuBar.getMenus().add(operationMenu);
	
	Menu addSubMenu = new Menu("Add");
	Menu subtractSubMenu = new Menu("Subtract");
	Menu multiplySubMenu = new Menu("Multiply");
	Menu divideSubMenu = new Menu("Divide");
	Menu exitSubMenu = new Menu("Exit");
		operationMenu.getItems().add(addSubMenu);
		operationMenu.getItems().add(subtractSubMenu); 
		operationMenu.getItems().add(multiplySubMenu); 
		operationMenu.getItems().add(divideSubMenu); 
		operationMenu.getItems().add(exitSubMenu);
		
	BorderPane borderPane = new BorderPane();
	borderPane.setTop(menuBar);
	
	GridPane pane = new GridPane();
		
	TextField numb1 = new TextField();
	TextField numb2 = new TextField();
	TextField result = new TextField();

	Label numbOneLabel = new Label("Number 1: ");
	Label numbTwoLabel = new Label("Number 2: ");
	Label resultLabel = new Label("Result: ");
	
	pane.add(numbOneLabel, 0, 0);
	pane.add(numb1, 1, 0);
	pane.add(numbTwoLabel, 0, 1);
	pane.add(numb2, 1, 1);
	pane.add(resultLabel, 0, 2);
	pane.add(result, 1, 2);
	borderPane.setCenter(pane);

	HBox hBox = new HBox();
	Button btAdd = new Button("Add");
	Button btSubtract = new Button("Subtract");
	Button btMultiply = new Button("Multiply");
	Button btDivide = new Button("Divide");
	hBox.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
	borderPane.setBottom(hBox);
	
		btAdd.setOnAction(e -> {
			Double firstNumber = Double.parseDouble(numb1.getText());
			Double secondNumber = Double.parseDouble(numb2.getText());
			
			Double resulting = firstNumber + secondNumber;
			
			result.setText(resulting + "");
		});

		btSubtract.setOnAction(e -> {
			Double firstNumber = Double.parseDouble(numb1.getText());
			Double secondNumber = Double.parseDouble(numb2.getText());
		
			Double resulting = firstNumber - secondNumber;
		
			result.setText(resulting + "");
		});
		
		btMultiply.setOnAction(e -> {
			Double firstNumber = Double.parseDouble(numb1.getText());
			Double secondNumber = Double.parseDouble(numb2.getText());
			
			Double resulting = firstNumber * secondNumber;
			
			result.setText(resulting + "");
		});
		
		btDivide.setOnAction(e -> {
			Double firstNumber = Double.parseDouble(numb1.getText());
			Double secondNumber = Double.parseDouble(numb2.getText());
			
			Double resulting = firstNumber / secondNumber;
			
			result.setText(resulting + "");
		});
		
		addSubMenu.setOnAction(e -> {
			Double firstNumber = Double.parseDouble(numb1.getText());
			Double secondNumber = Double.parseDouble(numb2.getText());
			
			Double resulting = firstNumber + secondNumber;
			
			result.setText(resulting + "");
		});
		
		subtractSubMenu.setOnAction(e -> {
			Double firstNumber = Double.parseDouble(numb1.getText());
			Double secondNumber = Double.parseDouble(numb2.getText());
			
			Double resulting = firstNumber - secondNumber;
			
			result.setText(resulting + "");
		});
		
		multiplySubMenu.setOnAction(e -> {
			Double firstNumber = Double.parseDouble(numb1.getText());
			Double secondNumber = Double.parseDouble(numb2.getText());
			
			Double resulting = firstNumber * secondNumber;
			
			result.setText(resulting + "");
		});
		
		divideSubMenu.setOnAction(e -> {
			Double firstNumber = Double.parseDouble(numb1.getText());
			Double secondNumber = Double.parseDouble(numb2.getText());
			
			Double resulting = firstNumber / secondNumber;
			
			result.setText(resulting + "");
		});
		
	exitSubMenu.setOnAction(e -> {
		System.exit(0);
	});
		
	Scene scene = new Scene(borderPane, 250, 150);  
	primaryStage.setTitle("DisplayFigure"); // Set the window title
	primaryStage.setScene(scene); // Place the scene in the window
	primaryStage.show(); // Display the window
	}
}