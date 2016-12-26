import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Sander on 26.12.2016.
 */
public class Stock {                        //Siia aknasse tulevad lahtrid ja jookide algsed kogused

    public static void display() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        GridPane Aken2 = new GridPane();
        Aken2.getChildren().addAll();

        Scene stockaken = new Scene(Aken2);
        window.setScene(stockaken);
        window.show();
         }
}