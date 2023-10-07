public class Main {
    public static void main(String[] args) {
        EnemyBehavior basicEnemy = new BasicBehavior();

        EnemyBehavior aggressiveEnemy = new AggressiveDecorator(basicEnemy);

        EnemyBehavior defensiveAggressiveEnemy = new DefensiveDecorator(aggressiveEnemy);

        System.out.println("Basic Enemy Behavior:");
        basicEnemy.performAction();

        System.out.println("\nAggressive Enemy Behavior:");
        aggressiveEnemy.performAction();

        System.out.println("\nDefensive Aggressive Enemy Behavior:");
        defensiveAggressiveEnemy.performAction();
    }
}