public class ElectricGuitar extends StringInstrument implements IAmplifiedSound {
    private String modelName;
    
    public ElectricGuitar(String modelName, double price) {
        super.setNumberofStrings(6);
        this.modelName = modelName;
        setPrice(price);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "ElectricGuitar [modelName=" + modelName + " " + super.toString() +"]";
    }

    @Override
    public Double calculatePrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculatePrice'");
    }

    @Override
    public void amplify() {
        System.out.println("ELECTRIC GUITAR: AMPLIFIED SOUND!");
    }

    
}
