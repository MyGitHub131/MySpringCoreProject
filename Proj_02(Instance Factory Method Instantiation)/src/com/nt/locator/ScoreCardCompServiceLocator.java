package com.nt.locator;



import com.nt1.beans.ScoreCardComp;
import com.nt1.beans.ScoreCardCompImpl;

public class ScoreCardCompServiceLocator{

public  ScoreCardComp  locateService(){
   ScoreCardComp scc=new ScoreCardCompImpl();
 return scc;
 }
}