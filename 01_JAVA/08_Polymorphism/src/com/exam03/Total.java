package com.exam03;

public class Total implements Const {
	
	int tot;
	int avg ;
	
public void Tsum () {
	System.out.println(getName()+ "�� �Ϸ� ¢�� �� Ƚ��  : " + (am + pm));
}

public void Tavg() {
	System.out.println(getName()+ "�� �Ϸ� ¢�� ��� Ƚ��  : " + (am + pm)/2);
	
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return "�۸���";
}

}
