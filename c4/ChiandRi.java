public class ChiandRi{
    public static void main(String[] args){
        for(int chi = 1;chi < 35;chi ++)
            for(int ri = 1;ri < 35;ri ++)
                if(chi + ri ==35 && chi * 2 + ri * 4 ==94)
                    System.out.println("¼¦:"+chi+"ÍÃ£º"+ri);
    }
}