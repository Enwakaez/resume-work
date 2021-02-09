/*Emmanuel Nwakaeze*/
import javafx.geometry.Insets;   
import javafx.scene.control.*;   
import javafx.scene.layout.GridPane;   
import javafx.scene.layout.Pane;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.beans.value.*;

public class ChangeColors extends Application
{
      private RadioButton redButton;
      private RadioButton blueButton;
      private RadioButton greenButton;
      public static void main(String[] args)
   {   
      launch(args); //JavaFX appplication
   }
   public void start(Stage primaryStage) //main entry point of JavaFX application         
   {
      Pane root = createRootPane();
      primaryStage.setScene(new Scene(createRootPane()));
      primaryStage.setTitle("Emmanuel GRB Pane"); //name of window
      primaryStage.show();
                          
   }
   private Pane createRootPane()                      
   {
      ToggleGroup group = new ToggleGroup();
      redButton = new RadioButton("Red");
      redButton.setToggleGroup(group);
         
      greenButton = new RadioButton("Green");
      greenButton.setToggleGroup(group);
      
      blueButton = new RadioButton("Blue");
      blueButton.setToggleGroup(group);
      //Creating buttons 
      
      GridPane pane = new GridPane(); //Creating Pane size and buttons             
                                      
            pane.add(redButton, 0, 2);                                          
            pane.add(greenButton, 2, 2);
            pane.add(blueButton, 4, 2);                     
                            
            pane.setHgap(10);                              
            pane.setVgap(10);                              
                                   
            pane.setPadding(new Insets(20, 20, 20, 20));              
            pane.setMinHeight(200);              
            pane.setMinWidth(300);
           
      group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() // listener for button selection and if/else if condition for button toggle
   {
      public void changed(ObservableValue<? extends Toggle> ob,Toggle o, Toggle n)
   {   
      RadioButton rb = (RadioButton)group.getSelectedToggle();
      Color color = Color.RED;
      
      if (rb == redButton)   
         color = Color.RED;
      
      else if(rb == greenButton)   
         color = Color.GREEN;
      
      else if(rb == blueButton)   
         color = Color.BLUE;
      
      pane.setBackground(new Background(new BackgroundFill(color,CornerRadii.EMPTY, Insets.EMPTY))); //pane change
   }
});
return pane;
}   
}                            
           