import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram{

	private static final int APPLICATION_WIDTH = 400;
	private static final int APPLICATION_HEIGHT = 600;
	
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;
	
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;
	
	private static final int PADDLE_Y_OFFSET = 30;
	
	private static final int NBRICKS_PER_ROW = 10;
	
	private static final int NBRICKS_ROWS = 10;
	
	private static final int BRICK_SEP = 4;
	
	private static final int BRICK_WIDTH = (WIDTH -(NBRICKS_PER_ROW - 1)*BRICK_SEP)/NBRICKS_PER_ROW;
	
	private static final int BRICK_HEIGHT = 8;
	
	private static final int BALL_RADIUS = 10;
	
	private static final int BRICK_Y_OFFSET = 70;
	
	private static final int NTURNS = 70;
	
	private GRect paddle;
	private GRect brick;
	
	//let's have a party:) Good luck, Anya!
	public void run() {
		this.setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
		gameBoard();
		bricksSetting();
		paddle();     
	}
	private void bricksSetting() {
		for (int i = 0; i < NBRICKS_PER_ROW; i++){
		   for (int j = 0; j < NBRICKS_ROWS; j++){
		   int x = (BRICK_SEP +(i*BRICK_WIDTH));
		   int y = (BRICK_SEP +(j*BRICK_HEIGHT));
		   GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);}}
	}
	private void gameBoard() {
		this.setSize(WIDTH, HEIGHT);		
	}
	private void paddle() {
		paddle = new GRect(0, (APPLICATION_HEIGHT - PADDLE_Y_OFFSET), PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		paddle.setFillColor(Color.BLACK);
		add(paddle);
	}
}
