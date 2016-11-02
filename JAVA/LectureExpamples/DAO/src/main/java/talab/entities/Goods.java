package talab.entities;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class Goods {
    private int id;
    private String name;
    private String description;
    private int price;
    private int manufactureId;

    public Goods(int id, String name, String description, int price, int manufactureId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.manufactureId = manufactureId;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", manufactureId=" + manufactureId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getManufactureId() {
        return manufactureId;
    }

    public void setManufactureId(int manufactureId) {
        this.manufactureId = manufactureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (id != goods.id) return false;
        if (price != goods.price) return false;
        if (manufactureId != goods.manufactureId) return false;
        if (!name.equals(goods.name)) return false;
        return description.equals(goods.description);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + price;
        result = 31 * result + manufactureId;
        return result;
    }
}
