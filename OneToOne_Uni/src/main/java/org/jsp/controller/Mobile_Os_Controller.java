package org.jsp.controller;

import org.jsp.dao.Mobile_Os_dao;
import org.jsp.dto.Mobile;
import org.jsp.dto.Os;

public class Mobile_Os_Controller {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setId(102);
		mobile.setName("gionee");
		mobile.setColor("white");
		mobile.setPrice(12000);
	  
		Os os=new Os();
		os.setId(11);
		os.setName("Android");
		os.setBit(128);
		
		mobile.setOs(os);
		
		Mobile_Os_dao dao=new Mobile_Os_dao();
//		dao.saveMobile(mobile);
//		dao.saveOs(os);
		//dao.updateMobile(mobile);
		//dao.Findidmobile(101);
		//dao.delete(101);
		
		dao.findall();
	}
	

}
