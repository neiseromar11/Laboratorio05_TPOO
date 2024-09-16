/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio04;

import javax.swing.JTextField;

/**
 *
 * @author NEISER
 */
public class Logica {
    private double valor;
   private JTextField valorLog;
    
    public Logica(JTextField valorLog){
        this.valorLog=valorLog;
    }
   private void convertir(){
       this.valor=getNumDesTextField(valorLog);
   }
    
    public double celsiusAFahrenheit (){
        convertir();
     return (valor * 9/5) + 32;
    }
    public double fahrenheitACelsius(){
        convertir();
    return (valor - 32) * 5/9;
    
    }
    public double kilosALibras(){
        convertir();
    return valor * 2.205;
    
    }
    public double librasAKilos(){
        convertir();
    return valor / 2.205;
    
    }
    public double piesAMetros(){
        convertir();
    return valor * 0.3048;
    
    }
    public double MetrosAPies(){
        convertir();
    return valor / 0.3048;
    }
    public double solesADolares(){
        convertir();
    return valor * 3.77;
    }
    public double dolaresASoles(){
        convertir();
    return valor / 3.77;  
    }
      private double convertirNum(String text){
         try{
             return Double.parseDouble(text);
         }catch(Exception e){
             return 0;
         }
    }
    private double getNumDesTextField(JTextField text){
    String val=text.getText();
    return convertirNum(val);
    }
    
}