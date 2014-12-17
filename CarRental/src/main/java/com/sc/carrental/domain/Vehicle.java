/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sc.carrental.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "vehicle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v"),
    @NamedQuery(name = "Vehicle.findByRegistrationNumber", query = "SELECT v FROM Vehicle v WHERE v.registrationNumber = :registrationNumber"),
    @NamedQuery(name = "Vehicle.findByCurentMileage", query = "SELECT v FROM Vehicle v WHERE v.curentMileage = :curentMileage"),
    @NamedQuery(name = "Vehicle.findByEngineSize", query = "SELECT v FROM Vehicle v WHERE v.engineSize = :engineSize"),
    @NamedQuery(name = "Vehicle.findByDailyHireRate", query = "SELECT v FROM Vehicle v WHERE v.dailyHireRate = :dailyHireRate")})
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "registrationNumber")
    private String registrationNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "curentMileage")
    private double curentMileage;
    @Size(max = 45)
    @Column(name = "engineSize")
    private String engineSize;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dailyHireRate")
    private Double dailyHireRate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicleregistrationNumber")
    private Collection<Booking> bookingCollection;
    @JoinColumn(name = "category_vehicleCategoryCode", referencedColumnName = "vehicleCategoryCode")
    @ManyToOne(optional = false)
    private Category categoryvehicleCategoryCode;

    public Vehicle() {
    }

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Vehicle(String registrationNumber, double curentMileage) {
        this.registrationNumber = registrationNumber;
        this.curentMileage = curentMileage;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getCurentMileage() {
        return curentMileage;
    }

    public void setCurentMileage(double curentMileage) {
        this.curentMileage = curentMileage;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public Double getDailyHireRate() {
        return dailyHireRate;
    }

    public void setDailyHireRate(Double dailyHireRate) {
        this.dailyHireRate = dailyHireRate;
    }

    @XmlTransient
    public Collection<Booking> getBookingCollection() {
        return bookingCollection;
    }

    public void setBookingCollection(Collection<Booking> bookingCollection) {
        this.bookingCollection = bookingCollection;
    }

    public Category getCategoryvehicleCategoryCode() {
        return categoryvehicleCategoryCode;
    }

    public void setCategoryvehicleCategoryCode(Category categoryvehicleCategoryCode) {
        this.categoryvehicleCategoryCode = categoryvehicleCategoryCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registrationNumber != null ? registrationNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.registrationNumber == null && other.registrationNumber != null) || (this.registrationNumber != null && !this.registrationNumber.equals(other.registrationNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.java.Vehicle[ registrationNumber=" + registrationNumber + " ]";
    }
    
}
