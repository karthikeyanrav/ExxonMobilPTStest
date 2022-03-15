package com.PTW.generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CommonLib {
	public static void filterDate(String dateStam) throws AWTException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate dateTime = LocalDate.parse(dateStam, dtf);
		LocalDate presentDate = LocalDate.now();
		LocalDate afterNextDate = LocalDate.now().plusDays(1);
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_SHIFT);
	}
	
	

}
