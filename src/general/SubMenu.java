
package general;

import BaseDatos.BaseDatosCaso1;
import facturas.LineaFactura;
import java.util.Scanner;
import logica.CrearFactura;


public class SubMenu {
    CrearFactura c;
    Scanner sc = new Scanner(System.in);
    
    public SubMenu() {
        String ced;
        boolean prueba = false;
        
        System.out.println("¿Cuál es la cédula del cliente? (formato de 9 dígitos)");
        ced = sc.nextLine();
        
        // Restricción para ingreso de cedula
        // Se detecta si se ingresan valores no numericos o con una extención numerica diferente de 9 digitos
        
        while (true){                     
             for (int i=0; i<ced.length();i++){                                                             
                 if (!(Character.isDigit(ced.charAt(i)))){ 
                     prueba = true;
                     System.out.println("Error, no ingresó un valor numérico\nPor favor ingrese la cédula nuevamente:");                              
                     ced = sc.nextLine();                  
                     break; 
                 }                
                             
                 else { 
                     prueba = false;                                                                          
                 }               
             }   
             
             if (prueba == false && ced.length() != 9){
                 System.out.println("Error, ingresó un valor con más de 9 dígitos\nPor favor ingrese la cédula nuevamente:");                              
                 ced = sc.nextLine();     
             }
             
             if (prueba == false && ced.length() == 9){
                  break;
              }      
         }        
        
        c = new CrearFactura(ced); 
        
        solicitarDatos();
    }
    
    private void solicitarDatos(){
        
        int cantidad = 0;
        String descripcionProd;
        double precio;
        
        while (true) {
            while (!(cantidad == -1)){
                System.out.println("Digite la cantidad o -1 para finalizar:");
                cantidad = Integer.parseInt(sc.nextLine());
                
                // El programa no detecta si se están ingresando letras o números a la hora de ingresar la cantidad

                if (cantidad == -1){
                    break;
                }
                
                if (cantidad < 0 && cantidad != -1){
                    System.out.println("Valor de cantidad no válido");    
                }  
                
                if (cantidad > 0 && cantidad != -1){
                    break;    
                }                 
            }
            
           if (cantidad == -1){
                break;
            }
           
           System.out.println("Indique la descripción del producto:");
           descripcionProd = sc.nextLine();
           
           System.out.println("Indique el precio total:");
           precio = Double.parseDouble(sc.nextLine());
           
           // El programa no detecta si se están ingresando letras o números a la hora de ingresar el precio
           
           LineaFactura ln = new LineaFactura(cantidad, descripcionProd, precio);  
           c.agregarLinea(ln);
        }   
        
        c.cerrarFactura();
        BaseDatosCaso1.getInstancia().getFacturas().add(c.getF());
    }    
}
