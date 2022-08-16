package basepatterns.behavior.iterator;

public class RadioStation implements Collection{
    private String radioName;
    private String[] radioFrequency;

    public RadioStation(String radioName, String[] radioFrequency) {
        this.radioName = radioName;
        this.radioFrequency = radioFrequency;
    }

    public String getRadioName() {
        return radioName;
    }

    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }

    public String[] getRadioFrequency() {
        return radioFrequency;
    }

    public void setRadioFrequency(String[] radioFrequency) {
        this.radioFrequency = radioFrequency;
    }

    @Override
    public Iterator getIterator() {
        return new RadioFrequencyIterator();
    }

    private class RadioFrequencyIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < radioFrequency.length) return true;
            return false;
        }

        @Override
        public Object next() {
            return radioFrequency[index++];
        }
    }
}
