package application;
	
import javafx.application.Application;
import javafx.application.Platform; //fuer EXIT Button
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;


public class Main extends Application {
	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage stage) throws Exception{
		stage.setResizable(false);
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
		final Label lb2 = new Label();
		lb2.setText("2. Scene");
		Button anima = new Button();
		anima.setText("Animation");
		Button back2 = new Button();
		back2.setText("Back");
		
		
		
		//Layout fuer zweite Scene
		final FlowPane fp2 = new FlowPane();
		final Scene secondScene = new Scene(fp2, 370, 150);
		fp2.setHgap(50);
		fp2.setVgap(50);
		fp2.setPadding(new Insets(60,15,15,60));
	
		fp2.getChildren().addAll(back2, lb2, anima);
		
		//asdfasdfasdf
		
		stage.setScene( scene );
		stage.show();
		
		//CSS Stylesheet
		secondScene.getStylesheets().add("style.css");
		
		//CSS Buttons
		anima.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
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
	    stage.setScene(scene);
	    stage.show();
	    
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
	    
	    Button submit = new Button();
	    submit.setText("Submit");
	    
	    // Output Table
	    TableView table = new TableView();
	    table.setEditable( false );
	    table.setMinWidth(480);
	    table.setMinHeight(200);
	    
        TableColumn BlockID = new TableColumn("Block ID");
        TableColumn Timestamp = new TableColumn("Timestamp");
        TableColumn Nonce = new TableColumn("Nonce");
        
        table.getColumns().addAll( BlockID, Timestamp, Nonce );
	    
	    //TextFelder
	    TextField txt1 = new TextField();
	    txt1.setText("Block ID");
	    txt1.setMinWidth( 120.0 );
	    
	    TextField txt2 = new TextField();
	    txt2.setText("Nonce");
	    txt2.setMinWidth( 120.0 );
	    
	    TextArea txt3 = new TextArea();
	    txt3.setText("Data");
	    txt3.setMinWidth( 300.0 );
	    txt3.setMinHeight( 100.0 );
	    
	    TextField txt4 = new TextField();
	    txt4.setText("SHA256");
	    txt4.setMinWidth( 480.0 );
	  
	   
	    //Layout vierte Scene
	    final AnchorPane fp4 = new AnchorPane();
		Scene fourthScene = new Scene(fp4, 570, 360);
		//fp4.setHgap(50);
		//fp4.setVgap(50);
	    fp4.setPadding(new Insets(60,15,15,60));
	   
		
		fp4.setTopAnchor(txt1, -50.0);
		fp4.setLeftAnchor(txt1, 1.0);
		
		fp4.setTopAnchor(txt2, -20.0);
		fp4.setLeftAnchor(txt2, 1.0);
		
		fp4.setTopAnchor(txt3, 10.0);
		fp4.setLeftAnchor(txt3, 1.0);
		
		fp4.setTopAnchor(txt4, 200.0);
		fp4.setLeftAnchor(txt4, 1.0);
		
		fp4.setTopAnchor(back4, 250.0);
		fp4.setLeftAnchor(back4, 1.0);
		
		fp4.setTopAnchor(submit, 250.0);
		fp4.setRightAnchor(submit, 1.0);
		
		fp4.setTopAnchor( table, 300.0);
		fp4.setLeftAnchor( table, 1.0);
		
		
	    fp4.getChildren().addAll(txt1, txt2, txt3, txt4, back4, submit, table);
	    stage.setScene(scene);
	    stage.show();
	    
	    //CSS Stylesheet
	    fourthScene.getStylesheets().add("style.css");
	  		
	    //CSS Buttons
	  	back4.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
	  	submit.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
	    
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
		anima.setOnAction(e -> {
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
		// MOUSE Handler
		txt1.setOnMouseClicked(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				
				if( txt1.getText().equals( "Block ID") )
					txt1.setText("");
				else if( txt2.getText().isEmpty() )
					txt1.setText("Block ID");
			}  
		   });
		
		txt2.setOnMouseClicked(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				if( txt2.getText().equals( "Nonce") )
					txt2.setText("");
				
			}  
		   });
		txt3.setOnMouseClicked(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				if( txt3.getText().equals( "Data") )
					txt3.setText("");		
			}  
		   });
		txt4.setOnMouseClicked(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				if( txt4.getText().equals( "SHA256") )
					txt4.setText("");		
			}  
		   });
		
		submit.setOnAction( e-> {
			fourthScene.set 
			
		} );
		
	}
	



}
