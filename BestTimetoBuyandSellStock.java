

public class BestTimetoBuyandSellStock {
	
	public static int maxProfit(int[] prices) {
		if(prices.length==0)
			return 0;
		int buyingPriceIndex=minNumberIndex(prices);
		
		int maxSellingPrice=0;
		if((buyingPriceIndex+1)<prices.length)
			maxSellingPrice=prices[buyingPriceIndex+1];
		
		
		for(int i=buyingPriceIndex+2;i<prices.length;i++){
			if(prices[i]>maxSellingPrice){
				maxSellingPrice=prices[i];
			}
		}
		if((maxSellingPrice-prices[buyingPriceIndex])>0)
			return maxSellingPrice-prices[buyingPriceIndex];  
		else
			return 0;
	}
	
	public static int minNumberIndex(int[] prices) {
		int minIndex=0;
		for(int i=1;i<prices.length;i++){
			if(prices[i]<prices[minIndex])
				minIndex=i;
		}
		return minIndex;
	}	
	
	public static int maxNumberIndex(int[] prices) {
		int maxIndex=1;
		for(int i=2;i<prices.length;i++){
			if(prices[i]>prices[maxIndex])
				maxIndex=i;
		}
		return maxIndex;
	}
	
	public static int maxProfitI(int[] prices) {
		if(prices.length==0)
			return 0;
		if(prices.length==1)
			return 0;
		
		if(maxNumberIndex(prices)>minNumberIndex(prices))
			return prices[maxNumberIndex(prices)]-prices[minNumberIndex(prices)];
		else{
			int min=0;
			if(maxNumberIndex(prices)!=0){
				min=maxNumberIndex(prices)-1;
				for(int i=0;i<=maxNumberIndex(prices);i++){
					if(prices[i]<prices[min])
				           min=i;					
				}
			}
			//Double.toString("fsdf"); 
			return prices[maxNumberIndex(prices)]-prices[min];
		}
	
	}
	
	 public static void main(String args[]){
			int[] nums1={2,1,2,1,0,1,2};
			Float f=new 	Float(3.1);
			Integer i=new Integer(1);
			long m=2;
			System.out.print(m+f+i);
			//System.out.print(maxProfitI(nums1));
	  }

}
