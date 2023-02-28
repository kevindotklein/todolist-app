package gui;

import java.awt.Color;

import javax.swing.JComboBox;

public class Utils {
	
	public static final Color pColor = new Color(135, 206, 235);
	public static final Color sColor = new Color(240, 240, 240);
	
	public Utils() {}
	
	public static String getCategoryName(JComboBox<String> category) {
		return category.getSelectedItem().toString();
	}
}