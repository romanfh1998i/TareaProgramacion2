/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tarea23.v4.newpackage;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
      


/*
@Controller
public class controllers {Locale locale=Locale.getDefault();    

    
     @RequestMapping("/")
    public String greeting() throws IOException {
        
         
  
        System.out.println("Comienzo");  
  
        //Properties p=new Properties();  
        //p.setProperty("name","Name eingeben");  
        //p.setProperty("title","Füllen User Form");  

        //p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");
        
  
  FileReader reader=new FileReader("usermsg_de_1.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("name"));  
    System.out.println(p.getProperty("title"));  
        return "view";
    }
 
    
}


*/



@RestController
public class controllers {Locale locale=Locale.getDefault();    

    
     @RequestMapping("/")
    public String greeting() throws IOException {
        
         
  
        System.out.println("Comienzo");  
  
        FileReader reader=new FileReader("usermsg_de_1.properties");  
      
        Properties p=new Properties();  
        p.load(reader);  

        System.out.println(p.getProperty("name"));  
        System.out.println(p.getProperty("title"));  
        return p.toString() ;
    
                
    }
 
    
}