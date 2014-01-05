package net.obviam.starassult.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Block {
	
	private static final float SIZE = 1f;
	Vector2 position = new Vector2();
	Rectangle bounds = new Rectangle();
	
	public Block(Vector2 pos){
		this.position = pos;
		this.bounds.width = getSize();
		this.bounds.height = getSize();
	}
	
	public Rectangle getBounds(){
		return bounds;
	}
	
	public Vector2 getPosition(){
		return position;
	}

	public static float getSize() {
		return SIZE;
	}
	
}
