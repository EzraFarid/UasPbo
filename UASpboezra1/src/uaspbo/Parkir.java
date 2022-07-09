/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "parkir", catalog = "uaspbo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Parkir.findAll", query = "SELECT p FROM Parkir p")
    , @NamedQuery(name = "Parkir.findById", query = "SELECT p FROM Parkir p WHERE p.id = :id")
    , @NamedQuery(name = "Parkir.findByNopol", query = "SELECT p FROM Parkir p WHERE p.nopol = :nopol")
    , @NamedQuery(name = "Parkir.findByTipe", query = "SELECT p FROM Parkir p WHERE p.tipe = :tipe")
    , @NamedQuery(name = "Parkir.findByTanggal", query = "SELECT p FROM Parkir p WHERE p.tanggal = :tanggal")
    , @NamedQuery(name = "Parkir.findByJamMasuk", query = "SELECT p FROM Parkir p WHERE p.jamMasuk = :jamMasuk")
    , @NamedQuery(name = "Parkir.findByJamKeluar", query = "SELECT p FROM Parkir p WHERE p.jamKeluar = :jamKeluar")
    , @NamedQuery(name = "Parkir.findByBiayaParkir", query = "SELECT p FROM Parkir p WHERE p.biayaParkir = :biayaParkir")})
public class Parkir implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nopol")
    private String nopol;
    @Basic(optional = false)
    @Column(name = "tipe")
    private String tipe;
    @Basic(optional = false)
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Basic(optional = false)
    @Column(name = "jam_masuk")
    @Temporal(TemporalType.TIME)
    private Date jamMasuk;
    @Column(name = "jam_keluar")
    @Temporal(TemporalType.TIME)
    private Date jamKeluar;
    @Column(name = "biaya_parkir")
    private Integer biayaParkir;

    public Parkir() {
    }

    public Parkir(Integer id) {
        this.id = id;
    }

    public Parkir(Integer id, String nopol, String tipe, Date tanggal, Date jamMasuk) {
        this.id = id;
        this.nopol = nopol;
        this.tipe = tipe;
        this.tanggal = tanggal;
        this.jamMasuk = jamMasuk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        String oldNopol = this.nopol;
        this.nopol = nopol;
        changeSupport.firePropertyChange("nopol", oldNopol, nopol);
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        String oldTipe = this.tipe;
        this.tipe = tipe;
        changeSupport.firePropertyChange("tipe", oldTipe, tipe);
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        Date oldTanggal = this.tanggal;
        this.tanggal = tanggal;
        changeSupport.firePropertyChange("tanggal", oldTanggal, tanggal);
    }

    public Date getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(Date jamMasuk) {
        Date oldJamMasuk = this.jamMasuk;
        this.jamMasuk = jamMasuk;
        changeSupport.firePropertyChange("jamMasuk", oldJamMasuk, jamMasuk);
    }

    public Date getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(Date jamKeluar) {
        Date oldJamKeluar = this.jamKeluar;
        this.jamKeluar = jamKeluar;
        changeSupport.firePropertyChange("jamKeluar", oldJamKeluar, jamKeluar);
    }

    public Integer getBiayaParkir() {
        return biayaParkir;
    }

    public void setBiayaParkir(Integer biayaParkir) {
        Integer oldBiayaParkir = this.biayaParkir;
        this.biayaParkir = biayaParkir;
        changeSupport.firePropertyChange("biayaParkir", oldBiayaParkir, biayaParkir);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parkir)) {
            return false;
        }
        Parkir other = (Parkir) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uaspbo.Parkir[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
