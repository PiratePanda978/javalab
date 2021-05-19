import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Q2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox rootPane = new VBox(10);
        rootPane.setPadding(new Insets(15, 5, 15, 5));
        Scene scene = new Scene(rootPane, 320, 240);
        String commonStyles = "-fx-background-color: white;" +"-fx-font-family: 'Times New Roman';" +"-fx-font-size: 20px;" +"-fx-font-weight: bold;" +"-fx-border-style: solid;" +"-fx-border-color: yellow;";
        Label label1 = new Label("Name : Anupam Kunwar");
        Label label2 = new Label("ID : 19BCE1369");
        Label label3 = new Label("Phone : XXX233XXX");
        label1.setStyle(commonStyles+"-fx-text-fill: black;");
        label2.setStyle(commonStyles+"-fx-text-fill: blue;");
        label3.setStyle(commonStyles+"-fx-text-fill: cyan;");
        rootPane.getChildren().addAll(label1,label2,label3);
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.setTitle("Question 2");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}