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
@Table(name = "ALANKISI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alankisi.findAll", query = "SELECT a FROM Alankisi a"),
    @NamedQuery(name = "Alankisi.findByTc", query = "SELECT a FROM Alankisi a WHERE a.tc = :tc"),
    @NamedQuery(name = "Alankisi.findByAd", query = "SELECT a FROM Alankisi a WHERE a.ad = :ad"),
    @NamedQuery(name = "Alankisi.findBySoyad", query = "SELECT a FROM Alankisi a WHERE a.soyad = :soyad"),
    @NamedQuery(name = "Alankisi.findByTel", query = "SELECT a FROM Alankisi a WHERE a.tel = :tel"),
    @NamedQuery(name = "Alankisi.findByAdres", query = "SELECT a FROM Alankisi a WHERE a.adres = :adres")})
public class Alankisi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TC")
    private String tc;
    @Column(name = "AD")
    private String ad;
    @Column(name = "SOYAD")
    private String soyad;
    @Column(name = "TEL")
    private String tel;
    @Column(name = "ADRES")
    private String adres;

    public Alankisi() {
    }

    public Alankisi(String tc) {
        this.tc = tc;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tc != null ? tc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alankisi)) {
            return false;
        }
        Alankisi other = (Alankisi) object;
        if ((this.tc == null && other.tc != null) || (this.tc != null && !this.tc.equals(other.tc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KargoEntityBean.Alankisi[ tc=" + tc + " ]";
    }
    
}
