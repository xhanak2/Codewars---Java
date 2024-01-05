package org.example;

public class Main {
    public static void main(String[] args) {
        Boolean result = isValid(new char[]{'s','n'});
        System.out.print(result);}
   public static boolean isValid(char[] walk) {
        int n=0;
        int s=0;
        int w=0;
        int e=0;
      for (int i=0; i<=walk.length-1; i++){
          if (walk[i]=='n'){n++;}
          if (walk[i]=='s'){s++;}
          if (walk[i]=='w'){w++;}
          if (walk[i]=='e'){e++;}
      }
      if ((n==s)&&(e==w)&&walk.length==10){return true;}
      else {return false;}
    }
}



// You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.
