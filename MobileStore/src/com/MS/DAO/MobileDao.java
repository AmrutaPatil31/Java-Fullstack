package com.MS.DAO;

import com.MS.Entity.MobileEntity;

public class MobileDao {
	public MobileEntity getMobile() {
		MobileEntity mobile=new MobileEntity(1,"Samsung s2",80000);
		return mobile;
	}
}
