package com.practice.streams;

public class Parts {

	private String partsName;
	private String partDescription; 
	private int partNo;
	
	public String getPartsName() {
		return partsName;
	}

	public void setPartsName(String partsName) {
		this.partsName = partsName;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getPartNo() {
		return partNo;
	}

	public void setPartNo(int partNo) {
		this.partNo = partNo;
	}

	public Parts(String partsName, String partDescription, int partNo) {
		//super();
		this.partsName = partsName;
		this.partDescription = partDescription;
		this.partNo = partNo;
	}


}
