package computer_example;

public class Motherboard {

    private String name;
    private String chipset;
    private String[] expansionSlots;
    private String allowedMemory;

    public Motherboard() {
        name = "Aw cmon u gotta have one of these";
        chipset = null;
        expansionSlots = null;
        allowedMemory = null;
    }
    public Motherboard(String n, String c, String[] e, String a) {
        name= a;
        chipset = c;
        expansionSlots = e;
        allowedMemory = a;
    }
}
