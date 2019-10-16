import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;


public class DrawingaTruck extends Application{
    @Override
    public void start(Stage myStage) throws Exception{
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(myStage,"Drawing Shapes",1000, 650);
        gc.setStroke(Color.ORANGE);
        gc.strokeText("Truck",15,27);
        gc.setStroke(Color.INDIGO);

        Random random = new Random();
        int red = random.nextInt(0xFF);
        int blue = random.nextInt(0xFF);
        int green = random.nextInt(0xFF);
        Color randomColor = Color.rgb(red, green, blue);

        gc.setStroke(randomColor);
        gc.fillRect(150,200,500,250);
        gc.strokeRect(150,200,500,250);

        gc.setStroke(Color.RED);
        gc.setFill(Color.RED);
        gc.fillOval(200,400,100,85);
        gc.strokeOval(200,400,100,85);

        gc.setStroke(Color.RED);
        gc.setFill(Color.RED);
        gc.fillOval(500,400,100,100);
        gc.strokeOval(500,400,100,100);

        gc.setStroke(Color.BLUE);
        gc.setFill(Color.BLUE);
        gc.fillRect(500,250,150,100);
        gc.strokeRect(500,250,150,100);




    }
    public static void main(String [] args)
    {
        launch(args);
    }







}
