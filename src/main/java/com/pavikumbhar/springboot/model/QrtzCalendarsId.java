package com.pavikumbhar.springboot.model;
// Generated 21 Oct, 2016 3:00:38 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QrtzCalendarsId generated by hbm2java
 */
@Embeddable
public class QrtzCalendarsId  implements java.io.Serializable {


     private String schedName;
     private String calendarName;

    public QrtzCalendarsId() {
    }

    public QrtzCalendarsId(String schedName, String calendarName) {
       this.schedName = schedName;
       this.calendarName = calendarName;
    }
   


    @Column(name="SCHED_NAME", nullable=false, length=120)
    public String getSchedName() {
        return this.schedName;
    }
    
    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }


    @Column(name="CALENDAR_NAME", nullable=false, length=200)
    public String getCalendarName() {
        return this.calendarName;
    }
    
    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof QrtzCalendarsId) ) return false;
		 QrtzCalendarsId castOther = ( QrtzCalendarsId ) other; 
         
		 return ( (this.getSchedName()==castOther.getSchedName()) || ( this.getSchedName()!=null && castOther.getSchedName()!=null && this.getSchedName().equals(castOther.getSchedName()) ) )
 && ( (this.getCalendarName()==castOther.getCalendarName()) || ( this.getCalendarName()!=null && castOther.getCalendarName()!=null && this.getCalendarName().equals(castOther.getCalendarName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSchedName() == null ? 0 : this.getSchedName().hashCode() );
         result = 37 * result + ( getCalendarName() == null ? 0 : this.getCalendarName().hashCode() );
         return result;
   }   


}


