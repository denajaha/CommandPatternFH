public class DeviceButton {
    //6
    // THE INVOKER --> knows nothing about what device or command is being used
    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }


}
