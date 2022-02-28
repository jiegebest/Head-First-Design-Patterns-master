package designpatterns.behavior11.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
