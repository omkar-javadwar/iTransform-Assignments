package com.testing.app;

public class Find{
	int min;
	int max;
	
	public Find(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Find other = (Find) obj;
		return max == other.max && min == other.min;
	}

	
}
