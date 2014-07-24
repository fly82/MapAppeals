package ee.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Location  {
    @Column(name="lon") public float latitude;
    @Column(name="lat") public float longitude;

    public Location() {
    }

    public Location(double latitude, double longitude) {
        this.latitude = (float) latitude;
        this.longitude = (float) longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
}
