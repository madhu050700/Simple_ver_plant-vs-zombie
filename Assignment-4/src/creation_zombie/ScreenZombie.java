package creation_zombie;


public class ScreenZombie extends OtherZombieGroup {

	private int health;
	private Zombie zombie;
	
	
	public ScreenZombie() {
		this.health = 25;
		this.zombie = new regularzombie();
	}
	
	@Override
	public  Zombie takeDamage(int d) {
		health -= d;
		if (health <= 0) { 
			
				if(zombie ==null) {
					return null;
				}
				return zombie.takeDamage(0-health);
			}
        return this;
	};
	@Override
	public int getHealth() {
		
			if(zombie ==null) {
				return health;
			}
			return health + zombie.getHealth();
	};

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "S/" + this.getHealth();
	}
}
