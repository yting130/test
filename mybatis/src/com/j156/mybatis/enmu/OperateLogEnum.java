package com.j156.mybatis.enmu;

public enum OperateLogEnum {

	SAVE(0), UPDATE(1), DELETE(2);

	private int type;

	private OperateLogEnum(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}

}
