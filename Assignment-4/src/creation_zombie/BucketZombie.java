package creation_zombie;

public class BucketZombie extends OtherZombieGroup{
	private int health;
	private Zombie zombie;
	
	
	public BucketZombie() {
		this.health = 100;
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
		 return "B/" + this.getHealth();
	}
}
