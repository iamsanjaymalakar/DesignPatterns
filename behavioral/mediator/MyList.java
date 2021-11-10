package behavioral.mediator;

import java.util.List;
import java.util.ArrayList;

public class MyList {

    private List<String> items = new ArrayList<>();

    private Screendirector screendirector;

    public void selectItem(int itemNumber) {
        String item = items.get(itemNumber);
        if (screendirector != null) {
            screendirector.itemSelected(item);
        }
    }

    public List<String> getItems() {
        return items;
    }

    public void setScreendirector(Screendirector screendirector) {
        this.screendirector = screendirector;
    }
}
