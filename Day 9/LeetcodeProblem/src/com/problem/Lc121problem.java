// package com.problem;

// public class Lc121problem {

// 	public static void main(String[] args) {
// 		int prices[] = {7,1,5,3,6,4};
// 		Lc121problem l=new Lc121problem();
// 		int maxProfit=l.bestTimeSellStock(prices);
// 		System.out.println(maxProfit);
		

// 	}
// 		public int bestTimeSellStock(int[] price)
// 		{
// 			int min=Integer.MAX_VALUE;
// 			int maxpro=0;
// 			for(int i=0;i<price.length;i++)
// 			{
// 				min=Math.min(min, price[i]);
// 				maxpro=Math.max(maxpro,price[i]-min);
// 			}
// 			return maxpro;
// 		}
// }