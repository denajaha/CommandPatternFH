public class PlayWithRemote {
    // app --> client

    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTvOn onCommand = new TurnTvOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();
        System.out.println("____________________\n");


        TurnTvOff offCommand = new TurnTvOff(newDevice);
        DeviceButton offPressed = new DeviceButton(offCommand);
        offPressed.press();
    }
}
