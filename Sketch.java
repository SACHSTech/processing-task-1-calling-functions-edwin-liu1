import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(164, 182, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // pedals
    fill(255);
    ellipse(300, 220, 120, 150);
    ellipse(300, 380, 120, 150);
    ellipse(380, 300, 150, 120);
    ellipse(220, 300, 150, 120);

    //the center thing
    fill(255, 255, 0);
	  ellipse(300, 300, 100, 100);
  }
  
  // define other methods down here.
}