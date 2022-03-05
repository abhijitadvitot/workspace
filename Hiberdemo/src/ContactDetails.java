import javax.persistence.*;
import java.util.Objects;
@Entity
public class ContactDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cid;
    private String phone, email;
    @Embedded
    private ContactType contactType;

    public ContactDetails() {
    }

    public ContactDetails(String phone, String email, ContactType contactType) {
        this.phone = phone;
        this.email = email;
        this.contactType = contactType;
    }

    public ContactDetails(Long cid, String phone, String email, ContactType contactType, Integer version) {
        this.cid = cid;
        this.phone = phone;
        this.email = email;
        this.contactType = contactType;
        this.version = version;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "cid=" + cid +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", contactType=" + contactType +
                ", version=" + version +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDetails that = (ContactDetails) o;
        return Objects.equals(cid, that.cid) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && contactType == that.contactType && Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, phone, email, contactType, version);
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
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
