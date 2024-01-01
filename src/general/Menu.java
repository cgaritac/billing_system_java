
package general;

import BaseDatos.BaseDatosCaso1;
import facturas.Factura;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }
    
    public void iniciarPrograma() {
        String txtMenu;
        String selec;
        int seleccion=0;
        boolean prueba = false;
        
        Scanner sc = new Scanner(System.in);
        
        do {        
        txtMenu = "-------------------------------------\n"
                + "1. Crear factura\n"
                + "2. Mostrar facturas\n"
                + "4. Salir\n"
                + "-------------------------------------\n";
        
        System.out.print(txtMenu);
        selec = sc.nextLine();
        
         while (true){                     
             for (int i=0; i<selec.length();i++){                                                             
                 if (!(Character.isDigit(selec.charAt(i)))){ 
                     prueba = true;
                     System.out.println("Error, no ingresó un valor numérico\nPor favor ingrese la opción nuevamente:");                              
                     selec = sc.nextLine();                  
                     break; 
                 }                
                             
                 else { 
                     prueba = false;
                                                                          
                 }               
             }   
              if (prueba == false){
                  seleccion = Integer.parseInt(selec);     
                  break;
              }                      
         } 
        
        switch (seleccion){
            case 1:
                new SubMenu();
                break;                           
            case 2:
                for (Factura f: BaseDatosCaso1.getInstancia().getFacturas()){
                    System.out.println(f.toString());
                }
                break;
            case 4: 
                break;
            default:
                System.out.println("opción no válida, por favor ingrese un número de opcion del menu");
                break;                
        } 
        
        }while (seleccion != 4);        
    }    
}
        

