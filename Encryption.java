/*Encryption program 
 * Only encrypt alphabetics not the numbers and special characters
 * encryption key will be in the last of the character of the input string
 * input like 9#qwer5ty*o#8
 * 9-length of the String of to be encrypt of input
 * 8-is the key rotate right the alphabets depends on the key in circular manner
 */
import java.util.*;
class Encryption{
public static void encrypt(String input){
      String[] ar=input.split("#");
      String input2=ar[1];
      int input3=Integer.parseInt(ar[2]);
      String result="";
      for(int i=0;i<input2.length();i++){
        char ch=input2.charAt(i);
        int key=0;
        int count=0;
        int temp=0;
        if(Character.isAlphabetic(ch)){
          if(Character.isUpperCase(ch)){
            key=64;
          }if(Character.isLowerCase(ch)){
            key=96;
          }
          count=((int)ch)-key;
          if(count>(26-input3)){
            temp=(count+input3)%26;
          }else{
            temp=count+input3;
          }
          result+=((char)(key+temp));
        }else{
          result+=ch;
        }
      }
      System.out.println(result);
  }
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input=in.next();
    encrypt(input);
  }
}