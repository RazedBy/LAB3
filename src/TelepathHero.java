import java.util.Random;
public  class TelepathHero extends SuperHero {
    public final static int DAMAGE = 10;
    public Random random = new Random();
    public int critical;
    public TelepathHero(String name,int hp){
        super(name,hp);
        this.critical = this.random.nextInt(2);
    }

    @Override
    public void attack(SuperHero enemy) {
        if (critical == 1) {
            enemy.takeDamage(DAMAGE);
            System.out.println(this.name + " frappe normal " + enemy.name);
            System.out.println(enemy.name +" subit "+ DAMAGE +" dégât. Points de vie restants "+enemy.getHp());
        }else{
            enemy.takeDamage(DAMAGE*2);
            System.out.println(this.name + " frappe critique " + enemy.name);
            System.out.println(enemy.name + " subit " + DAMAGE + " dégât. Points de vie restants " + (enemy.getHp() > 0 ? enemy.getHp() : 0));
        }
    }
}
