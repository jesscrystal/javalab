package com.zzk.bean;

public class Memo {
	private int id = 0;
	private String name = null;
	private String matter = null;
	private String MatterDate = null;
	private int TypeID = 0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatter() {
		return matter;
	}
	public void setMatter(String matter) {
		this.matter = matter;
	}
	public String getMatterDate() {
		return MatterDate;
	}
	public void setMatterDate(String matterDate) {
		MatterDate = matterDate;
	}
	public int getTypeID() {
		return TypeID;
	}
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}
}
