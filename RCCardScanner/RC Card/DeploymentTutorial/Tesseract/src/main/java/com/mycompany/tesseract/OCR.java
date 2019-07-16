
package com.mycompany.tesseract;

import java.io.*;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import marvin.util.MarvinAttributes;
import marvin.image.MarvinImage;


public class OCR {
    
    
    
    public String dataPath = "C:\\Program Files\\Tesseract-OCR\\tessdata";
    public String rcPath = "D:\\Programming\\Java\\Workspace\\TextDetection\\src\\Images\\ORC";
    
    public static void main(String[] args) throws TesseractException, IOException {
	// OCR -----------------
        
        //Runtime.getRuntime().exec("cd C:/Users/Prateek/");
        Runtime.getRuntime().exec("python mycall.py");
        System.out.println("exec called");
        /*
	Tesseract tess = new Tesseract();
        OCR ocrbj = new OCR();
	tess.setDatapath(ocrbj.dataPath);
		
	String text;
	text = tess.doOCR(new File(ocrbj.rcPath+"\\MyRC.jpg"));	
	System.out.println(text);
        
        File forefile;
        forefile = new File(ocrbj.rcPath+"\\colorOutput2.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(forefile));
        writer.write(text);
        writer.close();
        GreyIt gr = new GreyIt();
        gr.generateGreyScaleImage();
        
        text = tess.doOCR(new File(ocrbj.rcPath+"\\greyRC2.jpg"));
        File greyfile = new File(ocrbj.rcPath+"\\greyRC2.txt");
        writer = new BufferedWriter(new FileWriter(greyfile));
        writer.write(text);
        writer.close();
        
        System.out.println(" :)");*/
	}
}
