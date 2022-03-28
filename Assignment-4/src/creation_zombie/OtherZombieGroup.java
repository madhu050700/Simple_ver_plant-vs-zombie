package creation_zombie;

import java.util.ArrayList;
import java.util.List;


public abstract class OtherZombieGroup implements Zombie {
	
	List<Zombie> zombie = new ArrayList<Zombie>();
	

	@Override
	public abstract Zombie takeDamage(int d);
	@Override
	public void addZombie(Zombie z) {
		zombie.add(z);
		
	}

	@Override
	public void removeZombie(Zombie z) {
		zombie.remove(z);
		
	}

	@Override
	public abstract int getHealth();
		
	@Override
	public abstract String toString();


}
