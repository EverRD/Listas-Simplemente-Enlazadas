/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.enlazadas;

/**
 *
 * @author GATEWAY
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista listita=new Lista();
    
    int opcion=0; 
    do{
       
       try{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.Agregar un elemento al inicio de la lista\n2. Mostrar los datos de la lista\n"  + "3. Salir","Menu de opciones",3));
       
        switch(opcion){
            case 1:
                try{
                    el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento:", 
                            "insertando el inicio",3));
               listita.agregarAlInicio(el);
                }catch(NumberFormaException n){
                 JOptionPane.showMessageDialog(null, "Opcion incorrecta"+ n.getMessage());
                }
                break;
            case 2:
                listita.mostrarLista();
               break;
            case 3:
                break;
            default:
     JOptionPane.showMessageDialog(null, "error" + n.getMessage());    
        }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error" + n.getMessage());
        }
        }while(opcion!=3);
        
        }
    }
    
    

