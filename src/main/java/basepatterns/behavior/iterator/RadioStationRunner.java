package basepatterns.behavior.iterator;

public class RadioStationRunner {
    public static void main(String[] args) {
        String[] radioFrequency = {"101.8", "103.2", "105.2", "96.4"};

        RadioStation radioStation = new RadioStation("Europa Plus", radioFrequency);

        Iterator iterator = radioStation.getIterator();

        System.out.println("Radio station " + radioStation.getRadioName());
        System.out.println("Frequency: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
