import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import java.util.Random;


public class DrawingShapes extends Application{
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
    }
    public static void main(String [] args)
    {
        launch(args);
    }







}
