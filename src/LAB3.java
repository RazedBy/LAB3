public class LAB3 {
    public static void main(String[] args) {
        SuperHero hero1 = new SpeedHero("Superman", 100);
        SuperHero hero2 = new StrongHero("Batman", 90);
        SuperHero hero3 = new TelepathHero("Magneto", 70);
        SuperHero hero4 = new SpeedHero("Spider-Man", 100);
        BattleArea.fight(hero1, hero2);
        BattleArea.fight(hero3, hero4);
    }
}