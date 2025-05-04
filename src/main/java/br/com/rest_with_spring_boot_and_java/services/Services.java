package br.com.rest_with_spring_boot_and_java.services;

import br.com.rest_with_spring_boot_and_java.exeption.UnsupportedMathoperationExeption;

public class Services {

  public double sum(String x, String y) {

      if(!isNumeric(x,y)){
          throw new UnsupportedMathoperationExeption("Please set two numeric value! ");
      }
      return convertDouble(x) + convertDouble(y);
  }

  public double sub(String x, String y){
      return  this.sum(x,  "-"+y );
  }

  public  double multi(String x, String y){
      if(!isNumeric(x,y)){
          throw new UnsupportedMathoperationExeption("Please set two numeric value!");
      }

      return convertDouble(x) * convertDouble(y);
  }

    public  double division(String x, String y){
        if(!isNumeric(x,y)){
            throw new UnsupportedMathoperationExeption("Please set two numeric value!");
        }

        return convertDouble(x) / convertDouble(y);
    }

    public  double media(String x, String y){
        if(!isNumeric(x,y)){
            throw new UnsupportedMathoperationExeption("Please set two numeric value!");
        }

        return sum(x,y)/2;
    }

    public  double raiz(String x){
        if(!isNumeric(x,"0")){
            throw new UnsupportedMathoperationExeption("Please set two numeric value!");
        }

        return Math.sqrt(convertDouble(x));
    }

    private boolean isNumeric(String x, String y ) {
        String numberX = x.replace(",",".");
        String numbery = y.replace(",",".");

        System.out.println(numbery);

        Boolean booleanX = numberX.matches("[+-]?[0-9]*\\.?[0-9]+");
        Boolean booleanY = numbery.matches("[+-]?[0-9]*\\.?[0-9]+");

        return booleanX && booleanY;
  }

  private double convertDouble(String strNumber){
        String numberX = strNumber.replace(",",".");
        return Double.parseDouble(numberX);
  }
}
