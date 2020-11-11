package ne.training.pkg03;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main calculateHypotenuse = new Main();
        Main calculateFactorial = new Main();
        Main countVowels = new Main();
        Main getDuplicateChar = new Main();
        
        countVowels.countVowels();
        getDuplicateChar.getDuplicateChar();
        calculateHypotenuse.calculateHypotenuse();
        calculateFactorial.calculateFactorial();
       
    }
    
    Scanner reader = new Scanner(System.in);
    
    public void calculateHypotenuse(){
    double a;
    double b;
    System.out.println("Introduce el valor de a:");
    a = reader.nextInt();
    System.out.println("Introduce el valor de b:");
    b = reader.nextInt();
    double result = Math.pow(a,2)+ Math.pow(b, 2);
    double totalResult= Math.sqrt(result);
    System.out.println("Resultado: "+totalResult);
    }
    
    public void calculateFactorial(){
    long factorial=1;
    int number;
    System.out.println("Introduce el número:");
    number = reader.nextInt();
    for (int i=number;i>1;i--){
    factorial = factorial*i;
    System.out.println("number: "+number);
    System.out.println("i:: "+i);
    System.out.println("Resultado: "+factorial);
    }
    }
    
    public void countVowels(){
    int count = 0;    
    System.out.println("Introduce la palabra");
    String word = reader.next();
        
        for(int x=0;x<word.length();x++) {
        if ((word.charAt(x)=='a') || (word.charAt(x)=='e') || (word.charAt(x)=='i') || (word.charAt(x)=='o') || (word.charAt(x)=='u')){ 
            count++;
        }
        }
    System.out.println("cantidad de vocales: "+count);
    }
    
    public void getDuplicateChar(){
    System.out.println("Introduce la palabra");
    String word = reader.next();
      char[] array = word.toCharArray();
      System.out.print("el caracter duplicado es: ");
      for (int i = 0; i < word.length(); i++) {
         for (int j = i + 1; j < word.length(); j++) {
            if (array[i] == array[j]) {
               System.out.print(array[j] + " ");
               break;
            }
         }
      }
    }
}
