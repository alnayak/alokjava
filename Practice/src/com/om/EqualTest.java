package com.om;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


class ABC{
	int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ABC [userId=" + userId + "]";
	}
	
	
}
public class EqualTest {

	public static void main(String[] args) {
		ABC abc=new ABC();
		ABC abc1=new ABC();
		abc.setUserId(1000);
		abc1.setUserId(1000);
		Set<ABC> set=new HashSet<ABC>();
		set.add(abc);
		set.add(abc1);
		System.out.println(set);
		

	}

}
