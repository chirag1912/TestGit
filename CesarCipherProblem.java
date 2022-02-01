/*Cesar Cipher Learnings:
  1. Can use unary comparison for comparing the characters of the string;
  2. Do k%26 before only if negartive: do (-num%26)+26 as given k is to be moved backwards; and by these many characters;
  
  3. if c>'z' make str+= ch-(26-k);
  4. Also, if(c>'Z') str+=ch-(26-k);
  
  subtracting backwards will give the rotation of the alphabets;
 Most IMP:
 
 5. Java has function Character.isLetter("INPUT_TO_CHECK")
  6. Character.isLowerCase("INPUT_TO_LOWER_CASE")
  7. Character.isUpperCase("INPUT_TO_CHECK");
  as need to skip the other symbols coming i the input straing of ours;  
  
  
  TC: O(N) as need to traverse all the characters of the given string;
  SC: O(1) as returning the string used; and others rae just constant;
*/

public class Cesar_cipher {

	public static void main(String[] args) {
		
		String input="I am to be encrypted";
		int k=28;
		String s1=encrypt(input, k);
		System.out.println(s1);
	}
	
	public static String encrypt(String input,int k) {
		
		int length=input.length();
		String str1="";
		
		if(k>26) {
			k=k%26;
		}else if(k<0) {
			k=k%26+26;
		}	
		
		for(int i=0;i<length;i++) {
			Character ch=input.charAt(i);

			if(Character.isLetter(ch)) {			//Checkin if ch is Letter
				if(Character.isLowerCase(ch)) {
					//Need to calculate sum for both lowerCase and Upper Case separately;
					char c=(char)(ch+k);
					if(c>'z') {		//Can compare character to character as internaly they are being compared with their ascii value;
						str1+=(char)(ch-(26-k));
					}else {
						str1+=c;
					}
				}else if(Character.isUpperCase(ch)) {
					char c=(char)(ch+k);
					if(c>'Z') {		//Can compare character to character as internaly they are being compared with their ascii value;
						str1+=(char)(ch-(26-k));
					}else {
						str1+=c;
					}
				}
			}	
			else if(Character.isDigit(ch)) {
				int ch1=(int)ch;
				int c=ch1+k;
				if(c>9) {
					str1+=ch1-9-k;
				}else {
					str1+=c;
				}
			}
			
				else {
				str1+=ch;
			}
		}
		
		return str1;
	}	
}
