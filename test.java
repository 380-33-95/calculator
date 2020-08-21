package testA;

import java.util.Scanner;

/*
 * Описание:
Создайте консольное приложение “Калькулятор”.
Приложение должно читать из консоли введенные пользователем арифметические операции и выводить в консоль результат их выполнения.

Требования:
1) Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотрите пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.
2) Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
3) Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
4) Калькулятор умеет работать только с целыми числами.
bcrk) Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
bcrk) При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
bcrk) При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.
Пример работы программы:
Input:
1 + 2

Output:
3

Input:
VI / III

Output:
II
 */

public class test extends StringProcessor{

	


	public static void main(String[] args) {

	 test t = new test();
	
	 List.ArabIni();
	 List.RimeIni();
	 List.OperationIni();
		
		 Scanner in = new Scanner(System.in);
	        System.out.printf("Input: \n");
	        t.setNum( in.nextLine());
	          
	        System.out.println();
	        System.out.printf("Output \n");
	        System.out.printf(t.getNum()+" length= "+ t.getNum().length());
	        System.out.println();
	        
	        in.close();
	        t.DeleteProbel();
	        t.VerefyOperation();
	        t.RasbivkaStroki();
	      if (!t.VerifyArabic()) {
	    	  t.VerifyRime();
	      }
	      
	       System.out.println(t.VerifyArabic());
	        System.out.println(t.VerifyRime());
	        System.out.println(t.isArabicRime());
	      
	      if(t.isArabicRime()) {
	    	System.out.println("Result="+t.ArabicOper());
	      }
	        
	      //1/5  System.out.printf(t.getNum()+" length= "+ t.getNum().length());
	       
	        }
		
		
	}


