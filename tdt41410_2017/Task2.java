public class Task2 {
	static  void  printCapitalized( String str ){
		 for ( i = 0;  i < str.length();  i++ ) {        
		         ch = str.charAt( i );
		         if ( Character.isLetter(ch) && ! Character.isLetter(str.charAt(i-1)) )
		             System.out.print( Character.toUpperCase(ch) );
		         else
		             System.out.print( ch );
		     }
		     System.out.println();
	 }
}