public class Notebook extends ComputerProduct{
    private Integer ramMemory;

    public Integer getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(Integer ramMemory) {
        this.ramMemory = ramMemory;
    }

    public Notebook(Integer stock, String name, Double price, String manufacturer, Integer ramMemory) {
        super(stock, name, price, manufacturer);
        this.ramMemory = ramMemory;
    }

    @Override
    public String toString() {
        return "Notebook [ramMemory=" + ramMemory + " " + super.toString() + "]";
    }

    
    
}
