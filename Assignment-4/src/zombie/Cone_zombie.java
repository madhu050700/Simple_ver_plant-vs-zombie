package zombie;


import creation_zombie.OtherZombieGroup;
import creation_zombie.ConeZombie;

public class Cone_zombie extends ZombieFactory {

	@Override
	public OtherZombieGroup createZombies() {
		return new ConeZombie();
		// TODO Auto-generated method stub
		
	}

}
