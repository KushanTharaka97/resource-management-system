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
@Table(name = "admintable", catalog = "my_projectse", schema = "")
@NamedQueries({
    @NamedQuery(name = "Admintable.findAll", query = "SELECT a FROM Admintable a")
    , @NamedQuery(name = "Admintable.findById", query = "SELECT a FROM Admintable a WHERE a.id = :id")
    , @NamedQuery(name = "Admintable.findByName", query = "SELECT a FROM Admintable a WHERE a.name = :name")
    , @NamedQuery(name = "Admintable.findByPass", query = "SELECT a FROM Admintable a WHERE a.pass = :pass")
    , @NamedQuery(name = "Admintable.findByEmail", query = "SELECT a FROM Admintable a WHERE a.email = :email")
    , @NamedQuery(name = "Admintable.findByNic", query = "SELECT a FROM Admintable a WHERE a.nic = :nic")})
public class Admintable implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "pass")
    private String pass;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "nic")
    private String nic;

    public Admintable() {
    }

    public Admintable(Integer id) {
        this.id = id;
    }

    public Admintable(Integer id, String name, String pass, String email, String nic) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.nic = nic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        String oldPass = this.pass;
        this.pass = pass;
        changeSupport.firePropertyChange("pass", oldPass, pass);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        String oldNic = this.nic;
        this.nic = nic;
        changeSupport.firePropertyChange("nic", oldNic, nic);
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
        if (!(object instanceof Admintable)) {
            return false;
        }
        Admintable other = (Admintable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my_projectse.Admintable[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
