package basepatterns.structural.adapter;

public class MyPC {
    public static void main(String[] args) {
        Usb usb = new CardReaderAdapter();

        usb.connect();
        usb.readData();
        usb.writeData();
        usb.disconnect();
    }
}
