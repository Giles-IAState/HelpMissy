package computer_example;

public class PowerSupply {

    private String name;
    private String energyRating;
    private boolean modular;
    private int output;

    public PowerSupply(){

        name = "You have to have power for this thing to work :/";
        energyRating = null;
        modular = false;
        output = 0;
    }

    public PowerSupply(String n, String r, boolean m, int o) {

        name = n;
        energyRating = r;
        modular = m;
        output = o;
    }
}
