/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sc.carrental.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 984372
 */
@Entity
@Table(name = "category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c"),
    @NamedQuery(name = "Category.findByVehicleCategoryCode", query = "SELECT c FROM Category c WHERE c.vehicleCategoryCode = :vehicleCategoryCode"),
    @NamedQuery(name = "Category.findByVehicleCategoryDescription", query = "SELECT c FROM Category c WHERE c.vehicleCategoryDescription = :vehicleCategoryDescription")})
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vehicleCategoryCode")
    private Integer vehicleCategoryCode;
    @Basic(optional = false)
    //@NotNull
    @Size(min = 1, max = 225)
    @Column(name = "vehicleCategoryDescription")
    private String vehicleCategoryDescription;
    @OneToMany
    @JoinColumn(name="category_vehicleCategoryCode", referencedColumnName="vehicleCategoryCode")
    private List<Vehicle> vehicleCollection;

    public Category() {
    }

    public Category(Integer vehicleCategoryCode) {
        this.vehicleCategoryCode = vehicleCategoryCode;
    }

    public Category(Integer vehicleCategoryCode, String vehicleCategoryDescription) {
        this.vehicleCategoryCode = vehicleCategoryCode;
        this.vehicleCategoryDescription = vehicleCategoryDescription;
    }

    public Integer getVehicleCategoryCode() {
        return vehicleCategoryCode;
    }

    public void setVehicleCategoryCode(Integer vehicleCategoryCode) {
        this.vehicleCategoryCode = vehicleCategoryCode;
    }

    public String getVehicleCategoryDescription() {
        return vehicleCategoryDescription;
    }

    public void setVehicleCategoryDescription(String vehicleCategoryDescription) {
        this.vehicleCategoryDescription = vehicleCategoryDescription;
    }

    @XmlTransient
    public List<Vehicle> getVehicleCollection() {
        return vehicleCollection;
    }

    public void setVehicleCollection(List<Vehicle> vehicleCollection) {
        this.vehicleCollection = vehicleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehicleCategoryCode != null ? vehicleCategoryCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.vehicleCategoryCode == null && other.vehicleCategoryCode != null) || (this.vehicleCategoryCode != null && !this.vehicleCategoryCode.equals(other.vehicleCategoryCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.java.Category[ vehicleCategoryCode=" + vehicleCategoryCode + " ]";
    }
    
}
