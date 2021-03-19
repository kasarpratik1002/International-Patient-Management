package com.cts.iptms.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class PackageDetail {
	private String treatmentPackageName;
	private String testDetails;
	private double cost;
	private int treatmentDuration;
	// duration is in weeks;
}
