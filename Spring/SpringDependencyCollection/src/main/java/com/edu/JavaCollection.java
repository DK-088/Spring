package com.edu;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollection {
	
	private List listAddress;
	private Set setAddress;
	private Map mapaddress;
	public List getListAddress() {
		return listAddress;
	}
	public void setListAddress(List listAddress) {
		this.listAddress = listAddress;
	}
	public Set getSetAddress() {
		return setAddress;
	}
	public void setSetAddress(Set setAddress) {
		this.setAddress = setAddress;
	}
	public Map getMapaddress() {
		return mapaddress;
	}
	public void setMapaddress(Map mapaddress) {
		this.mapaddress = mapaddress;
	}
	
	public void displayList() {
		System.out.println(listAddress);
	}
	
	public void displaySet() {
		System.out.println(setAddress);
	}
	
	public void didplaymap() {
		System.out.println(mapaddress);
	}

}
