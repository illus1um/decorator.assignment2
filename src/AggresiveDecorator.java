class AggressiveDecorator extends EnemyBehaviorDecorator {
    public AggressiveDecorator(EnemyBehavior decoratedBehavior) {
        super(decoratedBehavior);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("Enemy attacks aggressively!");
    }
}