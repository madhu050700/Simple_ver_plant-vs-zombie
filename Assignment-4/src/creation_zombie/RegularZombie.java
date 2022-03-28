package creation_zombie;

public class RegularZombie implements Zombie{
	private int health;
	public RegularZombie() {
		this.health = 50;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "R/" + this.getHealth();
	}

	@Override
	public Zombie takeDamage(int d) {
		health -= d;
		// TODO Auto-generated method stub
		if(health<=0) {
			return null;
		}
		return this;
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return this.health;
	}

	@Override
	public void addZombie(Zombie z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeZombie(Zombie z) {
		// TODO Auto-generated method stub
		
	}



}
