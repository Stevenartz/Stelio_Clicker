package com.stelioClicker.controller;

import java.io.IOException;

import com.stelioClicker.app.Scenes;
import com.stelioClicker.app.ScreenManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {

	private Stage primaryStage;
	
	public MainMenuController(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnClose;

    @FXML
    void btnOnActionPlay(ActionEvent event) {
    	System.out.println(">>> Show Play-Field");
    }

    @FXML
    void btnOnActionSettings(ActionEvent event) {
    	ScreenManager.activate(Scenes.SETTINGS_WINDOW.toString());
    }

    @FXML
    private void btnOnActionClose() {
    	primaryStage.close();
    }
	
}
