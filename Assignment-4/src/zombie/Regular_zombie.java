package zombie;

import creation_zombie.RegularZombie;
import creation_zombie.Zombie;

public class Regular_zombie extends ZombieFactory {

	@Override
	public Zombie createZombies() {
		return new RegularZombie();
		// TODO Auto-generated method stub
		
	}

}
