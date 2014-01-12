package es.islomar.designpatterns.strategy;

import es.islomar.designpatterns.strategy.algorithms.FlyNoWay;
import es.islomar.designpatterns.strategy.algorithms.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
