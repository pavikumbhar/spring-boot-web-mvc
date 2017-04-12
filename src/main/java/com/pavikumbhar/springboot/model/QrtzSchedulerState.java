package com.pavikumbhar.springboot.model;
// Generated 21 Oct, 2016 3:00:38 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * QrtzSchedulerState generated by hbm2java
 */
@Entity
@Table(name="QRTZ_SCHEDULER_STATE")
public class QrtzSchedulerState  implements java.io.Serializable {


     private QrtzSchedulerStateId id;
     private long lastCheckinTime;
     private long checkinInterval;

    public QrtzSchedulerState() {
    }

    public QrtzSchedulerState(QrtzSchedulerStateId id, long lastCheckinTime, long checkinInterval) {
       this.id = id;
       this.lastCheckinTime = lastCheckinTime;
       this.checkinInterval = checkinInterval;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="schedName", column=@Column(name="SCHED_NAME", nullable=false, length=120) ), 
        @AttributeOverride(name="instanceName", column=@Column(name="INSTANCE_NAME", nullable=false, length=200) ) } )
    public QrtzSchedulerStateId getId() {
        return this.id;
    }
    
    public void setId(QrtzSchedulerStateId id) {
        this.id = id;
    }

    
    @Column(name="LAST_CHECKIN_TIME", nullable=false, precision=13, scale=0)
    public long getLastCheckinTime() {
        return this.lastCheckinTime;
    }
    
    public void setLastCheckinTime(long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    
    @Column(name="CHECKIN_INTERVAL", nullable=false, precision=13, scale=0)
    public long getCheckinInterval() {
        return this.checkinInterval;
    }
    
    public void setCheckinInterval(long checkinInterval) {
        this.checkinInterval = checkinInterval;
    }




}


