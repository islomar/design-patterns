package es.islomar.designpatterns.strategy;

import es.islomar.designpatterns.strategy.algorithms.FlyWithWings;
import es.islomar.designpatterns.strategy.algorithms.Quack;

public class MallarDuck extends Duck {

	public MallarDuck() {
		quackBehavior = new Quack();
		setFlyBehavior(new FlyWithWings());
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
