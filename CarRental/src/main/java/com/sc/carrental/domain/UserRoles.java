/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sc.carrental.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Diarra
 */
@Entity
@Table(name = "user_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserRoles.findAll", query = "SELECT u FROM UserRoles u"),
    @NamedQuery(name = "UserRoles.findByUserRolesId", query = "SELECT u FROM UserRoles u WHERE u.userRolesId = :userRolesId"),
    @NamedQuery(name = "UserRoles.findByRole", query = "SELECT u FROM UserRoles u WHERE u.role = :role")})
public class UserRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userRolesId")
    private Integer userRolesId;
    @Size(max = 45)
    @Column(name = "ROLE")
    private String role;
    @OneToMany
    @JoinColumn(name = "user_roles_userRolesId", referencedColumnName = "userRolesId")
    private Collection<User> userCollection;

    public UserRoles() {
    }

    public UserRoles(Integer userRolesId) {
        this.userRolesId = userRolesId;
    }

    public Integer getUserRolesId() {
        return userRolesId;
    }

    public void setUserRolesId(Integer userRolesId) {
        this.userRolesId = userRolesId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @XmlTransient
    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userRolesId != null ? userRolesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserRoles)) {
            return false;
        }
        UserRoles other = (UserRoles) object;
        if ((this.userRolesId == null && other.userRolesId != null) || (this.userRolesId != null && !this.userRolesId.equals(other.userRolesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sp.sinka.entity.UserRoles[ userRolesId=" + userRolesId + " ]";
    }
    
}
