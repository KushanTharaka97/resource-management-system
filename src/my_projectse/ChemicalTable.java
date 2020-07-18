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
@Table(name = "chemical_table", catalog = "my_projectse", schema = "")
@NamedQueries({
    @NamedQuery(name = "ChemicalTable.findAll", query = "SELECT c FROM ChemicalTable c")
    , @NamedQuery(name = "ChemicalTable.findByChemID", query = "SELECT c FROM ChemicalTable c WHERE c.chemID = :chemID")
    , @NamedQuery(name = "ChemicalTable.findByCName", query = "SELECT c FROM ChemicalTable c WHERE c.cName = :cName")
    , @NamedQuery(name = "ChemicalTable.findByCQuentity", query = "SELECT c FROM ChemicalTable c WHERE c.cQuentity = :cQuentity")
    , @NamedQuery(name = "ChemicalTable.findByCExp", query = "SELECT c FROM ChemicalTable c WHERE c.cExp = :cExp")
    , @NamedQuery(name = "ChemicalTable.findByCSupplier", query = "SELECT c FROM ChemicalTable c WHERE c.cSupplier = :cSupplier")
    , @NamedQuery(name = "ChemicalTable.findByZero", query = "SELECT c FROM ChemicalTable c WHERE c.zero = :zero")})
public class ChemicalTable implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "chem_ID")
    private Integer chemID;
    @Basic(optional = false)
    @Column(name = "cName")
    private String cName;
    @Basic(optional = false)
    @Column(name = "cQuentity")
    private String cQuentity;
    @Basic(optional = false)
    @Column(name = "cExp")
    private String cExp;
    @Basic(optional = false)
    @Column(name = "cSupplier")
    private String cSupplier;
    @Basic(optional = false)
    @Column(name = "zero")
    private int zero;

    public ChemicalTable() {
    }

    public ChemicalTable(Integer chemID) {
        this.chemID = chemID;
    }

    public ChemicalTable(Integer chemID, String cName, String cQuentity, String cExp, String cSupplier, int zero) {
        this.chemID = chemID;
        this.cName = cName;
        this.cQuentity = cQuentity;
        this.cExp = cExp;
        this.cSupplier = cSupplier;
        this.zero = zero;
    }

    public Integer getChemID() {
        return chemID;
    }

    public void setChemID(Integer chemID) {
        Integer oldChemID = this.chemID;
        this.chemID = chemID;
        changeSupport.firePropertyChange("chemID", oldChemID, chemID);
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        String oldCName = this.cName;
        this.cName = cName;
        changeSupport.firePropertyChange("CName", oldCName, cName);
    }

    public String getCQuentity() {
        return cQuentity;
    }

    public void setCQuentity(String cQuentity) {
        String oldCQuentity = this.cQuentity;
        this.cQuentity = cQuentity;
        changeSupport.firePropertyChange("CQuentity", oldCQuentity, cQuentity);
    }

    public String getCExp() {
        return cExp;
    }

    public void setCExp(String cExp) {
        String oldCExp = this.cExp;
        this.cExp = cExp;
        changeSupport.firePropertyChange("CExp", oldCExp, cExp);
    }

    public String getCSupplier() {
        return cSupplier;
    }

    public void setCSupplier(String cSupplier) {
        String oldCSupplier = this.cSupplier;
        this.cSupplier = cSupplier;
        changeSupport.firePropertyChange("CSupplier", oldCSupplier, cSupplier);
    }

    public int getZero() {
        return zero;
    }

    public void setZero(int zero) {
        int oldZero = this.zero;
        this.zero = zero;
        changeSupport.firePropertyChange("zero", oldZero, zero);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chemID != null ? chemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChemicalTable)) {
            return false;
        }
        ChemicalTable other = (ChemicalTable) object;
        if ((this.chemID == null && other.chemID != null) || (this.chemID != null && !this.chemID.equals(other.chemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my_projectse.ChemicalTable[ chemID=" + chemID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
