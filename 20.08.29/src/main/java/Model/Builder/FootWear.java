package Model.Builder;

public class FootWear {

    Type type;
    View view;
    Color color;
    Double price;
    Manufacture manufacturer;
    Size size;

    public FootWear() {
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Manufacture getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacture manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "FootWear : " +
                "view :" + view.toString() + "; " +
                "size :" + size.toString() +  "; " +
                "type :" + type.toString() + "; " +
                "color :" + color.toString() +  "; " +
                "price :" + price.toString() + "; " +
                "manufacturer :" + manufacturer.toString();
    }
}
