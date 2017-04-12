package com.pavikumbhar.springboot.model;
// Generated 21 Oct, 2016 3:00:38 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * QrtzPausedTriggerGrps generated by hbm2java
 */
@Entity
@Table(name="QRTZ_PAUSED_TRIGGER_GRPS")
public class QrtzPausedTriggerGrps  implements java.io.Serializable {


     private QrtzPausedTriggerGrpsId id;

    public QrtzPausedTriggerGrps() {
    }

    public QrtzPausedTriggerGrps(QrtzPausedTriggerGrpsId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="schedName", column=@Column(name="SCHED_NAME", nullable=false, length=120) ), 
        @AttributeOverride(name="triggerGroup", column=@Column(name="TRIGGER_GROUP", nullable=false, length=200) ) } )
    public QrtzPausedTriggerGrpsId getId() {
        return this.id;
    }
    
    public void setId(QrtzPausedTriggerGrpsId id) {
        this.id = id;
    }




}


