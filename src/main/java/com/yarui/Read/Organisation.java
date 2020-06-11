package com.yarui.Read;

import java.util.Date;

public class Organisation {

	private String Station;
	private double Value;
	private String ItemName;
	private String FileId;
	private String TimeSlot;
	private String PortName;
	private Date DateTime;
	
	

	public Organisation(String station, double value, String itemName, String fileId, String timeSlot,
			String portName, Date dateTime) {
		super();
		Station = station;
		Value = value;
		ItemName = itemName;
		FileId = fileId;
		TimeSlot = timeSlot;
		PortName = portName;
		DateTime = dateTime;
	}
	
	

	@Override
	public String toString() {
		return "PortStationBean [Station=" + Station + ", Value=" + Value + ", ItemName=" + ItemName + ", FileId="
				+ FileId + ", TimeSlot=" + TimeSlot + ", PortName=" + PortName + ", DateTime=" + DateTime + "]";
	}

	public String getStation() {
		return Station;
	}

	public void setStation(String station) {
		Station = station;
	}

	public double getValue() {
		return Value;
	}

	public void setValue(double value) {
		Value = value;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getFileId() {
		return FileId;
	}

	public void setFileId(String fileId) {
		FileId = fileId;
	}

	public String getTimeSlot() {
		return TimeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		TimeSlot = timeSlot;
	}

	public String getPortName() {
		return PortName;
	}

	public void setPortName(String portName) {
		PortName = portName;
	}

	public Date getDateTime() {
		return DateTime;
	}

	public void setDateTime(Date dateTime) {
		DateTime = dateTime;
	}

}
