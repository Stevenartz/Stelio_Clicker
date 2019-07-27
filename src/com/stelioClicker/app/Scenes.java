package com.stelioClicker.app;

public enum Scenes {

	MAIN_MENU("mainMenu"),
	SETTINGS_WINDOW("settingsWindow");
	
	
	private final String text;
	
	Scenes(final String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
}
