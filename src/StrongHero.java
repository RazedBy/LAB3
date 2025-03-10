public  class StrongHero extends  SuperHero{
    public final static int DAMAGE = 12;
    public StrongHero(String name, int hp){
        super(name,hp);
    }

    @Override
    public void attack(SuperHero enemy) {
        enemy.takeDamage(DAMAGE);
        System.out.println(this.name + " frappe puissamment " + enemy.name);
        System.out.println(enemy.name + " subit " + DAMAGE + " dégât. Points de vie restants " + (enemy.getHp() > 0 ? enemy.getHp() : 0));    }
}
