package entities;

import java.awt.Rectangle;

public class Hitbox extends Rectangle {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int dmg, knockback, xdif, ydif;
	public long duration;
	public long timeStarted;
	public Entity e;

	/**
	 * Hitbox entity
	 * 
	 * @param dmg
	 *            Damage dealt by hitbox
	 *
	 * @param knockback
	 *            Knockback of hitbox
	 *
	 * @param duration
	 *            Duration hitbox lasts till self-destruct
	 */
	public Hitbox(int dmg, int xdif, int ydif, int w, int h, int knockback, int duration, Entity e) {
		this.dmg = dmg;
		this.width = w;
		this.height = h;
		this.knockback = knockback;
		this.duration = duration;
		this.xdif = xdif;
		this.ydif = ydif;
		timeStarted = System.currentTimeMillis();
		this.e = e;
	}
	public Hitbox reset(){
		timeStarted = System.currentTimeMillis();
		return this;
		
		
	}
	public void setE(Entity in) {
		e = in;
	}

	public void update() {
		System.out.println(e);
		x = e.x + xdif;
		y = e.y + ydif;
	}

}
