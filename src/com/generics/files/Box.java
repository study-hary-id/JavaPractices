package com.generics.files;

public class Box<T> {

	private T typeData;

	public T getTypeData() {
		return this.typeData;
	}

	public void setTypeData(T typeData) {
		this.typeData = typeData;
	}

	@Override
	public String toString() {
		return "Box{typeData=" + typeData + "}";
	}

}
