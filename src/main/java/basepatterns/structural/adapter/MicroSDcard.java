package basepatterns.structural.adapter;

public class MicroSDcard {
    void insertCard(){
        System.out.println("Вставили MicroSD");
    }
    void readDataFromCard(){
        System.out.println("Прочитали данные с MicroSD");
    }
    void writeDataToCard(){
        System.out.println("Записали данные на MicroSD");
    }
    void removeCard(){
        System.out.println("Отсоединили MicroSD");
    }
}
