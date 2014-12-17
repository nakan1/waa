/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sc.carrental.domain;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 984372
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
    @JoinColumn(name = "user_username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private User userUsername;

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

    public User getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(User userUsername) {
        this.userUsername = userUsername;
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
        return "com.test.java.UserRoles[ userRolesId=" + userRolesId + " ]";
    }
    
}
