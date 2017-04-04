package com.java.Object;

class OverrideEqualsAndHashcode extends OverridingTest{

	@Override
	public int getSum(int c, int d) {
		// TODO Auto-generated method stub
		return c;}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


}

