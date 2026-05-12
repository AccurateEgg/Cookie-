
public class Cookies {
    int cookieCount = 0;
    int CCLick = 1;
    int ImprPrice = 0;
    int ImprInitPrice = 5;

    public int getCookieCount(){return cookieCount;}
    public int getCCLick(){return CCLick;}
    public int getImprBuy(){return ImprBuy;}

    public int getImprPrice(){
       15(price)*(1.5)^(that many times bought)
        return (int) Math.round(ImprInitPrice*Math.pow(1.15,ImprBuy));
    }

    public void Click(){
        cookieCount+= CCLick;
    }

    public boolean buyImpr(){
        int price = getImprPrice();
        if(cookieCount>=price){
            cookieCount-=price;
            ImprBuy++;
            CCLick++;
            return true;
        }
        return false;
    }
}
