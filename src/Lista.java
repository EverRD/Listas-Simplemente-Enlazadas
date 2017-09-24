/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GATEWAY
 */
public class Lista {
    
  protected Nodo inicio,fin; //Punteros para saber donde esta elinicio y el final
  public Lista (){
      inicio=null;
      fin=null;
  }
//metodo para agregar un nodo al inicio de la lista 
  public void agregarAlinicio(int elemento){
      //creanbdo al nodo
      inicio= new Nodo(elemento ,inicio);
      if(fin==null){
          fin=inicio;
          
      }
  }
//Metodo para mostrar los datos
  public void MostrarLista(){
      Nodo recorrer=inicio;
      while (recorrer!=null){
          System.out.println("["+recorrer.dato+"]--->");
      }
  }
}
