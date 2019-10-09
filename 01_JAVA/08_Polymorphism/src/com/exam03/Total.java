package com.exam03;

public class Total implements Const {
	
	int tot;
	int avg ;
	
public void Tsum () {
	System.out.println(getName()+ "ÀÇ ÇÏ·ç Â¢´Â ÃÑ È½¼ö  : " + (am + pm));
}

public void Tavg() {
	System.out.println(getName()+ "ÀÇ ÇÏ·ç Â¢´Â Æò±Õ È½¼ö  : " + (am + pm)/2);
	
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return "¸Û¸ÛÀÌ";
}

}
