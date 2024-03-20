import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Write a description of JavaFX class Example here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example extends Application
{
    // We keep track of the count, and label displaying the count:
    private int count = 0;
    private Label myLabel = new Label("0");

    /**
     * The start method is the main entry point for every JavaFX application. 
     * It is called after the init() method has returned and after 
     * the system is ready for the application to begin running.
     *
     * @param  stage the primary stage for this application.
     */
    @Override
    public void start(Stage stage)
    {
        // Create a Button or any control item
        Button increase = new Button("Increase");
        Button decrease = new Button("Decrease");
        Button reset = new Button("Reset");

        // Create a new grid pane
        GridPane pane = new GridPane();
        //top, bottom, left, right
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);

        //set an action on the button using method reference
        increase.setOnAction(this::buttonClickIncrement);
        decrease.setOnAction(this::buttonClickDecrement);
        reset.setOnAction(this::reset);

        // Add the button and label into the pane
        pane.add(myLabel, 5, 0);
        pane.add(increase, 0, 0);
        pane.add(decrease, 0, 2);
        pane.add(reset, 0, 4);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 300,100);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    /**
     * This will be executed when the button is clicked
     * It increments the count by 1
     */
    private void buttonClickIncrement(ActionEvent event)
    {
        // Increase number of button clicks and shows the result on a label
        count = count + 1;
        myLabel.setText(Integer.toString(count));
    }
    
    private void buttonClickDecrement(ActionEvent event)
    {
        // Decrease number of button clicks and shows the result on a label
        count = count - 1;
        myLabel.setText(Integer.toString(count));
    }
    
    private void reset(ActionEvent event)
    {
        // Reset number of button clicks and shows the result on a label
        count = 0;
        myLabel.setText(Integer.toString(count));
    }
}
