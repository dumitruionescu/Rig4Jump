package home.rent.rig4jump.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment")
public class Equipment {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id_eq;
  @Column(name = "name_eq")
  private String name_eq;
  @Column(name = "price")
  private Double price;
  @Column(name = "description")
  private String description;
  @Column(name = "cantitate")
  private Long cantitate;
  @Column(name = "profil_img") //nu stiu
  private String profil_img;
  @Column(name = "capota")
  private String capota;
  @Column(name = "voalura_pr")
  private String voalura_pr;
  @Column(name = "voalura_sc")
  private String voalura_sc;
  @Column(name = "ap_sig")
  private String ap_sig;


  public Long getId_eq() {
    return id_eq;
  }

  public void setId_eq(Long id_eq) {
    this.id_eq = id_eq;
  }

  public String getName_eq() {
    return name_eq;
  }

  public void setName_eq(String name_eq) {
    this.name_eq = name_eq;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getCantitate() {
    return cantitate;
  }

  public void setCantitate(Long cantitate) {
    this.cantitate = cantitate;
  }

  public String getProfil_img() {
    return profil_img;
  }

  public void setProfil_img(String profil_img) {
    this.profil_img = profil_img;
  }

  public String getCapota() {
    return capota;
  }

  public void setCapota(String capota) {
    this.capota = capota;
  }

  public String getVoalura_pr() {
    return voalura_pr;
  }

  public void setVoalura_pr(String voalura_pr) {
    this.voalura_pr = voalura_pr;
  }

  public String getVoalura_sc() {
    return voalura_sc;
  }

  public void setVoalura_sc(String voalura_sc) {
    this.voalura_sc = voalura_sc;
  }

  public String getAp_sig() {
    return ap_sig; }

  public void setAp_sig(String ap_sig) {
    this.ap_sig = ap_sig;
  }
}
