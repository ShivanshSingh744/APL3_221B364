/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class test{
    String name;
    int age;
    
    void setname(){
        name="shivansh";
    }
    void setage(){
        age=20;
    }
    void getname(){
        System.out.println("Your name is "+name);
    }
    void getage(){
        System.out.println("Your age is "+age);
    }
}
public class APL0
{
	public static void main(String[] args) {
	    int x=2;
	    for(int i=1;i<=10;i++){
	        System.out.println(x+"X"+i+"="+i*x);
	    }
	    test ob=new test();
	    ob.setname();
	    ob.setage();
	    ob.getname();
	    ob.getage();
		
	}
}
