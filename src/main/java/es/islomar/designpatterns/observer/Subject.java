package es.islomar.designpatterns.observer;

public interface Subject {
	public void registerObserver(Observer e);
	public void removeObserver(Observer e);
	public void notifyObservers();
}
