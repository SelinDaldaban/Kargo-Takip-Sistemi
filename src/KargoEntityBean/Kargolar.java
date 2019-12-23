/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KargoEntityBean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hilmi
 */
@Entity
@Table(name = "KARGOLAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kargolar.findAll", query = "SELECT k FROM Kargolar k"),
    @NamedQuery(name = "Kargolar.findByKargoid", query = "SELECT k FROM Kargolar k WHERE k.kargoid = :kargoid"),
    @NamedQuery(name = "Kargolar.findByAlantc", query = "SELECT k FROM Kargolar k WHERE k.alantc = :alantc"),
    @NamedQuery(name = "Kargolar.findByG\u00f6nderentc", query = "SELECT k FROM Kargolar k WHERE k.g\u00f6nderentc = :g\u00f6nderentc")})
public class Kargolar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "KARGOID")
    private Integer kargoid;
    @Column(name = "ALANTC")
    private String alantc;
    @Column(name = "G\u00d6NDERENTC")
    private String gönderentc;

    public Kargolar() {
    }

    public Kargolar(Integer kargoid) {
        this.kargoid = kargoid;
    }

    public Integer getKargoid() {
        return kargoid;
    }

    public void setKargoid(Integer kargoid) {
        this.kargoid = kargoid;
    }

    public String getAlantc() {
        return alantc;
    }

    public void setAlantc(String alantc) {
        this.alantc = alantc;
    }

    public String getGönderentc() {
        return gönderentc;
    }

    public void setGönderentc(String gönderentc) {
        this.gönderentc = gönderentc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kargoid != null ? kargoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kargolar)) {
            return false;
        }
        Kargolar other = (Kargolar) object;
        if ((this.kargoid == null && other.kargoid != null) || (this.kargoid != null && !this.kargoid.equals(other.kargoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KargoEntityBean.Kargolar[ kargoid=" + kargoid + " ]";
    }
    
}
