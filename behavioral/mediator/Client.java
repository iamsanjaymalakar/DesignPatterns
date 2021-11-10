package behavioral.mediator;

public class Client {

    public static void main(String[] args) {

        MyList list = new MyList();
        InputText text = new InputText();

        ScreenDirectorOne screendirector = new ScreenDirectorOne();
        screendirector.setInputText(text);
        list.setScreendirector(screendirector);

        list.getItems().add("Data item one");
        list.getItems().add("Data item two");
        list.getItems().add("Data item three");

        list.selectItem(2);

        System.out.println("Selected value is: " + text.getValue());

    }

}
