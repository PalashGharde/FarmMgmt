package com.asu.sd.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Table(name="tbl_farm_Details")
public class FarmDetails {

	public FarmDetails() {
		super();
	}

	@Id
	@SequenceGenerator(name = "farmID", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmID")
	private Long farmId;

	@Column(name = "owner", nullable = false)
	private String owner;

	@Column(name = "email", nullable = false)
	private String email;

	public Long getFarmId() {
		return farmId;
	}

	public void setFarmId(Long farmId) {
		this.farmId = farmId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
