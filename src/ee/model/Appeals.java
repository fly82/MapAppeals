package ee.model;

import javax.persistence.*;

import static javax.persistence.AccessType.*;

@Entity @Access(FIELD)
public class Appeals {
    @Id Long id;
    String name;
    @Column(name="number") String description;
    Location location;

    public Appeals() {
    }

    public Appeals(String name, String description,  Location location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return location;
    }
}
