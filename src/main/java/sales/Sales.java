package sales;

/**
 * @author Dm.Petrov
 * DATE: 07.05.2023
 */
public class Sales {
    public int bestProfit(int [] prices){
        int min = prices[0];
        int result = 0;
        for (int i = 1; i <prices.length ; i++) {
            if(prices[i]<min){min=prices[i];}
            if(prices[i]-min>result){result=prices[i]-min;}
        }
        return result;
    }
}
