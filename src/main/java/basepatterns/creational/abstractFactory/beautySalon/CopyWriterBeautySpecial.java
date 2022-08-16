package basepatterns.creational.abstractFactory.beautySalon;

import basepatterns.creational.abstractFactory.CopyWriter;

public class CopyWriterBeautySpecial implements CopyWriter {
    @Override
    public void makeTextContent() {
        System.out.println("copywriter writes a text about the beauty sphere");
    }
}
