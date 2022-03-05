import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Laptop implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lid;
 @Column(name = "Processor")
    private String cpu;
 @Column(name = "Hard_Disk",  length = 15,  nullable = true, insertable = true,table = "Laptop",updatable = true)
    private  String hdd;
    private String ram;
    @Temporal(TemporalType.TIME)
    private Date mfg;
@Embedded
    private Address address;
    public Date getMfg() {
        return mfg;
    }

    public void setMfg(Date mfg) {
        this.mfg = mfg;
    }

    public Laptop() {
    }

    public Laptop(int lid, String cpu, String hdd, String ram) {
        this.lid = lid;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
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
}
