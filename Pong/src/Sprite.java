import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	//declare variables
	private int xPosition, yPosition, xVelocity, yVelocity, width, height, initialXPosition, initialYPosition;
	private Color colour;
	
	//Getters
	public int getxPosition(){	return xPosition;}
	public int getyPosition(){	return yPosition;}
	public int getxVelocity(){	return xVelocity;}
	public int getyVelocity(){	return yVelocity;}
	public int getWidth(){	return width;}
	public int getHeight(){	return height;}
	public Color getColour() {return colour;}
	
	public Rectangle getRectangle() {
		return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
	}
	
	
	//Setters
	public void setxPosition(int xPosition){	this.xPosition=xPosition;}
	public void setyPosition(int yPosition){	this.yPosition=yPosition;}
	public void setxVelocity(int xVelocity){	this.xVelocity=xVelocity;}
	public void setyVelocity(int yVelocity){	this.yVelocity=yVelocity;}
	public void setWidth(int Width){	this.width=Width;}
	public void setHeight(int Height){	this.height=Height;}
	public void setColour(Color colour) {this.colour = colour;}
	
	public void setInitialPosition(int xPosition, int yPosition) {
		this.initialXPosition = xPosition;
		this.initialYPosition = yPosition;
	}

	public void setxPosition(int xPosition, int panelWidth){	
		if(xPosition<=0) {this.xPosition = 0;}
		else if (xPosition>panelWidth-width){this.xPosition = panelWidth - width;}
		else {	this.xPosition=xPosition;	}
	}

	public void setyPosition(int yPosition, int panelHeight){	
	if(yPosition<=0) {this.yPosition = 0;}
	else if (yPosition>=(panelHeight-height)){this.yPosition = panelHeight - height;}
	else {	this.yPosition=yPosition;	}
	}

	//Methods
	public void resetToInitialPosition() {
	setxPosition(initialXPosition);
	setyPosition(initialYPosition);
	}



}

