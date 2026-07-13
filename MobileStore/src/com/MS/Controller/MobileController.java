package com.MS.Controller;

import com.MS.Entity.MobileEntity;
import com.MS.Service.MobileService;

public class MobileController {

	public static void main(String[] args) {
		MobileService mobile=new MobileService();
		MobileEntity m=mobile.getMobile();
		System.out.println(m);

	}

}
