package com.codedifferently.stayready.lab04;
import java.util.*; 


public class Numbers {

    public String oneToTen(){
    	String output ="oneToTen()\n" + "*** Output ***";
    	for(int x=1; x<=10; x++){
    		output += "\n"+ Integer.toString(x);
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n"
    					+"*** Output ***";
    	for(int x =1; x < 20 ; x+=2){
    		output += "\n"+Integer.toString(x);
    	}
    		
        return output;
    }

    public String squares(){
        String output = "squares";
        for (int x = 1;x < 11;x++){
            Integer squared = x * x;
            String conversion = "\n"+ Integer.toString(squared);
            output = output.concat(conversion);
        }
        return output;
    }

    public String random4(){
        String output = "";
        Random ran = new Random(); 
        for(int i=0; i < 4 ; i++) {
            int nxt = ran.nextInt(10);
            output += Integer.toString(nxt) + "\n";} 
        return output;
    }

    public String even(int n){
        return "";
    }

    public String powers(int n){
        return "";
    }

}
