class DefensiveDecorator extends EnemyBehaviorDecorator {
    public DefensiveDecorator(EnemyBehavior decoratedBehavior) {
        super(decoratedBehavior);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("Enemy defends itself!");
    }
}