// Each command you want to issue will implement 
// the Command interface
//3
public interface Command {

    public void execute();

    // You may want to offer the option to undo a command

    public void undo();

}