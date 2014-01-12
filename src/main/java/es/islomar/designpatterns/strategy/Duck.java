package es.islomar.designpatterns.strategy;

import es.islomar.designpatterns.strategy.algorithms.FlyBehavior;
import es.islomar.designpatterns.strategy.algorithms.QuackBehavior;

public abstract class Duck {

	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public Duck() {
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
