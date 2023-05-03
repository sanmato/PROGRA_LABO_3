public class Platform extends Item {
    private String material;
    private String support;

    public Platform(Double height, Double width, String material, String support) {
        super(height, width);
        this.material = material;
        this.support = support;
    }

    public Platform(String material, String support) {
        this.material = material;
        this.support = support;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    @Override
    public String toString() {
        return "Platform [material=" + material + ", support=" + support + "]";
    }

}
