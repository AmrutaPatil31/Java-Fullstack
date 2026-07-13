package com.MS.Service;

import com.MS.DAO.MobileDao;
import com.MS.Entity.MobileEntity;

public class MobileService {
	public MobileEntity getMobile(){
		MobileDao dao=new MobileDao();
		MobileEntity m=dao.getMobile();
		return m;
	}
}
