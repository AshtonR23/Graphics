
import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;


    public class ShellGraphicsApplication extends Application
    {
        @Override
        public void start( Stage stage)
        {
            //set up window title and size
            GraphicsContext gc = JIGraphicsUtility.setUpGraphics(
                    stage,"Shell Graphics Application",700,400);
            // your drawing goes here
        }
        public static void main(String [] args)
        {
            launch( args );
        }
    }

