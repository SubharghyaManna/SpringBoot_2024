package com.springproject.entity;

import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enq_tbl")
public class Enquiry {

	@Id
	@GenericGenerator(name = "odr_id_gen", type = com.springproject.sequence.EnquirySequenceGenerator.class)
	@GeneratedValue(generator = "odr_id_gen")
	private String enqId;

//	@EmbeddedId
//	private EnqPK pk;
	
	private String enqName;
	
	@Basic(optional = false)
	private Boolean enqStatus;

	@CreationTimestamp
	@Column(updatable = false)
	@Basic(fetch = FetchType.LAZY)
	private LocalTime dateCreated;

	@UpdateTimestamp
	@Column(insertable = false)
	@Basic(fetch = FetchType.LAZY)
	private LocalTime dateUpdated;

//	@Override
//	public String toString() {
//		return "Enquiry [pk=" + pk + ", enqName=" + enqName + ", enqStatus=" + enqStatus + ", dateCreated="
//				+ dateCreated + ", dateUpdated=" + dateUpdated + "]";
//	}

}
