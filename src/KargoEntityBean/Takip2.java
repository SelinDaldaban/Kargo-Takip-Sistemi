/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KargoEntityBean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hilmi
 */
@Entity
@Table(name = "TAKIP2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Takip2.findAll", query = "SELECT t FROM Takip2 t"),
    @NamedQuery(name = "Takip2.findByTakipId", query = "SELECT t FROM Takip2 t WHERE t.takipId = :takipId"),
    @NamedQuery(name = "Takip2.findByKargoId", query = "SELECT t FROM Takip2 t WHERE t.kargoId = :kargoId"),
    @NamedQuery(name = "Takip2.findByDurum", query = "SELECT t FROM Takip2 t WHERE t.durum = :durum"),
    @NamedQuery(name = "Takip2.findByTarih", query = "SELECT t FROM Takip2 t WHERE t.tarih = :tarih")})
public class Takip2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TAKIP_ID")
    private Integer takipId;
    @Column(name = "KARGO_ID")
    private Integer kargoId;
    @Column(name = "DURUM")
    private String durum;
    @Column(name = "TARIH")
    @Temporal(TemporalType.DATE)
    private Date tarih;

    public Takip2() {
    }

    public Takip2(Integer takipId) {
        this.takipId = takipId;
    }

    public Integer getTakipId() {
        return takipId;
    }

    public void setTakipId(Integer takipId) {
        this.takipId = takipId;
    }

    public Integer getKargoId() {
        return kargoId;
    }

    public void setKargoId(Integer kargoId) {
        this.kargoId = kargoId;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (takipId != null ? takipId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Takip2)) {
            return false;
        }
        Takip2 other = (Takip2) object;
        if ((this.takipId == null && other.takipId != null) || (this.takipId != null && !this.takipId.equals(other.takipId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KargoEntityBean.Takip2[ takipId=" + takipId + " ]";
    }
    
}
