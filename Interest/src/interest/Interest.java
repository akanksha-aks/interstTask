/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interest;

/**
 *
 * @author akanksha singh
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Interest {


    public double Interest(int ch,double principle,double rate ,double time,double n)
    { 
        if(ch==1){
        double result1= (principle* rate* time)/100;
                return result1;
               }
    if(ch==2)
    {
        double result2= principle*Math.pow(1.0+rate/100.0,n)-principle;
        return result2;
    }
    else 
        return 0;
    }
}


