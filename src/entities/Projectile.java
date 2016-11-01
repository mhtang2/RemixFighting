package entities;

import graphics.Texture;

public class Projectile extends Entity {
	public int damage;
	public int dur;
	public long start;
	public Hitbox hit;

	public Projectile(int x, int y, int w, int h, int xvel, int yvel, int damage, int dur, String s) {
		super(x, y, w, h, 0, new Texture("/res/sprites/" + s + ".png", w, h));
		this.x = x;
		this.y = y;
		this.damage = damage;
		this.dur = dur;
		this.xvel = xvel;
		this.yvel = yvel;
		hit = new Hitbox(damage, 0, 0, w, h, 0, 0, dur, this, 0, true);
		start = System.currentTimeMillis();
	}

	public void update() {
		x = x + xvel;
		y = y + yvel;
	}

	public boolean expired() {
		return System.currentTimeMillis() - start > dur;

	}

}
