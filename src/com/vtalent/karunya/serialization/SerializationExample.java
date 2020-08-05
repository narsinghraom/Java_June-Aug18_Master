package com.vtalent.karunya.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable {
       int id;
       String name;
       double salary;
       public static void doSerializable() throws Exception{
    	   SerializationExample se=new SerializationExample();
    	   se.id=100;
    	   se.name="karunya";
    	   se.salary=25000.00;
    	   File file=new File("c:/serial.txt");
           FileOutputStream fos=new FileOutputStream(file);
           ObjectOutputStream oos=new ObjectOutputStream(fos);
           oos.writeObject(se);
           System.out.println("serializable.done");
       }
      public static void deSerializable() throws Exception{
    	   FileInputStream fis=new FileInputStream("c:/serial.text");
    	   ObjectInputStream ois=new ObjectInputStream(fis);
    	   Object o=ois.readObject();
    	   if(o!=null){
    		   SerializationExample se=(SerializationExample)o;
    		   System.out.println("id="+se.id);
    		   System.out.println("name="+se.name);
    		   System.out.println("salary="+se.salary);
    		   
    	   }
       }
       public static void main(String[] args)throws Exception
       {
    	   doSerializable();
    	   deSerializable();
       }
}
      