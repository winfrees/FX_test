/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fx_test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author vinfrais
 */
public class FX_test extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setLayoutX(15);
        btn.setLayoutY(540);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        MenuBar mb = new MenuBar();
        
        mb.setMinWidth(640);
        
        final Menu menu1 = new Menu("File");
        final Menu menu2 = new Menu("Options");
        final Menu menu3 = new Menu("Help");
        
        mb.getMenus().addAll(menu1, menu2, menu3);
        
        AnchorPane root = new AnchorPane();
        root.setMaxWidth(640);
        root.setMaxHeight(500);
       
        root.setPadding(Insets.EMPTY);
        Rectangle rect_pane = new Rectangle(0, 26, 640, 500);
        rect_pane.setFill(Color.web("#404040"));
        Rectangle rect_process = new Rectangle(10, 65, 200, 430);
        rect_process.setFill(Color.DARKGRAY);
        rect_process.setStroke(Color.BLACK);
        Rectangle rect_object = new Rectangle(220, 65, 200, 430);
        rect_object.setFill(Color.DARKGRAY);
        rect_object.setStroke(Color.BLACK);
        Rectangle rect_explore = new Rectangle(430, 65, 200, 430);
        rect_explore.setFill(Color.DARKGRAY);
        rect_explore.setStroke(Color.BLACK);
        
        
        root.getChildren().add(mb);
        root.getChildren().add(rect_pane);
        root.getChildren().add(rect_process);
        root.getChildren().add(rect_object);
        root.getChildren().add(rect_explore);
        
        root.getChildren().add(btn);
        
    
        
        Scene scene = new Scene(root, 640, 500);
        
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
