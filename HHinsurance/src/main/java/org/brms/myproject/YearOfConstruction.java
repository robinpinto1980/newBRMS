package org.brms.myproject;
import java.util.Calendar;


/**
 * This class was automatically generated by the data modeler tool.
 */

public class YearOfConstruction implements java.io.Serializable
{
   Calendar now = Calendar.getInstance(); 
   public int year = now.get(Calendar.YEAR);
   static final long serialVersionUID = 1L;

   private java.lang.Integer yearOfConstruction;

   public YearOfConstruction()
   {
   }

   public java.lang.Integer getYearOfConstruction()
   {
      return this.yearOfConstruction;
   }

   public void setYearOfConstruction(java.lang.Integer yearOfConstruction)
   {
      this.yearOfConstruction = yearOfConstruction;
   }

   public YearOfConstruction(java.lang.Integer yearOfConstruction)
   {
      this.yearOfConstruction = yearOfConstruction;
   }

}