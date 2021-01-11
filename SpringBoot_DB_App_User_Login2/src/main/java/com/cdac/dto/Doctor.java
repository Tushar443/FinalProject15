package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long doctorId;
	
	@Column(length = 70,nullable = false)
	private String specialization;
	
	@Column(name = "doctor_registration_council",length=70,nullable = false)
	private String doctorRegistrationCouncil;
	
	@Column(name = "doctor_registration_year",length=10,nullable = false)
	private String doctorRegistrationYear;
	
	@Column(name = "doctor_registration_number",length=70,nullable = false)
	private String doctorRegistrationNumber;
	
	@Column(length = 100,nullable = false)
	private String college;
	
	@Column(length=50,nullable = false)
	private String degree;
	
	@Column(name="year_of_completion",length=20,nullable = false)
	private String yearOfCompletion;
	
	@Column(name="year_of_experiance",length=5,nullable = false)
	private String yearOfExperiance;
	
	@Column(name = "establishment_name",length=50,nullable = false)
	private String establishmentName;
	
	@Column(name = "establishment_city",length = 30,nullable = false)
	private String establishmentCity;
	
	@Column(length=30,nullable = false)
	private String locality;
	
	@Column(name="medical_proof",length=3000,nullable = false)
	private String medicalProof;
	
	@Column(name="establishment_proof",length=3000,nullable = false)
	private String establishmentProof;
	
	@Column(name="identity_proof",length = 3000,nullable = false)
	private String identityProof;

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDoctorRegistrationCouncil() {
		return doctorRegistrationCouncil;
	}

	public void setDoctorRegistrationCouncil(String doctorRegistrationCouncil) {
		this.doctorRegistrationCouncil = doctorRegistrationCouncil;
	}

	public String getDoctorRegistrationYear() {
		return doctorRegistrationYear;
	}

	public void setDoctorRegistrationYear(String doctorRegistrationYear) {
		this.doctorRegistrationYear = doctorRegistrationYear;
	}

	public String getDoctorRegistrationNumber() {
		return doctorRegistrationNumber;
	}

	public void setDoctorRegistrationNumber(String doctorRegistrationNumber) {
		this.doctorRegistrationNumber = doctorRegistrationNumber;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getYearOfCompletion() {
		return yearOfCompletion;
	}

	public void setYearOfCompletion(String yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}

	public String getYearOfExperiance() {
		return yearOfExperiance;
	}

	public void setYearOfExperiance(String yearOfExperiance) {
		this.yearOfExperiance = yearOfExperiance;
	}

	public String getEstablishmentName() {
		return establishmentName;
	}

	public void setEstablishmentName(String establishmentName) {
		this.establishmentName = establishmentName;
	}

	public String getEstablishmentCity() {
		return establishmentCity;
	}

	public void setEstablishmentCity(String establishmentCity) {
		this.establishmentCity = establishmentCity;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getMedicalProof() {
		return medicalProof;
	}

	public void setMedicalProof(String medicalProof) {
		this.medicalProof = medicalProof;
	}

	public String getEstablishmentProof() {
		return establishmentProof;
	}

	public void setEstablishmentProof(String establishmentProof) {
		this.establishmentProof = establishmentProof;
	}

	public String getIdentityProof() {
		return identityProof;
	}

	public void setIdentityProof(String identityProof) {
		this.identityProof = identityProof;
	}
public Doctor() {
	// TODO Auto-generated constructor stub
}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", specialization=" + specialization + ", doctorRegistrationCouncil="
				+ doctorRegistrationCouncil + ", doctorRegistrationYear=" + doctorRegistrationYear
				+ ", doctorRegistrationNumber=" + doctorRegistrationNumber + ", college=" + college + ", degree="
				+ degree + ", yearOfCompletion=" + yearOfCompletion + ", yearOfExperiance=" + yearOfExperiance
				+ ", establishmentName=" + establishmentName + ", establishmentCity=" + establishmentCity
				+ ", locality=" + locality + ", medicalProof=" + medicalProof + ", establishmentProof="
				+ establishmentProof + ", identityProof=" + identityProof + "]";
	}

	public Doctor(long doctorId, String specialization, String doctorRegistrationCouncil, String doctorRegistrationYear,
			String doctorRegistrationNumber, String college, String degree, String yearOfCompletion,
			String yearOfExperiance, String establishmentName, String establishmentCity, String locality,
			String medicalProof, String establishmentProof, String identityProof) {
		super();
		this.doctorId = doctorId;
		this.specialization = specialization;
		this.doctorRegistrationCouncil = doctorRegistrationCouncil;
		this.doctorRegistrationYear = doctorRegistrationYear;
		this.doctorRegistrationNumber = doctorRegistrationNumber;
		this.college = college;
		this.degree = degree;
		this.yearOfCompletion = yearOfCompletion;
		this.yearOfExperiance = yearOfExperiance;
		this.establishmentName = establishmentName;
		this.establishmentCity = establishmentCity;
		this.locality = locality;
		this.medicalProof = medicalProof;
		this.establishmentProof = establishmentProof;
		this.identityProof = identityProof;
	}
	
	
}
