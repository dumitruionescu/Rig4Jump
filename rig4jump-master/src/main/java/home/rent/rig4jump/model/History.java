package home.rent.rig4jump.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "history")
@Data
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_hi;
    private Long id_us;
    private Long id_eq;

    public Long getId_hi() {
        return id_hi;
    }

    public void setId_hi(Long id_hi) {
        this.id_hi = id_hi;
    }

    public Long getId_us() {
        return id_us;
    }

    public void setId_us(Long id_us) {
        this.id_us = id_us;
    }

    public Long getId_eq() {
        return id_eq;
    }

    public void setId_eq(Long id_eq) {
        this.id_eq = id_eq;
    }
}