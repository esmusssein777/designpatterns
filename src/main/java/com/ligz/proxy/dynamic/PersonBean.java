package com.ligz.proxy.dynamic;

/**
 * @author ligz
 */
public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRating();
	
	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrNotRating(int rating);
	
}
