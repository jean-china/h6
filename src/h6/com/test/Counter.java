package h6.com.test;

import java.util.List;

import h6.com.test.dao.TJfxZbjl;

/**
 * ¼ÆËãÆ÷
 * 
 * @author Administrator
 *
 */
public abstract class Counter {
	public String xmbm;
	public String grid;
	public String beanName;

	public void setXmbm(String xmbm) {
		this.xmbm = xmbm;
	}

	public void setGrid(String grid) {
		this.grid = grid;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public abstract void call();

	public abstract TJfxZbjl calculation();

	public abstract List<TJfxZbjl> calculations();
}
