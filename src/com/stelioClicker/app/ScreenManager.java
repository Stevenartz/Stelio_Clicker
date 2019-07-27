package com.stelioClicker.app;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ScreenManager {
	private static HashMap<String, Pane> screenMap = new HashMap<>();
	private static Stage primaryStage;
	
	public ScreenManager(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	protected static void addScreen(String name, String fxmlName, Object controller) {
		FXMLLoader loader = new FXMLLoader(App.class.getResource(fxmlName));
		loader.setController(controller);
		try {
			screenMap.put(name, (Pane) loader.load());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected static void removeScreen(String name) {
		screenMap.remove(name);
	}
	
	public static void activate(String name) {
		System.out.println(">>> prim: " + primaryStage.getScene());
		primaryStage.setScene(new Scene(screenMap.get(name)));
	}
}
