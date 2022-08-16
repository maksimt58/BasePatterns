package basepatterns.creational.abstractFactory.cosmeticsShop;

import basepatterns.creational.abstractFactory.CopyWriter;

public class CopyWriterCosmeticSpecial implements CopyWriter {
    @Override
    public void makeTextContent() {
        System.out.println("copywriter writes a text about the cosmetic sphere");
    }
}