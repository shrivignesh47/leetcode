// class Solution {
//     public int maxProfit(int[] prices) {
//         int b=prices[0];
//         int p=0;
//         for(int i=1;i<prices.length;i++)
//         {
//               if(prices[i]<b){
//                 b=prices[i];
//               }
//               else if(prices[i] - b>p){
//                 p=prices[i] - b;
//               }
//         }
//               return p;
        
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int b=prices[0];
        int p=0;
        for(int i=1;i<prices.length;i++)
        {
              int c=prices[i]-b;
              p=Math.max(p,c);
              b=Math.min(b,prices[i]);
        }
              return p;
    }
}