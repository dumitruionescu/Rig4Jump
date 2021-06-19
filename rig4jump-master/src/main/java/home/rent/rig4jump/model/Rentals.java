package home.rent.rig4jump.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "rentals")
public class Rentals {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_re;
    private Long id_us;
    private Long id_eq;

    @Column(name = "start_date")
    private Date start_date;
    @Column(name = "end_date")
    private Date end_date;
    @Column(name = "price")
    private Double price;


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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

