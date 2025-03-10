public class BattleArea {
    public static int totalFight = 0;

    private BattleArea() {}

    public static void fight(SuperHero super1, SuperHero super2) {
        int nbRound = 0;
        totalFight++;

        System.out.println("=== Combat n°" + totalFight + " ===");

        while (super1.isAlive() && super2.isAlive()) {
            nbRound++;
            System.out.println("\u001B[31m --- Round " + nbRound + " --- \u001B[0m");

            super1.attack(super2);
            if (super2.isAlive()) {
                super2.attack(super1);
            }
        }


        if (super1.isAlive()) {
            System.out.println("🏆 " + super1.getName() + " remporte le combat !");
        } else {
            System.out.println("🏆 " + super2.getName() + " remporte le combat !");
        }
    }
}