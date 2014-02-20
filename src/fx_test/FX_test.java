/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fx_test;

import java.util.ArrayList;
import java.util.Vector;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ContextMenuBuilder;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuItemBuilder;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author vinfrais
 */
public class FX_test extends Application {
    
    ArrayList PreProcessing = new ArrayList(); 
    
    AnchorPane root; 
    Scene scene;
     Stage primaryStage;
            
    @Override
    public void start(Stage stage) {
        
        this.primaryStage = stage;
        
        this.root = new AnchorPane();
        
        this.root.setMaxWidth(640);
        this.root.setMaxHeight(500);
       
        this.root.setPadding(Insets.EMPTY);
        
        this.scene = new Scene(root, 640, 500);
        
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
        
        final ContextMenu contextMenuProcess = new ContextMenu();
contextMenuProcess.setOnShowing(new EventHandler<WindowEvent>() {
    public void handle(WindowEvent e) {
        System.out.println("showing");
    }
});
contextMenuProcess.setOnShown(new EventHandler<WindowEvent>() {
    public void handle(WindowEvent e) {
        System.out.println("shown");
    }
});

MenuItem item1 = new MenuItem("Load Image...");
item1.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("Load Image");
    }
});
SeparatorMenuItem seperator = new SeparatorMenuItem();
SeparatorMenuItem seperator1 = new SeparatorMenuItem();

MenuItem item2 = new MenuItem("Load Pipeline...");
item2.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("load Preprocessing pipeline");
    }
});

MenuItem item3 = new MenuItem("Save Pipeline...");
item2.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("Save Preprocessing pipeline");
    }
});
        
  

MenuItem item4 = new MenuItem("Add");
item2.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("Add Preprocessing Block");
        Rectangle process1 = new Rectangle(10, 75, 180, 50);
        process1.setFill(Color.BLUE);
        process1.setStroke(Color.BLACK);
        
        root.getChildren().add(process1);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
    }
});
MenuItem item5 = new MenuItem("Remove");
item2.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("Remove Preprocessing Block");
    }
});
contextMenuProcess.getItems().addAll(item1, seperator, item2, item3, seperator1, item4, item5);

final ContextMenu contextMenuObject = new ContextMenu();
contextMenuObject.setOnShowing(new EventHandler<WindowEvent>() {
    public void handle(WindowEvent e) {
        System.out.println("showing");
    }
});
contextMenuObject.setOnShown(new EventHandler<WindowEvent>() {
    public void handle(WindowEvent e) {
        System.out.println("shown");
    }
});
MenuItem item1_0 = new MenuItem("Load Pipeline...");
item1.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("Load previously defined pipeline");
    }
});

MenuItem item1_1 = new MenuItem("Save Pipeline...");
item1.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("Load previously defined pipeline");
    }
});

MenuItem item1_2 = new MenuItem("Add");
item1.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("Add object classification block");
    }
});
MenuItem item1_3 = new MenuItem("Remove");
item2.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("Remove object classification block");
    }
});
contextMenuObject.getItems().addAll(item1_0, item1_1,seperator, item1_2, item1_3);

    final ContextMenu contextMenuExplore = new ContextMenu();
contextMenuExplore.setOnShowing(new EventHandler<WindowEvent>() {
    public void handle(WindowEvent e) {
        System.out.println("showing");
    }
});
contextMenuExplore.setOnShown(new EventHandler<WindowEvent>() {
    public void handle(WindowEvent e) {
        System.out.println("shown");
    }
});

MenuItem item2_1 = new MenuItem("Add");
item1.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("About");
    }
});
MenuItem item2_2 = new MenuItem("Remove");
item2.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e) {
        System.out.println("Preferences");
    }
});
contextMenuExplore.getItems().addAll(item2_1, item2_2);


      
        

        Rectangle rect_back = new Rectangle(0, 26, 640, 500);
        rect_back.setFill(Color.web("#404040"));
        
//        Pane paneProcessing = new Pane();
//        paneProcessing.setLayoutX(0);
//        paneProcessing.setLayoutY(26);
//        //paneProcessing.
        
        
        final Rectangle rect_process = new Rectangle(10, 65, 200, 430);
        rect_process.setFill(Color.DARKGRAY);
        rect_process.setStroke(Color.BLACK);
        final Rectangle rect_object = new Rectangle(220, 65, 200, 430);
        rect_object.setFill(Color.DARKGRAY);
        rect_object.setStroke(Color.BLACK);
        final Rectangle rect_explore = new Rectangle(430, 65, 200, 430);
        rect_explore.setFill(Color.DARKGRAY);
        rect_explore.setStroke(Color.BLACK);
        
        //rect_process.setContextMenu(ContextMenuBuilder.create().items(MenuItemBuilder.create().text("menu").build()).build());
        
        rect_process.addEventHandler(MouseEvent.MOUSE_CLICKED,
    new EventHandler<MouseEvent>() {
        @Override public void handle(MouseEvent e) {
            if (e.getButton() == MouseButton.SECONDARY)  
                contextMenuProcess.show(rect_process, e.getScreenX(), e.getScreenY());
        }
});
        rect_object.addEventHandler(MouseEvent.MOUSE_CLICKED,
    new EventHandler<MouseEvent>() {
        @Override public void handle(MouseEvent e) {
            if (e.getButton() == MouseButton.SECONDARY)  
                contextMenuObject.show(rect_object, e.getScreenX(), e.getScreenY());
        }
});
        rect_explore.addEventHandler(MouseEvent.MOUSE_CLICKED,
    new EventHandler<MouseEvent>() {
        @Override public void handle(MouseEvent e) {
            if (e.getButton() == MouseButton.SECONDARY)  
                contextMenuExplore.show(rect_explore, e.getScreenX(), e.getScreenY());
        }
});

        
//        rect_process.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>(){
//
//        @Override
//            public void handle(ContextMenuEvent event) {
//                System.out.println("Process Panel Menu Request!");
//               
//            }
//        });
        rect_process.setOnMousePressed(new EventHandler<MouseEvent>(){

        @Override
            public void handle(MouseEvent event) {
                System.out.println("Process Panel Selected!");
            }
        });
        rect_object.setOnMousePressed(new EventHandler<MouseEvent>(){

        @Override
            public void handle(MouseEvent event) {
                System.out.println("Object Panel Selected!");
            }
        });
        
        rect_explore.setOnMousePressed(new EventHandler<MouseEvent>(){

        @Override
            public void handle(MouseEvent event) {
                System.out.println("Explore Panel Selected!");
            }
        });
        
        
        root.getChildren().add(mb);
        root.getChildren().add(rect_back);
        root.getChildren().add(rect_process);
        root.getChildren().add(rect_object);
        root.getChildren().add(rect_explore);
        
        root.getChildren().add(btn);
        
    
        
      
        
        
        primaryStage.setTitle("Volumetric Tissue Cytometry GUI testing");
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
