import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Scanner;
import java.util.Random;



public class DrawingTown extends Application {
    public static final int SIZE = 4;


    @Override
    public void start(Stage myStage) throws Exception {
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(myStage, "Drawing a Town", 800, 800);
        gc.setStroke(Color.ORANGE);
        gc.strokeText("Ashton's Town", 15, 27);
        gc.setStroke(Color.INDIGO);
        Random random = new Random();
        int red = random.nextInt(0xFF);
        int blue = random.nextInt(0xFF);
        int green = random.nextInt(0xFF);
        Color randomColor = Color.rgb(red, green, blue);
        gc.setStroke(randomColor);

            //daytime background
//This part creates the background for the daytime
            gc.setStroke(Color.CYAN);
            gc.setFill(Color.CYAN);
            gc.strokeRect(0, 0, 800, 800);
            gc.fillRect(0, 0, 800, 800);
//This part creates the circle for the sun
            gc.setStroke(Color.YELLOW);
            gc.setFill(Color.YELLOW);
            gc.strokeOval(600, 100, 100, 100);
            gc.fillOval(600, 100, 100, 100);

//This part creates the rays for the sun

//Vertical Ray
            gc.setStroke(Color.YELLOW);
            gc.setFill(Color.YELLOW);
            gc.setLineWidth(6);
            gc.strokeLine(650, 50, 650, 250);
//Horizontal Ray
            gc.setStroke(Color.YELLOW);
            gc.setFill(Color.YELLOW);
            gc.setLineWidth(6);
            gc.strokeLine(550, 150, 750, 150);
//Diagonal ray facing left
            gc.setStroke(Color.YELLOW);
            gc.setFill(Color.YELLOW);
            gc.setLineWidth(6);
            gc.strokeLine(575, 75, 725, 225);
//Diagonal ray facing right
            gc.setStroke(Color.YELLOW);
            gc.setFill(Color.YELLOW);
            gc.setLineWidth(6);
            gc.strokeLine(575, 225, 725, 75);


            //This part will create the night time background
/*
        //This part creates the background for the nighttime
        gc.setStroke(Color.DARKBLUE);
        gc.setFill(Color.DARKBLUE);
        gc.strokeRect(0, 0, 800, 800);
        gc.fillRect(0, 0, 800, 800);
//This part creates the circle for the moon
        gc.setStroke(Color.FLORALWHITE);
        gc.setFill(Color.FLORALWHITE);
        gc.strokeOval(600, 100, 100, 100);
        gc.fillOval(600, 100, 100, 100);

        gc.setStroke(Color.GREY);
        gc.setFill(Color.GREY);
        gc.fillOval(200,200,75,50);
        gc.strokeOval(200,200,75,50);

        gc.setStroke(Color.GREY);
        gc.setFill(Color.GREY);
        gc.fillOval(220,175,75,50);
        gc.strokeOval(220,175,75,50);

        gc.setStroke(Color.GREY);
        gc.setFill(Color.GREY);
        gc.fillOval(235,200,75,50);
        gc.strokeOval(235,200,75,50);
*/

//Ground
//This part creates the ground for the city
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.strokeRect(0, 705, 800, 100);
        gc.fillRect(0, 705, 800, 100);

        gc.setStroke(Color.LIGHTYELLOW);
        gc.setFill(Color.LIGHTYELLOW);
        gc.setLineWidth(5);
        gc.strokeLine(50, 750, 150, 750);
        gc.strokeLine(250, 750, 350, 750);
        gc.strokeLine(450, 750, 550, 750);
        gc.strokeLine(650, 750, 750, 750);


//Building 1
//This part creates the rectangle for the outer part of the building
        gc.setStroke(Color.DARKGREY);
        gc.setFill(Color.DARKGREY);
        gc.strokeRect(50, 350, 150, 350);
        gc.fillRect(50, 350, 150, 350);
//This part creates the inner rectangle part of the building
        gc.setStroke(Color.LIGHTBLUE);
        gc.setFill(Color.LIGHTBLUE);
        gc.strokeRect(75, 375, 100, 325);
        gc.fillRect(75, 375, 100, 325);
//This part creates the lines that create the window panes
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(2);

        gc.strokeLine(75, 390, 175, 390);
        gc.strokeLine(75, 430, 175, 430);
        gc.strokeLine(75, 470, 175, 470);
        gc.strokeLine(75, 510, 175, 510);
        gc.strokeLine(75, 550, 175, 550);
        gc.strokeLine(75, 590, 175, 590);
        gc.strokeLine(75, 630, 175, 630);

//Building 2
//This part creates the rectangle for the outer part of the building
        gc.setStroke(Color.DARKGREY);
        gc.setFill(Color.DARKGREY);
        gc.strokeRect(250, 300, 100, 400);
        gc.fillRect(250, 300, 100, 400);
//This part creates the inner rectangle part of the building
        gc.setStroke(Color.LIGHTBLUE);
        gc.setFill(Color.LIGHTBLUE);
        gc.strokeRect(275, 325, 50, 375);
        gc.fillRect(275, 325, 50, 375);
//This part creates the lines that create the window panes

        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeLine(285, 325, 285, 700);
        gc.strokeLine(300, 325, 300, 700);
        gc.strokeLine(315, 325, 315, 700);






// Building 3
//This part creates the rectangle for the outer part of the building
        gc.setStroke(Color.DARKGREY);
        gc.setFill(Color.DARKGREY);
        gc.strokeRect(400, 325, 100, 375);
        gc.fillRect(400, 325, 100, 375);
//This part creates the inner rectangle part of the building
        gc.setStroke(Color.LIGHTBLUE);
        gc.setFill(Color.LIGHTBLUE);
        gc.strokeRect(425, 350, 50, 350);
        gc.fillRect(425, 350, 50, 350);

//This part creates the lines that create the window panes
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeLine(425, 390, 475, 360);
        gc.strokeLine(425, 430, 475, 390);
        gc.strokeLine(425, 470, 475, 430);
        gc.strokeLine(425, 510, 475, 470);
        gc.strokeLine(425, 550, 475, 510);
        gc.strokeLine(425, 590, 475, 550);
        gc.strokeLine(425, 630, 475, 590);
        gc.strokeLine(425, 660, 475, 660);


        // Building 4
//This part creates the rectangle for the outer part of the building
        gc.setStroke(Color.DARKGREY);
        gc.setFill(Color.DARKGREY);
        gc.strokeRect(550, 275, 125, 425);
        gc.fillRect(550, 275, 125, 425);
//This part creates the inner rectangle part of the building
        gc.setStroke(Color.LIGHTBLUE);
        gc.setFill(Color.LIGHTBLUE);
        gc.strokeRect(575, 300, 75, 400);
        gc.fillRect(575, 300, 75, 400);
//This part creates the size for the windows on the building

        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeLine(575, 330, 650, 330);
        gc.strokeLine(575,360 , 650, 360);
        gc.strokeLine(575, 390, 650, 390);
        gc.strokeLine(575, 420, 650, 420);
        gc.strokeLine(575, 450, 650, 450);
        gc.strokeLine(575, 480, 650, 480);
        gc.strokeLine(575, 510, 650, 510);
        gc.strokeLine(575, 540, 650, 540);
        gc.strokeLine(575, 570, 650, 570);
        gc.strokeLine(575, 600, 650, 600);
        gc.strokeLine(575, 630, 650, 630);


        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeLine(590, 300, 590, 700);
        gc.strokeLine(605, 300, 605, 700);
        gc.strokeLine(620, 300, 620, 700);
        gc.strokeLine(635, 300, 635, 700);

//This part creates a car on the road

        //Create the rectangle for the body of the truck
        gc.setStroke(Color.GREEN);
        gc.setFill(Color.GREEN);
        gc.fillRect(150,690,100,50);
        gc.strokeRect(150,690,100,50);
//This creates the back tire
        gc.setStroke(Color.RED);
        gc.setFill(Color.RED);
        gc.fillOval(160,730,20,20);
        gc.strokeOval(160,730,20,20);
//This creates the front tire
        gc.setStroke(Color.RED);
        gc.setFill(Color.RED);
        gc.fillOval(220,730,20,20);
        gc.strokeOval(220,730,20,20);
//This creates the blue rectangle that acts as the window
        gc.setStroke(Color.BLUE);
        gc.setFill(Color.BLUE);
        gc.fillRect(225,700,25,15);
        gc.strokeRect(225,700,25,15);
//This part creates the cloud in the sky
        gc.setStroke(Color.WHITE);
        gc.setFill(Color.WHITE);
        gc.fillOval(200,200,75,50);
        gc.strokeOval(200,200,75,50);

        gc.setStroke(Color.WHITE);
        gc.setFill(Color.WHITE);
        gc.fillOval(220,175,75,50);
        gc.strokeOval(220,175,75,50);

        gc.setStroke(Color.WHITE);
        gc.setFill(Color.WHITE);
        gc.fillOval(235,200,75,50);
        gc.strokeOval(235,200,75,50);







    }
}
