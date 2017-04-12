package com.pavikumbhar.springboot.model;
// Generated 21 Oct, 2016 3:00:38 PM by Hibernate Tools 4.3.1


import java.sql.Blob;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * QrtzBlobTriggers generated by hbm2java
 */
@Entity
@Table(name="QRTZ_BLOB_TRIGGERS")
public class QrtzBlobTriggers  implements java.io.Serializable {


     private QrtzBlobTriggersId id;
     private QrtzTriggers qrtzTriggers;
     private Blob blobData;

    public QrtzBlobTriggers() {
    }

	
    public QrtzBlobTriggers(QrtzTriggers qrtzTriggers) {
        this.qrtzTriggers = qrtzTriggers;
    }
    public QrtzBlobTriggers(QrtzTriggers qrtzTriggers, Blob blobData) {
       this.qrtzTriggers = qrtzTriggers;
       this.blobData = blobData;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="schedName", column=@Column(name="SCHED_NAME", nullable=false, length=120) ), 
        @AttributeOverride(name="triggerName", column=@Column(name="TRIGGER_NAME", nullable=false, length=200) ), 
        @AttributeOverride(name="triggerGroup", column=@Column(name="TRIGGER_GROUP", nullable=false, length=200) ) } )
    public QrtzBlobTriggersId getId() {
        return this.id;
    }
    
    public void setId(QrtzBlobTriggersId id) {
        this.id = id;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public QrtzTriggers getQrtzTriggers() {
        return this.qrtzTriggers;
    }
    
    public void setQrtzTriggers(QrtzTriggers qrtzTriggers) {
        this.qrtzTriggers = qrtzTriggers;
    }

    
    @Column(name="BLOB_DATA")
    public Blob getBlobData() {
        return this.blobData;
    }
    
    public void setBlobData(Blob blobData) {
        this.blobData = blobData;
    }




}


