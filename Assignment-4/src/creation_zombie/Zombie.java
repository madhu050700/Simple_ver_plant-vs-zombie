package creation_zombie;

public interface Zombie {
  public Zombie takeDamage(int d);
  public int getHealth();
  public String toString();
  public void addZombie(Zombie z);
  public void removeZombie(Zombie z);
}
