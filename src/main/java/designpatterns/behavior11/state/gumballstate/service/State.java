package designpatterns.behavior11.state.gumballstate.service;

public interface State {
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
	void refill();
}
