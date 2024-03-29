package StriverDSASheet;

public class lemonadeExchange {
    public static boolean lemonadeChange(int []bill) {
        int five = 0;
        int ten = 0;
        for(int i=0;i<bill.length;i++)
        {
            if(bill[i]==5)
            {
                five++;
            }
            else if(bill[i]==10 && five>0)
            {
                ten++;
                five--;
            }
            else if(bill[i]==20 && five>0 && ten>0)
            {
                ten--;
                five--;
            }
            else if(bill[i]==20 && five>2)
            {
                five=five-3;
            }
            else
                return false;
        }
        return true;
    }
}
