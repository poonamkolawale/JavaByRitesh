
public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Poonam";
		String s2= "Poonam";
		String s3= "Poonam";
		String s4= new String ("QA");
		String s5= new String ("QA");
		//s4= "automation 1";
		s4.concat("automation");
		System.out.println(s4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);// True it will compare the reference not the values and the references pointing to the same object
		System.out.println(s1.equals(s2));//True  it will compare the content 
		System.out.println(s4==s5);//False It compares the references not the values and both objects are in different
		System.out.println(s4.equals(s5));//True content comparison
		System.out.println("...............String buffer...........");
		StringBuilder sb1 = new StringBuilder("Hello");    //String 1  
        StringBuilder sb2 = new StringBuilder(" World");    //String 2  
        StringBuilder sb3 = sb1.append(sb2);   //String 3 to store the result  added comments 
       
        System.out.println(sb3);  

            System.out.println(sb3.toString());  




	}

}

// Why STring is immutable and final in nature:---String objects are immutable. Immutable simply means unmodifiable or unchangeable.

//Once String object is created its data or state can't be changed but a new String object is created.
//As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "test". If one reference variable changes the value of the object, it will be affected by all the reference variables. That is why String objects are immutable in Java

