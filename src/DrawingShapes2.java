import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;


public class DrawingShapes2 extends Application{
    @Override
    public void start(Stage myStage) throws Exception{
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(myStage,"Drawing Shapes",700, 400);
        gc.setStroke(Color.ORANGE);
        gc.strokeText("Ashton",15,27);
        gc.setStroke(Color.INDIGO);
        gc.strokeLine(35,78,200,300);
        Random random = new Random();
        int red = random.nextInt(0xFF);
        int blue = random.nextInt(0xFF);
        int green = random.nextInt(0xFF);
        Color randomColor = Color.rgb(red, green, blue);
        gc.setStroke(randomColor);
        gc.setLineWidth(10);
        gc.strokeLine(50,50,500,500);
        gc.setStroke(randomColor);
        gc.fillRect(200,200,50,50);
        gc.strokeRect(200,200,50,50);

        gc.setStroke(randomColor);
        gc.fillOval(100,200,50,100);
        gc.strokeOval(200,200,50,50);

        gc.setStroke(randomColor);
        gc.fillRect(200,200,50,50);
        gc.strokeRect(200,200,50,50);

        gc.setStroke(randomColor);
        gc.fillOval(100,200,50,100);
        gc.strokeOval(200,200,50,50);

    }
    public static void main(String [] args)
    {
        launch(args);
    }







}
