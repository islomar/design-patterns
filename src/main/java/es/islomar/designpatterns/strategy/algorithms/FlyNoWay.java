package es.islomar.designpatterns.strategy.algorithms;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly");
	}

}
