public  class SpeedHero extends SuperHero{
    public final static int DAMAGE = 7;
    public SpeedHero(String name, int hp){
        super(name,hp);
    }

    @Override
    public void attack(SuperHero enemy) {
        for(int i =0; i < 2; i++){
            enemy.takeDamage(DAMAGE);
            System.out.println(this.name + " frappe rapidement " + enemy.name);
            System.out.println(enemy.name + " subit " + DAMAGE + " dégât. Points de vie restants " + (enemy.getHp() > 0 ? enemy.getHp() : 0));
        }

    }
}
