import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * LaptopBuilder
 */
public class LaptopBuilder {

  atic String selectOption(Map<String, I nteger> optionMap, String componentType){ 
    ner userInputProcess = new Scanner(System.in);

    ng[] options = optionMap.keySet().toArray(new String[optionMap.size()]);
    (in t index = 0; index < options.length; index++){ 
      .out.println(index + " . " + options[index] + " : " + optionMap.get(options[index]));
    
    

    
    em.out.println("Please select " + componentType);
    ger selectedIndex = Integer.parseInt(userInputProcess.nextLine()
    em.out.println("You've selecte
  r

   
     void displayLaptop(Map<String, String> currentLaptop) {
    ng[ ] options = currentLaptop.keySet().toArray(ne Sr i
       index = 0; index < options.length; index++) {
    s
    t
  }

   
    tic void main(String arg ng, Integer> screenOp
        entry("Touchscreen", 300));

    Map.entry("32gb", 350));ng, Integer> hddOption entry("256GB SSD", 360)
        St
    Map.entry("i7", 1000));ng, String> currentLaptop  
        ut.println("Please select yo en

    entLaptop.put("hdd", selectOption(hddOptions, "hdd"));aptop.put("processor" 
        aptop(currentLaptop);
    

    

    
    
    
    

    
  