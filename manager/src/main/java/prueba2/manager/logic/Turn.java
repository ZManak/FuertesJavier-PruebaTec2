/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba2.manager.logic;

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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Manak
 */
@Entity
@Table(name = "turn", catalog = "managerdb", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"})})
@NamedQueries({
    @NamedQuery(name = "Turn.findAll", query = "SELECT t FROM Turn t"),
    @NamedQuery(name = "Turn.findById", query = "SELECT t FROM Turn t WHERE t.id = :id"),
    @NamedQuery(name = "Turn.findByNumber", query = "SELECT t FROM Turn t WHERE t.number = :number"),
    @NamedQuery(name = "Turn.findByDate", query = "SELECT t FROM Turn t WHERE t.date = :date"),
    @NamedQuery(name = "Turn.findByDescription", query = "SELECT t FROM Turn t WHERE t.description = :description"),
    @NamedQuery(name = "Turn.findByDone", query = "SELECT t FROM Turn t WHERE t.done = :done"),
    @NamedQuery(name = "Turn.findByPersonId", query = "SELECT t FROM Turn t WHERE t.personId = :personId")})
public class Turn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "number", nullable = false)
    private long number;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date onDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "description", nullable = false, length = 50)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "done", nullable = false)
    private boolean done;
    @Basic(optional = false)
    @NotNull
    @Column(name = "personId", nullable = false)
    private int personId;

    public Turn() {
    }

    public Turn(Integer id) {
        this.id = id;
    }

    public Turn(Integer id, long number, Date date, String description, boolean done, int personId) {
        this.id = id;
        this.number = number;
        this.onDate = date;
        this.description = description;
        this.done = done;
        this.personId = personId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getOnDate() {
        return onDate;
    }

    public void setOnDate(Date onDate) {
        this.onDate = onDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
        if (!(object instanceof Turn)) {
            return false;
        }
        Turn other = (Turn) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "prueba2.manager.logic.Turn[ id=" + id + " ]";
    }
    
}
