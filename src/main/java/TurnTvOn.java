public class TurnTvOn implements Command {
    //4
    // COMMAND

    ElectronicDevice theDevice;

    public TurnTvOn(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.on();

    }

    public void undo() {

        theDevice.off();

    }

}