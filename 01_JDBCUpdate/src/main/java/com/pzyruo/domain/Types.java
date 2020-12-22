package com.pzyruo.domain;

import java.util.List;

public class Types {
	// type_id int
	private Integer typeId;
	// type_name varchar
	private String typeName;
	// type_pid int
	private Integer typePid;
	// type_level int
	private Integer typeLevel;
	// type_path varchar
	private String typePath;
	// type_pid int
	private Types ptype;//当前类型的父类型
	// type_pid int
	private List<Types> typeList;//当前类型的子类型集合

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getTypePid() {
		return typePid;
	}

	public void setTypePid(Integer typePid) {
		this.typePid = typePid;
	}

	public Integer getTypeLevel() {
		return typeLevel;
	}

	public void setTypeLevel(Integer typeLevel) {
		this.typeLevel = typeLevel;
	}

	public String getTypePath() {
		return typePath;
	}

	public void setTypePath(String typePath) {
		this.typePath = typePath;
	}

	public Types getPtype() {
		return ptype;
	}

	public void setPtype(Types ptype) {
		this.ptype = ptype;
	}

	public List<Types> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<Types> typeList) {
		this.typeList = typeList;
	}
}
