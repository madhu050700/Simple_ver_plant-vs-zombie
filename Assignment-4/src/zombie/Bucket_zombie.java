package zombie;


import creation_zombie.OtherZombieGroup;
import creation_zombie.BucketZombie;

public class Bucket_zombie extends ZombieFactory {

	@Override
	public OtherZombieGroup createZombies() {
		return new BucketZombie();
		// TODO Auto-generated method stub
		
	}

}
