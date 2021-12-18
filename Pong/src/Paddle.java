import java.awt.Color;

public class Paddle extends Sprite{
	private static final int PADDLE_WIDTH = 10, PADDLE_HEIGHT = 100, PADDLE_DISTANCE_FROM_EDGE = 40;
	private static final Color PADDLE_COLOUR = Color.WHITE;
	
	public Paddle(Player player, int panelWidth, int panelHeight) {
		setWidth(PADDLE_WIDTH);
		setHeight(PADDLE_HEIGHT);
		setColour(PADDLE_COLOUR);
		int xPos;
		
		if (player == Player.One) {
			xPos = PADDLE_DISTANCE_FROM_EDGE;
		}
		else {
			xPos = panelWidth - PADDLE_DISTANCE_FROM_EDGE - getWidth();
		}
		
		setInitialPosition(xPos, panelHeight / 2 - (getHeight()/2));
		resetToInitialPosition();
		
	}
	
}
