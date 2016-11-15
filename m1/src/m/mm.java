package m;



public class mm {
	
	

		public static void main(String[] args){       
		       
			char[] array = "Это моя первая программа".toLowerCase().toCharArray();
	        for (int i = 0; i < array.length; i++) {
	            int number = Character.codePointAt(array, i) - 1071;
	            if(number > 0) { 
	                System.out.print(number + ", ");
	            }
	        }
        }
		}
		


