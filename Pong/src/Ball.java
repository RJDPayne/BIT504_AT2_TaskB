import java.awt.Color;

public class Ball extends Sprite{
	//Declare variables
	private static final int BALL_WIDTH = 25, BALL_HEIGHT = 25;
	private static final Color BALL_COLOUR = Color.WHITE;
	//Constructor
	public Ball(int panelWidth, int panelHeight ) {
		setWidth(BALL_WIDTH);
		setHeight(BALL_HEIGHT);
		setColour(BALL_COLOUR);
		//Set ball initial position as centre of screen and then create it there..
		setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
		resetToInitialPosition();
		
	}
}
