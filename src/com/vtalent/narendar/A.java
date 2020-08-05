package com.vtalent.narendar;

public class A {

	int i;
	int j;
	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		return true;
	}
}
