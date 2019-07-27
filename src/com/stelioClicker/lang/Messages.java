package com.stelioClicker.lang;

import java.util.Locale;
import java.util.ResourceBundle;

public class Messages {

	private ResourceBundle resourceBundle;
	
	public Messages() {
		resourceBundle = ResourceBundle.getBundle("Messages", new Locale("EN"));
	}
	
}
