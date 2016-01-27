/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Chris
 */
public class Lab1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		try{
			FileInputStream fis = new FileInputStream("C:\\JavaFiles\\myFile.txt");
			boolean eof=false;
                        while (!eof){
                         char c = (char) fis.read();
                         if (c==(int)65535)
                             eof=true;
                         else{
                        System.out.println(c);
                        }}
			fis.close();
		}catch (IOException e){
			System.out.println("Error" +e.toString());
		}
                 		try{
			FileInputStream fis2 = new FileInputStream("C:\\JavaFiles\\myFile.txt");
			FileOutputStream fos = new FileOutputStream("C:\\JavaFiles\\myFileOut.txt");
                            boolean eof=false;
			while (!eof){
				char c = (char)(fis2.read());
                                if(c==(int)65535)
                                    eof=true;
                                else{
				fos.write(c);
                                }
			}
			fis2.close();
			fos.close();
		}catch (IOException e){
			System.out.println("Error" +e.toString());
		}
    }
    
}
