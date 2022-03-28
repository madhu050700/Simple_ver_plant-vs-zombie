package zombie;

import creation_zombie.ScreenZombie;
import creation_zombie.OtherZombieGroup;

public class Screen_zombie extends ZombieFactory {

	@Override
	public OtherZombieGroup createZombies() {
		return new ScreenZombie();
		// TODO Auto-generated method stub
		
	}

}
