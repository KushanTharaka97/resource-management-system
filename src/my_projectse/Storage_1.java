/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_projectse;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "storage", catalog = "my_projectse", schema = "")
@NamedQueries({
    @NamedQuery(name = "Storage_1.findAll", query = "SELECT s FROM Storage_1 s")
    , @NamedQuery(name = "Storage_1.findBySID", query = "SELECT s FROM Storage_1 s WHERE s.sID = :sID")
    , @NamedQuery(name = "Storage_1.findBySName", query = "SELECT s FROM Storage_1 s WHERE s.sName = :sName")
    , @NamedQuery(name = "Storage_1.findBySVolume", query = "SELECT s FROM Storage_1 s WHERE s.sVolume = :sVolume")
    , @NamedQuery(name = "Storage_1.findByZero", query = "SELECT s FROM Storage_1 s WHERE s.zero = :zero")
    , @NamedQuery(name = "Storage_1.findByReponsible", query = "SELECT s FROM Storage_1 s WHERE s.reponsible = :reponsible")})
public class Storage_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sID")
    private Integer sID;
    @Basic(optional = false)
    @Column(name = "sName")
    private String sName;
    @Basic(optional = false)
    @Column(name = "sVolume")
    private String sVolume;
    @Basic(optional = false)
    @Column(name = "zero")
    private int zero;
    @Basic(optional = false)
    @Column(name = "reponsible")
    private String reponsible;

    public Storage_1() {
    }

    public Storage_1(Integer sID) {
        this.sID = sID;
    }

    public Storage_1(Integer sID, String sName, String sVolume, int zero, String reponsible) {
        this.sID = sID;
        this.sName = sName;
        this.sVolume = sVolume;
        this.zero = zero;
        this.reponsible = reponsible;
    }

    public Integer getSID() {
        return sID;
    }

    public void setSID(Integer sID) {
        Integer oldSID = this.sID;
        this.sID = sID;
        changeSupport.firePropertyChange("SID", oldSID, sID);
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        String oldSName = this.sName;
        this.sName = sName;
        changeSupport.firePropertyChange("SName", oldSName, sName);
    }

    public String getSVolume() {
        return sVolume;
    }

    public void setSVolume(String sVolume) {
        String oldSVolume = this.sVolume;
        this.sVolume = sVolume;
        changeSupport.firePropertyChange("SVolume", oldSVolume, sVolume);
    }

    public int getZero() {
        return zero;
    }

    public void setZero(int zero) {
        int oldZero = this.zero;
        this.zero = zero;
        changeSupport.firePropertyChange("zero", oldZero, zero);
    }

    public String getReponsible() {
        return reponsible;
    }

    public void setReponsible(String reponsible) {
        String oldReponsible = this.reponsible;
        this.reponsible = reponsible;
        changeSupport.firePropertyChange("reponsible", oldReponsible, reponsible);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sID != null ? sID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Storage_1)) {
            return false;
        }
        Storage_1 other = (Storage_1) object;
        if ((this.sID == null && other.sID != null) || (this.sID != null && !this.sID.equals(other.sID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my_projectse.Storage_1[ sID=" + sID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
