package hw1;

import java.math.BigDecimal;

public class Problem5 {
	public static void main(String[] args) {
		double total = 1500000 * Math.pow(1 + 0.02, 10);
		System.out.println("本金加利息共：" + total + "元" );
		
		BigDecimal bd = new BigDecimal(1500000)
						  .multiply(new BigDecimal(1)
						  .add(new BigDecimal("0.02"))
						  .pow(10));
		System.out.println(bd);
	}

}
