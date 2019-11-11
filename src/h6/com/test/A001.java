package h6.com.test;

import java.util.List;

import h6.com.test.dao.TJfxZbjl;

public class A001  extends Counter{

	@Override
	public TJfxZbjl calculation() {
		System.out.println(this.beanName);
		return null;
	}

	@Override
	public List<TJfxZbjl> calculations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void call() {
		System.out.println(this.beanName);
		
	}




	
}
