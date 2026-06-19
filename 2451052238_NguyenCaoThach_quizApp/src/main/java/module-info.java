module com.nct._nguyencaothach_quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nct._nguyencaothach_quizapp to javafx.fxml;
    exports com.nct._nguyencaothach_quizapp;
}
