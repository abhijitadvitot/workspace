import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Project implements Serializable {
      public static final long uniqueSerial=12335;
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long projectID;
    private String projectName;
    private String contactPerson;

    @Override
    public String toString() {
        return "Project{" +
                "projectID=" + projectID +
                ", projectName='" + projectName + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(projectID, project.projectID) && Objects.equals(projectName, project.projectName) && Objects.equals(contactPerson, project.contactPerson) && Objects.equals(version, project.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectID, projectName, contactPerson, version);
    }

    public Long getProjectID() {
        return projectID;
    }

    public void setProjectID(Long projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Version
  private Integer version;
}
