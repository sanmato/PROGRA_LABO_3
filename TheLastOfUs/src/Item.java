public abstract class Item {
    private Double height;
    private Double width;

    public Item(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Item() {
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Item [height=" + height + ", width=" + width + "]";
    }

}
