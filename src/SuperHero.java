public  abstract class  SuperHero {
    public String name;
    public int hp;

    public SuperHero(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public abstract void attack(SuperHero enemy);

    public void takeDamage(int amount){
        this.hp -= amount;
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
