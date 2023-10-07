public abstract class EnemyBehaviorDecorator implements EnemyBehavior {
    protected EnemyBehavior decoratedBehavior;

    public EnemyBehaviorDecorator(EnemyBehavior decoratedBehavior) {
        this.decoratedBehavior = decoratedBehavior;
    }

    public void performAction() {
        decoratedBehavior.performAction();
    }
}