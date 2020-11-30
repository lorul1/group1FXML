/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Staff;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Staff;

public class enterViewController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField enterAssignmentsField;

    @FXML
    private Button enterButton;

    @FXML
    private Label responceLable;

    @FXML
    private Label textChange;

    @FXML
    private TextField enterCourseField;

    @FXML
    private Label responceLable1;

    @FXML
    private TextField enterNameField;

    @FXML
    private Label responceLable2;

    @FXML
    private TextField enterIdField;

    @FXML
    private Label responceLable21;

    @FXML
    private Button backButton;

    @FXML
    private TextField delTextField;

    @FXML
    private Label responceLable211;

    @FXML
    private Button enterButtonDel;

    @FXML
    void backAction(ActionEvent event) {

    }

    @FXML
    void enterAction(ActionEvent event) {

    }

    @FXML
    void enterDelAction(ActionEvent event) {

    }
    
    
    
    
    
    
    
    @FXML
    void backToMain(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (previousScene != null) {
            stage.setScene(previousScene);
        }
    }
    
    
    Staff selectedModel;
    Scene previousScene;
    
    public void setPreviousScene(Scene scene) {
        previousScene = scene;

    }
    
    public void initData(Staff model) {
        selectedModel = model;
    }
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //backToMainButton.setDisable(true);
    }  
}
