package com.bridgelabz.FlipCoin;

import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log = LogManager.getLogger(App.class);
	private int NumTimesFlipCoin ;
	private Double[] FlipValues ;
	private double HeadFaceCount;
	private double TailFaceCount;
	public static void main( String[] args )
	{
		// this section of the code will generate log file and print log message on console
		String message="Welcome , percentage of the line will be calculated....";
		Log.debug(message + " will be printed on Debug");
		Log.info(message + " Will be printed on info");
		Log.warn(message + " will be printed on warn");
		Log.error(message + " will be printed on error");
		Log.fatal(message + " will be printed on fatal");
		Log.info("Appending String: {}.", message);
		System.out.println(message);
		App A= new App();
		A.setNumTimesFlipCoin();
		A.setHeadFaceCount();
		A.setTailFaceCount();
		A.flipValuesOfCoin();
		A.calculatePercentage();

	}
	//method to return the value of NumTimesFlipCoin
	public int getNumTimesFlipCoin() {
		return NumTimesFlipCoin;
	}
	//method to take the input that how many times the coin should be flipped
	public void setNumTimesFlipCoin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value , upto which coin need to be flipped");
		this.NumTimesFlipCoin= sc.nextInt(); 

	}

	//method to set the value of HeadFaceCount
	public void setHeadFaceCount() {
		this.HeadFaceCount=0;
	}

	//method to set the value of TailFaceCount
	public void setTailFaceCount() {
		this.TailFaceCount=0;
	}

	//method to store flip values of coin
	public void  flipValuesOfCoin() {
		//creating object of random
		Random rmd = new Random();
		this.FlipValues =new Double[NumTimesFlipCoin];
		for(int i=0; i<this.NumTimesFlipCoin;i++) {
			this.FlipValues[i]=rmd.nextDouble();
			System.out.println(FlipValues[i]);
		}
	}

	//method to calculate head percentage and tail percentage
	public void calculatePercentage() {
		for(int i=0;i<NumTimesFlipCoin;i++) {
			if(FlipValues[i]<0.5) {
				this.HeadFaceCount=HeadFaceCount+1;


			}
			else {
				this.TailFaceCount= TailFaceCount+1;

			}
		}

		System.out.println("Head Face percentage :"+ (int)((HeadFaceCount/NumTimesFlipCoin)*100) +"%");
		System.out.println("Tail Face percentage :"+(int) ((TailFaceCount/NumTimesFlipCoin)*100) +"%");
	}

}
