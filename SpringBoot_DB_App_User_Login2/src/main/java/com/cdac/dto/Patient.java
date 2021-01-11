package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "Patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patient_id")
	
	private long patientId;
	
	@Column(name = "doctor_id")
	private long doctorId;
	
	
	@Column(name = "mode_of_notification",columnDefinition = "varchar(5) default 'y'")
	private String modeOfNotification;
	
	@Column(name="patient_blood_group",length = 5)
	private String patientBloodGroup;
	
	public Patient() {
		
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public String getModeOfNotification() {
		return modeOfNotification;
	}

	public void setModeOfNotification(String modeOfNotification) {
		this.modeOfNotification = modeOfNotification;
	}

	public String getPatientBloodGroup() {
		return patientBloodGroup;
	}

	public void setPatientBloodGroup(String patientBloodGroup) {
		this.patientBloodGroup = patientBloodGroup;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", doctorId=" + doctorId + ", modeOfNotification="
				+ modeOfNotification + ", patientBloodGroup=" + patientBloodGroup + "]";
	}

	public Patient(long patientId, long doctorId, String modeOfNotification, String patientBloodGroup) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.modeOfNotification = modeOfNotification;
		this.patientBloodGroup = patientBloodGroup;
	}

		
	
}
