package basepatterns.behavior.memento;

public class EditorTextRunner {
    public static void main(String[] args) throws InterruptedException {
        TextDocument textDocument = new TextDocument();
        EditorText editorText = new EditorText();

        System.out.println("Создаем новый текстовый документ. Версия 1.0");

        textDocument.setVersionAndDate("Версия 1.0");

        System.out.println(textDocument);

        System.out.println("Сохраняем наш текстовый документ с помощью редактора");

        editorText.setSave(textDocument.save());

        System.out.println("Редактируем наш документ");

        Thread.sleep(5000);

        textDocument.setVersionAndDate("Версия 1.1");

        System.out.println(textDocument);

        System.out.println("Съехало все форматирование документа, нужно откатиться назад");

        textDocument.load(editorText.getSave());

        System.out.println("Вернули старую версию 1.0");

        System.out.println(textDocument);
    }
}
