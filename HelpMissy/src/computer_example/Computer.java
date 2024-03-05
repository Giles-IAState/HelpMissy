package computer_example;

public class Computer {

    private Case shell;
    private GPU graphics;
    private CPU computing;
    private Motherboard mobo;
    private PowerSupply power;
    private RAM memory;
    private Cooling fans;

    public Computer() {

        shell = null;
        graphics = null;
        computing = null;
        mobo = null;
        power = null;
        memory = null;
        fans = null;
    }

    public Computer(Case s, GPU g, CPU c, Motherboard mo, PowerSupply p, RAM mem, Cooling f) {

        shell = s;
        graphics = g;
        computing = c;
        mobo = mo;
        power = p;
        memory = mem;
        fans = f;
    }
}
