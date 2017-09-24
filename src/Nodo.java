/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GATEWAY
 */
public class Nodo {
    public int dato;
    public Nodo siguiente; //Puntero enlace
    public Nodo (int d) {
        this.dato=d;
     }
   //Constructor para insertar al inicio
    public Nodo(int d, Nodo n){
      dato=d;
      siguiente=n;
    }

}