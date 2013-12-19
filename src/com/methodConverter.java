package com;

/**
 * Created by sameer on 12/17/13.
 */
public class methodConverter {
    public double result;
    public double converter(String fcurr , String tcurr, double am)
    {
        if(fcurr.equalsIgnoreCase("nc")){
            try{
                   if(tcurr.equalsIgnoreCase("usD")){
                       return am*100;
                }
                else if (tcurr.equalsIgnoreCase("pound")){
                       return am*122;
                   }
                else if (tcurr.equalsIgnoreCase("ic")){
                       return am*1.6;
                   }
                else if(tcurr.equalsIgnoreCase("auD")){
                    return  am*80;
                }
                else if(tcurr.equalsIgnoreCase("yen")){
                    return am*10;
                }
            }catch (Exception e){
                System.out.println("ERROR !!....");
            }
        }
        return 0;
    }
}