package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("** starts ***");
		
		String a[][] ={  {"0","0","0"},
						 {"0","x","x"},
						 {"x","x","0"}};
	
		String r="",c="";
		int countx=0, countxx=0;
		int countO=0, countOO=0;;
		int k=a[0].length;
		
		for(int i=0; i<=(k-1);i++){
			// each row check
			r=checkEquality(a[i][0], a[i][1], a[i][2]);
			// each column check
			c=checkEquality(a[0][i], a[1][i], a[2][i]);
			
			if(!r.isEmpty()){
				System.out.println(r +" in row");
				break;
			}
				
			if(!c.isEmpty()){
				System.out.println(c +" in column");
				break;
			}
			
			// check diagonal values
			if(a[i][i].equals("x")){
				countxx++;
			}else{
				countOO++;
			} 
			// check reverse diagonal values
			if(a[k-1-i][i].equals("x")){
				countx++;				
			}else{
				countO++;
			}			
		}
		if(countx==3 || countxx==3 ){
			System.out.println("X won in diagonal");			
		}else if(countO==3 || countOO==3){
			System.out.println("O won in diagonal");		
		}
		
		System.out.println("** ends **");
		
	}
	
	static  String checkEquality(String s1, String s2, String s3){
		if(s1.equals("x")){
			if(s1.equals(s2) && s1.equals(s3)){
				return "X won"; 
			}
		}else if(s1.equals("0")){
			if(s1.equals(s2) && s1.equals(s3)){
				return "0 won"; 
			}
		}
			return "";
	}

}
