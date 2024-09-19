package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Girl {

    @Id
    private int id;
    private String name;
    private String address;

    public Girl(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Girl() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
