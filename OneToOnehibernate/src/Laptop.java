import javax.persistence.*;
import java.util.Objects;


@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lid;
    private String cpu;
    private  String hdd;
    private String ram;
@OneToOne(cascade = CascadeType.ALL,targetEntity =Person.class )
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return lid == laptop.lid && Objects.equals(cpu, laptop.cpu) && Objects.equals(hdd, laptop.hdd) && Objects.equals(ram, laptop.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lid, cpu, hdd, ram);
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Laptop(int lid, String cpu, String hdd, String ram) {
        this.lid = lid;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }
}
