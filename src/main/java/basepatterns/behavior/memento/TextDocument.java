package basepatterns.behavior.memento;

import java.util.Date;

public class TextDocument {
    private String version;
    private Date date;

    public void setVersionAndDate(String version){
        this.version = version;
        date = new Date();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "TextDocument:" +
                "\nVersion: " + version +
                "\nDate: " + date +
                "\n";
    }
}
