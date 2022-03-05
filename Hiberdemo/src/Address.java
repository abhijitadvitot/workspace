import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address  {
    private String houseno,streetno, locality, city, villegage, distric, state, pin;

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseno='" + houseno + '\'' +
                ", streetno='" + streetno + '\'' +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", villegage='" + villegage + '\'' +
                ", distric='" + distric + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(houseno, address.houseno) && Objects.equals(streetno, address.streetno) && Objects.equals(locality, address.locality) && Objects.equals(city, address.city) && Objects.equals(villegage, address.villegage) && Objects.equals(distric, address.distric) && Objects.equals(state, address.state) && Objects.equals(pin, address.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseno, streetno, locality, city, villegage, distric, state, pin);
    }

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getStreetno() {
        return streetno;
    }

    public void setStreetno(String streetno) {
        this.streetno = streetno;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVillegage() {
        return villegage;
    }

    public void setVillegage(String villegage) {
        this.villegage = villegage;
    }

    public String getDistric() {
        return distric;
    }

    public void setDistric(String distric) {
        this.distric = distric;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
