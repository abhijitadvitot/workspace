package AnimalPackage;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Animal {
    private String family;

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(family, animal.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
