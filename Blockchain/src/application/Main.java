package application;
	
import javafx.application.Application;
import javafx.application.Platform; //fuer EXIT Button
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.geometry.Insets;


public class Main extends Application {
	public static void main(String[] args) {
		Application.launch();
	}

	int pcs;
	@Override
	public void start(Stage stage) throws Exception{
		/*--------------------------------
		 * 
		 * 1 Scene
		 * 
		 * --------------------------------*/
		
		//Komponenten und Buttons erste Scene
		Label lb1 = new Label();
		lb1.setText("1. Scene");
		
		Button btnl = new Button();
		btnl.setText("Show");
		Button btnr = new Button();
		btnr.setText("Manual");
	
    	//Layout erste Scene
		FlowPane fp1 = new FlowPane();
		fp1.setHgap(50);
	    fp1.setVgap(50);
	    fp1.setPadding(new Insets(60,15,15,60));	
		
	/*	//ANCHOR
		AnchorPane ap = new AnchorPane();
		ap.setTopAnchor(btnl, 40.0);
		ap.setBottomAnchor(btnr, 40.0);
		ap.setRightAnchor(btnl, 40.0);
		Scene scene = new Scene(ap, 370, 150);
		ap.getChildren().addAll(btnl, lb1, btnr); */
	    
	    fp1.getChildren().addAll(btnl,lb1, btnr);
	    Scene scene = new Scene(fp1, 350,150);

		
		//CSS Stylesheet
		scene.getStylesheets().add("style.css");
		
		//CSS Buttons
		btnl.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
		btnr.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
	
		
		stage.setTitle("Menu");
		
		/*--------------------------------
		 * 
		 * 2 Scene
		 * 
		 * --------------------------------*/	    
		
		//Komponenten fuer zweiten Scene
		
		// Input Valius
		int pcs;
		Integer miningSpeed;
		Integer transaktions;
		
		int s2H = 600;
		int s2V = 800;
		
		final Label lb2 = new Label();
		lb2.setLayoutX(s2V/2);
		lb2.setLayoutY(50);
		lb2.setText("2. Scene");
		
		Button anima2 = new Button();
		anima2.setLayoutX(s2V-100);
		anima2.setLayoutY(s2H-100);
		anima2.setText("Animation");
		
		Button back2 = new Button();
		back2.setLayoutX(50);
		back2.setLayoutY(s2H-100);
		back2.setText("Back");
		
		// Input variables
		// Input Rchner zahl
		final Label pcsT = new Label();
		pcsT.setLayoutX(50);
		pcsT.setLayoutY(100);
		pcsT.setText("Wie viele Rechner:");
		
		TextField pcsInput = new TextField();
		pcsInput.setLayoutX(300);
		pcsInput.setLayoutY(100);
		
		// Input mining speed
		final Label miningSpeedT = new Label();
		miningSpeedT.setLayoutX(50);
		miningSpeedT.setLayoutY(150);
		miningSpeedT.setText("Wie Schnell soll gemined werden:");
		
		TextField miningSpeedInput = new TextField();
		miningSpeedInput.setLayoutX(300);
		miningSpeedInput.setLayoutY(150);
		
		// Input mining speed
		final Label transaktionsT = new Label();
		transaktionsT.setLayoutX(50);
		transaktionsT.setLayoutY(200);
		transaktionsT.setText("Wie viele Transaktionen:");
		
		TextField transaktionsInput = new TextField();
		transaktionsInput.setLayoutX(300);
		transaktionsInput.setLayoutY(200);
		
		//---------------------------------
		ButtonBase submit = new Button();;
		submit.setLayoutX(s2V-100);
		submit.setLayoutY(s2H-200);
		submit.setText("Submit");
		submit.setOnAction(e -> {
			this.pcs = Integer.valueOf(pcsInput.getText()).intValue();
			System.out.println(this.pcs);
            System.out.println(pcsInput.getText());
            System.out.println(miningSpeedInput.getText());
            System.out.println(transaktionsInput.getText());
        });
		
		
		//Layout fuer zweite Scene
		final Pane s2 = new Pane();
		s2.getChildren().addAll(back2,lb2, anima2, pcsT, pcsInput, miningSpeedT, miningSpeedInput, transaktionsT, transaktionsInput, submit);
		final Scene secondScene = new Scene(s2, s2V, s2H);		
		
		//CSS Stylesheet
		secondScene.getStylesheets().add("style.css");
		
		//CSS Buttons
		anima2.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
		back2.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
		
		
		/*--------------------------------
		 * 
		 * 3 Scene
		 * 
		 * --------------------------------*/	
		
		//Komponenten fuer dritte Scene
	    Label lb3 = new Label();
	    lb3.setText("3. Scene");
	    Button back3 = new Button();
		back3.setText("Back");
		
		//Layout fuer dritte Scene
		final FlowPane fp3 = new FlowPane();
		final Scene thirdScene = new Scene(fp3, 370, 150);
		fp3.setHgap(50);
		fp3.setVgap(50);
		fp3.setPadding(new Insets(60,15,15,60));
	    
		fp3.getChildren().addAll(back3, lb3);
	    
	    //CSS Stylesheet
	    thirdScene.getStylesheets().add("style.css");
	  		
	  	//CSS Buttons
	    back3.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
	    
	    
	    /*--------------------------------
	     * 
	     * Scene 4
	     * 
	     * --------------------------------*/	    
	    
	    //Elemente fuer vierte Scene (manuel, noch leer)
	    Label lb4 = new Label();
	    lb4.setText("4.Scene");
	    Button back4 = new Button();
	    back4.setText("Back");
	    
	    //Layout vierte Scene
	    final FlowPane fp4 = new FlowPane();
		final Scene fourthScene = new Scene(fp4, 370, 150);
		fp4.setHgap(50);
		fp4.setVgap(50);
	    fp4.setPadding(new Insets(60,15,15,60));
	    
	    TextField txt1 = new TextField( "Name" );
	    txt1.setMinWidth( 120.0 );
	    	    
	    fp4.getChildren().addAll(back4, lb4);
	    
	    //CSS Stylesheet
	    fourthScene.getStylesheets().add("style.css");
	  		
	    //CSS Buttons
	  	back4.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
	    
		/*--------------------------------
		 * 
		 * Event Handler
		 * 
		 * --------------------------------*/	    
	    
		//HANDLER
	  	
	    //Manual Button
	    btnr.setOnAction(e -> {
	    	stage.setScene(fourthScene);
	    	stage.setTitle("Manual");
	    });
	    //Show Button
		btnl.setOnAction(e ->{
			stage.setScene(secondScene);
			stage.setTitle("init Show");
		});
	  	
		//Animation Button
		anima2.setOnAction(e -> {
			helpF(stage);
			stage.setScene(thirdScene);
			stage.setTitle("Animation");
		});
		//Back Button in Scene 2
		back2.setOnAction(e -> {
			stage.setScene(scene);
			stage.setTitle("Menu");
		});
		//Back Button in Scene 3
		back3.setOnAction(e -> {
			stage.setScene(secondScene);
			stage.setTitle("Init Show");
			
		});
		//Back Button in Scene 4
		back4.setOnAction(e -> {
			stage.setScene(scene);
			stage.setTitle("Menu");
		});
		
		stage.setScene(scene);
	    stage.show();
	}
	
	public void helpF(Stage stage) {
		stage = new Stage();
	}


}
