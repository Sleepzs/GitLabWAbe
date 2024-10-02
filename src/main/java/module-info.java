module org.example.githubwabe {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.githubwabe to javafx.fxml;
    exports org.example.githubwabe;
}