package problems;

public class StrBuilderClass {
	//Basic StingBuilder operations : 
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Deep Agrahari");
		//initial content
		System.out.println("Initial StringBuilder : " + sb);
		
		//Append a string to the StringBuilder
		sb.append(" NIT Nagpur");
		System.out.println("After append : " + sb);
		
		//Insert a substring at a specific position
		sb.insert(13, " Mtech from");
		System.out.println("After Insert : " + sb);
		
		//Replace a substring with another string
		sb.replace(0, 4, "Deepu");
		System.out.println("After replace : "+ sb);
		
		//Delete a substring from the StringBuilder
		sb.delete(14, sb.length());
		System.out.println("After Delete : "+sb);
		
		//Reverse the content of the StringBuilder
		sb.reverse();
		System.out.println(sb);
		
		//Get the current capacity of the StringBuilder
		int capacity = sb.capacity();
		System.out.println("current capacity : " + capacity);
		
		//Access a character at a specific index
		char char5 = sb.charAt(5);
		System.out.println("char at index 5 : " + char5);
		
		//Set a character at a specific index
		sb.setCharAt(9, ' ');
		System.out.println("Set char at 9th index : " + sb);
		
		//Get a substring from the StringBuilder
		String subString = sb.substring(10, sb.length());
		System.out.println("subString fron index 10 to last : "+ subString);
		
		//Find the index of a specific substring
		sb.reverse();
		int i = sb.indexOf("ee");
		System.out.println("Index of ee : "+ i);
		
		//Delete a character at a specific index
		sb.deleteCharAt(1);
		System.out.println("After delete char at index 1 : " + sb);
		
		//Convert the StringBuilder to a String
		String result = sb.toString();
		System.out.println(result);
				

	}

}
