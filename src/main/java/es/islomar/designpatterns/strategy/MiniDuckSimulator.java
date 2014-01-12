package es.islomar.designpatterns.strategy;

import es.islomar.designpatterns.strategy.algorithms.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		Duck mallard = new MallarDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
