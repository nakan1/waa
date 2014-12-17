/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sc.carrental.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 984372
 */
@Entity
@Table(name = "booking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b"),
    @NamedQuery(name = "Booking.findByBookinId", query = "SELECT b FROM Booking b WHERE b.bookinId = :bookinId"),
    @NamedQuery(name = "Booking.findByDateFrom", query = "SELECT b FROM Booking b WHERE b.dateFrom = :dateFrom"),
    @NamedQuery(name = "Booking.findByDateTo", query = "SELECT b FROM Booking b WHERE b.dateTo = :dateTo"),
    @NamedQuery(name = "Booking.findByConfirmationLetterSent", query = "SELECT b FROM Booking b WHERE b.confirmationLetterSent = :confirmationLetterSent"),
    @NamedQuery(name = "Booking.findByPayementReceve", query = "SELECT b FROM Booking b WHERE b.payementReceve = :payementReceve")})
public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bookinId")
    private Integer bookinId;
    @Column(name = "dateFrom")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;
    @Column(name = "dateTo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;
    @Column(name = "confirmation_letter_sent")
    private Boolean confirmationLetterSent;
    @Column(name = "payementReceve")
    private Boolean payementReceve;
    @JoinColumn(name = "vehicle_registrationNumber", referencedColumnName = "registrationNumber")
    @ManyToOne(optional = false)
    private Vehicle vehicleregistrationNumber;
    @JoinColumn(name = "user_username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private User userUsername;

    public Booking() {
    }

    public Booking(Integer bookinId) {
        this.bookinId = bookinId;
    }

    public Integer getBookinId() {
        return bookinId;
    }

    public void setBookinId(Integer bookinId) {
        this.bookinId = bookinId;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Boolean getConfirmationLetterSent() {
        return confirmationLetterSent;
    }

    public void setConfirmationLetterSent(Boolean confirmationLetterSent) {
        this.confirmationLetterSent = confirmationLetterSent;
    }

    public Boolean getPayementReceve() {
        return payementReceve;
    }

    public void setPayementReceve(Boolean payementReceve) {
        this.payementReceve = payementReceve;
    }

    public Vehicle getVehicleregistrationNumber() {
        return vehicleregistrationNumber;
    }

    public void setVehicleregistrationNumber(Vehicle vehicleregistrationNumber) {
        this.vehicleregistrationNumber = vehicleregistrationNumber;
    }

    public User getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(User userUsername) {
        this.userUsername = userUsername;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookinId != null ? bookinId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.bookinId == null && other.bookinId != null) || (this.bookinId != null && !this.bookinId.equals(other.bookinId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.java.Booking[ bookinId=" + bookinId + " ]";
    }
    
}
