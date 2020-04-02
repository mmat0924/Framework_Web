package ToolsQA;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends base {
	
	
	 @Test
	 public void navigateToHome() throws IOException {
	 
	 driver=initializeDriver();
	 driver.get("https://www.google.com/"); 
	 }
	 
	
	
	/*
	 * @Test public void hello() { System.out.println("Hey, there!"); }
	 */
}
