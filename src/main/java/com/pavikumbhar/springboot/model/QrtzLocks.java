package com.pavikumbhar.springboot.model;
// Generated 21 Oct, 2016 3:00:38 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * QrtzLocks generated by hbm2java
 */
@Entity
@Table(name="QRTZ_LOCKS")
public class QrtzLocks  implements java.io.Serializable {


     private QrtzLocksId id;

    public QrtzLocks() {
    }

    public QrtzLocks(QrtzLocksId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="schedName", column=@Column(name="SCHED_NAME", nullable=false, length=120) ), 
        @AttributeOverride(name="lockName", column=@Column(name="LOCK_NAME", nullable=false, length=40) ) } )
    public QrtzLocksId getId() {
        return this.id;
    }
    
    public void setId(QrtzLocksId id) {
        this.id = id;
    }




}


