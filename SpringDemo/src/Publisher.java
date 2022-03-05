import java.util.Objects;

public class Publisher {
    private  Integer pid;
    private  String name ,location;

    public Publisher() {
    }

    public Publisher(Integer pid, String name, String location) {
        this.pid = pid;
        this.name = name;
        this.location = location;
    }

    public void createObjbect()
    {
        System.out.println("This is create object");
    }
 public void deleteObject()
 {
     System.out.println("After the deleting object");
 }

    @Override
    public String toString() {
        return "Publisher{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(pid, publisher.pid) && Objects.equals(name, publisher.name) && Objects.equals(location, publisher.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, name, location);
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

