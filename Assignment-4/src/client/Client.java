package client;
import java.util.*;

import creation_zombie.Zombie;
import zombie.*;

public class Client {
	 public static List<Zombie> zombieList = new ArrayList<>();


	public static void main(String[] args) {
	    boolean turn = true;
		Scanner sc = new Scanner(System.in);
		while(turn) {
			System.out.println("Press 1 for Creating Zombies");
			System.out.println("Press 2 for Demo Play");
			System.out.println("Press 3 to  Quit the Play");
			System.out.println("Zombies currently in the Array : "+getZombieInfo());
			int n = sc.nextInt();
			if(n==1) {
				newZombies(sc);
			}
			if(n==2) {
				turn = false;
				break;
			}
			else if(n==3) {
				System.exit(0);
			}
		}
		demo(sc);
	}
		
		public static void newZombies(Scanner sc) {
			System.out.println("Press 1 for Regular Zombie");
			System.out.println("Press 2 for Cone Zombie");
			System.out.println("Press 3 for Bucket Zombie");
			System.out.println("Press 4 for Screen-Door Zombie");
			int m = sc.nextInt();
			if(m==1) {
				zombieList.add(new Regular_zombie().createZombies());
			}
			if(m==2) {
				zombieList.add( new Cone_zombie().createZombies());
			}
			if(m==3) {
				zombieList.add(new Bucket_zombie().createZombies());
			}
			if(m==4) {
				zombieList.add(new Shield_zombie().createZombies());
			}			
			
	}
		public static void demo(Scanner sc) {
			  System.out.println("Please enter damage value.");
		        int d = sc.nextInt();
		        int round = 0;
		        System.out.println("Round " + round + ": " + getZombieInfo());
		        while (!zombieList.isEmpty()) {
		            // Front zombie take damage
		            Zombie zombie = zombieList.remove(0).takeDamage(d);
		            if (zombie != null) { // Zombie still alive
		                zombieList.add(0, zombie);
		            }
		            round++;
		            System.out.println("Round " + round + ": " + getZombieInfo());
		        }
		}
		public static String getZombieInfo() {
	        return Arrays.toString(zombieList.toArray());
	    }

}
	

