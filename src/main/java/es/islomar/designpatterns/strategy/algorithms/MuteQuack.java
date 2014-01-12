package es.islomar.designpatterns.strategy.algorithms;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("<< Silence >>");
	}

}
