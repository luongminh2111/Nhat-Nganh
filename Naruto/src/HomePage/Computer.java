package HomePage;

public class Computer {
    private String category;
    private String cpu;
    private String ram;
    private String hardware;
    private String monitor;
    private String graphicsCard;
    private int cost;

    public Computer(String category, String cpu, String ram, String hardware, String monitor, String graphicsCard, String guarantee, String description, int cost) {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "category='" + category + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hardware='" + hardware + '\'' +
                ", monitor='" + monitor + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", cost=" + cost +
                '}';
    }
}
