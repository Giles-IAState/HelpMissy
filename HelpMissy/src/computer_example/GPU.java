package computer_example;

public class GPU {

    private String name;
    private int clock;
    private int cores;
    private String[] ports;

    public GPU() {
        name = "I got no graphics :(";
        clock = 0;
        cores = 0;
        ports = null;
    }

    public GPU(String n, int clock, int cores, String[] ports) {

        this.name = name;
        this.clock = clock;
        this.cores = cores;
        this.ports = ports;
    }
}
