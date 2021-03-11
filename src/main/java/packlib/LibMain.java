  package packlib;

import javafx.stage.Stage;
import javafx.application.Application;
import packlib.scenes.NewScene;

public class LibMain extends Application {
    public static Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        primaryStage.setTitle("Library");
        (new NewScene("Menu.fxml")).setScene();
        primaryStage.show();
    }

    public static Stage getPrimaryStage() {
        return stage;
    }
    public static void main(String[] args) {
        Database.createNewDB();
        launch(args);
    }
}