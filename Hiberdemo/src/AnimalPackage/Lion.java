package AnimalPackage;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Lion {
    private Long id;
    private String breed;
    @Embedded
    private Animal animal;


    public Lion(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "id=" + id +
                ", breed='" + breed + '\'' +
                ", animal=" + animal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lion lion = (Lion) o;
        return Objects.equals(id, lion.id) && Objects.equals(breed, lion.breed) && Objects.equals(animal, lion.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, breed, animal);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
