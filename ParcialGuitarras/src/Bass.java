public class Bass extends StringInstrument implements IAmplifiedSound{
    private String modelName;

    public Bass(String modelName, double price) {
        this.modelName = modelName;
        super.setNumberofStrings(4);
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
        return "Bass [modelName=" + modelName + " " + super.toString() +"]";
    }

    @Override
    public Double calculatePrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculatePrice'");
    }

    @Override
    public void amplify() {
        System.out.println("BASS: AMPLIFIED SOUND!");
    }

    
    
}
