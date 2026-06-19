package com.nct._nguyencaothach_quizapp;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import utils.MyAlertSingleton;
import utils.themes.themeTypes;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<themeTypes> cbThemes;
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(themeTypes.values()));
    }
    public void manageQuestion(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("comming soon...");
    }
    
    public void pratice(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("comming soon...");
    }
    
    public void exam(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("comming soon...");
    }

    public void changeTheme (ActionEvent e){
        switch (this.cbThemes.getSelectionModel().getSelectedItem()){
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("css_dark.css").toExternalForm());
                break;
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style_Light.css").toExternalForm());
                break;
            case DEFAULT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style.css").toExternalForm());
                break;
        }
    }
   
}

