import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;


public class DrawingaTruck extends Application{
    @Override
    public void start(Stage myStage) throws Exception{
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(myStage,"Truck",1000, 650);
        gc.setStroke(Color.ORANGE);
        gc.strokeText("Truck",15,27);
        gc.setStroke(Color.INDIGO);
//create a random color
        Random random = new Random();
        int red = random.nextInt(0xFF);
        int blue = random.nextInt(0xFF);
        int green = random.nextInt(0xFF);
        Color randomColor = Color.rgb(red, green, blue);
//Create the rectangle for the body of the truck
        gc.setStroke(Color.DARKBLUE);
        gc.setFill(Color.DARKBLUE);
        gc.fillRect(150,200,500,250);
        gc.strokeRect(150,200,500,250);
//This creates the back tire
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.fillOval(200,400,100,100);
        gc.strokeOval(200,400,100,100);
//This creates the first tire
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.fillOval(500,400,100,100);
        gc.strokeOval(500,400,100,100);
//This creates the blue rectangle that acts as the window
        gc.setStroke(Color.BLUE);
        gc.setFill(Color.BLUE);
        gc.fillRect(500,250,150,100);
        gc.strokeRect(500,250,150,100);





















    gc.setStroke(Color.GREY);
        gc.setFill(Color.GREY);
        gc.fillOval(213,414,75,75);
        gc.strokeOval(213,414,75,75);

        gc.setStroke(Color.GREY);
        gc.setFill(Color.GREY);
        gc.fillOval(513,414,75,75);
        gc.strokeOval(513,414,75,75);












/*
    gc.setStroke(Color.YELLOW);
        gc.setFill(Color.YELLOW);
        gc.fillRect(620,375,30, 15);
        gc.strokeRect(620,375,30,15);

        gc.setStroke(Color.LIGHTYELLOW);
        gc.setFill(Color.LIGHTYELLOW);
        gc.fillOval(635,375,15,15);
        gc.strokeOval(635,375,15,15);

        gc.setStroke(Color.LIGHTYELLOW);
        gc.setFill(Color.LIGHTYELLOW);
        gc.fillOval(620,375,15,15);
        gc.strokeOval(620,375,15,15);
*/
    }
    public static void main(String [] args)
    {
        launch(args);
    }







}
