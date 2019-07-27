package com.stelioClicker.app;

import com.stelioClicker.controller.MainMenuController;
import com.stelioClicker.controller.SettingsWindowController;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		new ScreenManager(primaryStage);
		ScreenManager.addScreen(Scenes.MAIN_MENU.toString(), "MainMenu.fxml", new MainMenuController(primaryStage));
		ScreenManager.addScreen(Scenes.SETTINGS_WINDOW.toString(), "SettingsWindow.fxml", new SettingsWindowController());
		ScreenManager.activate(Scenes.MAIN_MENU.toString());
		
		primaryStage.setTitle("Titel");
		primaryStage.show();
	}

	/**
	 * Main method
	 * @param args JVM arguments
	 */
	public static void main(String... args) {
		launch(args);
	}
}
