package net.obviam.starassult.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bob {

	public enum State {
		IDLE, WALKING, JUMPING, DYING
	}
	
	private static final float SPEED = 4f; // unit per second
	static final float JUMP_VELOCITY = 1f;
	private static final float SIZE = 0.5f; // half a unit
	
	float stateTime = 0;
	
	Vector2 position = new Vector2();
	Vector2 acceleration = new Vector2();
	Vector2 velocity = new Vector2();
	Rectangle bounds = new Rectangle();
	State state = State.IDLE;
	boolean facingLeft = true;

	
	public Bob(Vector2 position){
		this.position = position;
		this.bounds.height = getSize();
		this.bounds.width = getSize();
	}
	
	public void setState(State newState) {
		this.state = newState;
	}
	
	public void update(float delta) {
		stateTime += delta;
		position.add(velocity.cpy().scl(delta));
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

	public static float getSpeed() {
		return SPEED;
	}
	
	public Vector2 getVelocity(){
		return velocity;
	}
	
	public Vector2 getAcceleration(){
		return acceleration;
	}
	
	public void setFacingLeft(boolean status){
		facingLeft = status;
	}
	
	public boolean isFacingLeft(){
		return facingLeft;
	}

	public State getState() {
		return state;
	}

	public float getStateTime() {
		return stateTime;
	}
}
