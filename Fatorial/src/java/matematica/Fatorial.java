/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

/**
 *
 * @author anderson
 */
public class Fatorial {
    public int fatorial(int n){
        int fat=1;
        for(int i=1; i<=n; i++)
            fat*=i;
        return fat;
    }
}
