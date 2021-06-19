package home.rent.rig4jump.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_re;
    private Long id_us;
    private Long id_eq;

    public Long getId_re() {
        return id_re;
    }

    public void setId_re(Long id_re) {
        this.id_re = id_re;
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