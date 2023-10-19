/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brawnator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Brawnator {

    public static void main(String[] args) {
        boolean encotrado = false;
       List<String[]> homem = new ArrayList<>();
       String[] homem1 = {"Ezio", "espada", "orb"};
       String[] homem2 = {"koji", "arco", "espada"};
       String[] homem3 = {"jiro", "espada", "foice"};
       String[] homem4 = {"rayman", "luvas", "machado"};
       String[] homem5 = {"lord vraxx", "vassoura", "pistola"};
       homem.add(homem1);
       homem.add(homem2);
       homem.add(homem3);
       homem.add(homem4);
       homem.add(homem5);
        Scanner scan = new Scanner(System.in);
        System.out.println("qual o genero do personagem?");
        String genero = scan.next();
         System.out.println("qual a arma principal do personagem?");
        String arma_principal = scan.next();
         System.out.println("qual a arma secundaria do personagem?");
        String arma_secundaria = scan.next();
        for(String[] str: homem){
            if(str[1].equals( arma_principal)&& str[2].equals(arma_secundaria)){
                encotrado = true;
                System.out.println("o seu personagem é"+ str[0]);
                break;
                
            }
        }
       
    }
}
