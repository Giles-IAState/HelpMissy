package computer_example;

public class Case {

    private String size;
    private boolean sidePanel;
    private Cooling fans;

    public Case() {

        size = "ATX";
        sidePanel = false;
        fans = null;
    }

    public Case(boolean s, Cooling f) {

        sidePanel = s;
        fans = f;
    }

    public Case(String size, boolean s, Cooling f) {

        this.size = size;
        sidePanel = s;
        fans = f;
    }
}
