package home.rent.rig4jump.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "locations")
@Data
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_lo;
    @Column(name = "name_lo")
    private String name_lo;
    @Column(name = "phone_lo")
    private String phone_lo;
    @Column(name = "adress_lo")
    private String adress_lo;
    @Column(name = "email_lo")
    private String email_lo;
    @Column(name = "program")
    private String program;
    @Column(name = "facilities")
    private String facilities;
    @Column(name = "link")
    private String link;

    public Long getId_lo() {
        return id_lo;
    }

    public void setId_lo(Long id_lo) {
        this.id_lo = id_lo;
    }

    public String getName_lo() {
        return name_lo;
    }

    public void setName_lo(String name_lo) {
        this.name_lo = name_lo;
    }

    public String getPhone_lo() {
        return phone_lo;
    }

    public void setPhone_lo(String phone_lo) {
        this.phone_lo = phone_lo;
    }

    public String getAdress_lo() {
        return adress_lo;
    }

    public void setAdress_lo(String adress_lo) {
        this.adress_lo = adress_lo;
    }

    public String getEmail_lo() {
        return email_lo;
    }

    public void setEmail_lo(String email_lo) {
        this.email_lo = email_lo;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}