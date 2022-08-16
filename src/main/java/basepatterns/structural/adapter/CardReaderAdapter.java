package basepatterns.structural.adapter;

public class CardReaderAdapter extends MicroSDcard implements Usb {
    @Override
    public void connect() {
        insertCard();
    }

    @Override
    public void readData() {
        readDataFromCard();
    }

    @Override
    public void writeData() {
        writeDataToCard();
    }

    @Override
    public void disconnect() {
        removeCard();
    }
}
