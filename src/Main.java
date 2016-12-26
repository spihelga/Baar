import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {
    Stage window;
    Button Alusta;
    Scene Avaaken, stockaken;

    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tudengibaar");

        window = new Stage();
        VBox Aken1 = new VBox(20);
        Aken1.setPadding(new Insets(10, 10, 10, 10));

        //Tekst kastis
        Label Avatekst = new Label("See programm aitab sul kokteile segada");
        Aken1.setAlignment(Pos.CENTER);

        //Alustamise nupp
        Alusta = new Button("Alusta");
        Alusta.setOnAction(e -> Stock.display());

        Aken1.getChildren().addAll(Avatekst, Alusta);
        Avaaken = new Scene(Aken1, 300, 120);

        //Teine aken
        GridPane Aken2 = new GridPane();

        stockaken = new Scene(Aken2);

        primaryStage.setScene(Avaaken);
        primaryStage.show();
    }







    public static void Andmed(String[] args) {
        System.out.println("Kui palju rummi sul on? (L)");
        Scanner srum = new Scanner(System.in);
        double ruml = srum.nextDouble();
        System.out.println("Kui palju colat sul on? (L)");
        double colal = srum.nextDouble();
        System.out.println("Sul on " + ruml + " L rummi ja " + colal + " L colat");
        double kontroll = ruml / colal;
        System.out.println(kontroll);
        double koka = colal / 0.2;
        double rumm = ruml / 0.05;

        if (kontroll > 0.25)
            System.out.println("Saad teha " + koka + " 250 ml rumcolat");
        else
            System.out.println("Saad teha " + rumm + " 250 ml rumcolat");
    }
}