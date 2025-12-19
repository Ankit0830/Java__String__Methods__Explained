// Methods of String Class

package stringmethodpra;
public class StringMethodPra 
{

    public static void main(String[] args) 
    {
        String str = new String("String Method");
        
        System.out.println("---------Length & Character Methods----------");
        System.out.println("The Length of String: "+str.length());
        System.out.println("This output is charAt: "+str.charAt(5));
        System.out.println();
        
        System.out.println("---------Substring Methods----------");
        System.out.println("This output is substring: "+str.substring(5));      // It take a value of given number(Index) to end
        System.out.println("This output is substring from 2 to n-1th: "+str.substring(2,5));     // It take a two argument first is begning and secound is which no are print instruction n-1 index
        System.out.println();
        
        System.out.println("---------Modification Methods (Return New String)----------");
        System.out.println("Before: "+str+" After: "+str.toUpperCase());
        System.out.println("Before: "+str+" After: "+str.toLowerCase());
        String str1 = new String ("    Java Is Best Language    ");
        System.out.println("Before string: "+str1+"After using Trim method: "+str1.trim());     // It will remove all space inside string
        System.out.println("After replace: "+str1+"After replace: "+str1.replace('a', 'N'));        // It will replace the char with some another Char
        
        String str2 = "Today i am learning Java Programing";
        System.out.println("The Example is StartWith Method: "+str2.startsWith("T"));
        System.out.println("The Example is StartWith Method: "+str2.startsWith("t"));       // It is Case Sensetive that means it retrun False Because start with Capital T not small t
        System.out.println("The Example is EndWith Method: "+str2.endsWith("g"));
        System.out.println("The Example is EndWith Method: "+str2.endsWith("Java"));
        System.out.println();
        
        System.out.println("---------Searching Methods----------");
        System.out.println("The Example is IndexOf Method: "+str2.indexOf("Java"));
        System.out.println("The Example is IndexOf Method: "+str2.indexOf("java"));
        System.out.println("The Example is IndexOf Method: "+str2.indexOf("a",5));                             // It work Left to Right Scaning of index
        System.out.println("The Example is Last IndexOf Method: "+str2.lastIndexOf("Pro", 30));         // It work Right to Left Scaning of index
        System.out.println();
        
        String str3 = "JAVA";
        String str4 = "java";
        String str5 = "Python";
        String str6 = "java";
        String str7 = new String("java");
        System.out.println("---------Comparison Methods----------");
        System.out.println("The Example of equals Method: "+str3.equals(str4));         // It is Case Senstive that by return False
        System.out.println("The Example of equals Method: "+str3.equals(str5));
        System.out.println("The Example of equals Method: "+str3.equals(str6));
        System.out.println("The Example of equals Method: "+str4.equals(str6));
        System.out.println("The Example of equals Method: "+str4.equals(str5));
        System.out.println("The Example of equals Method: "+str4.equals(str3));
        System.out.println("The Example of equals Method: "+str5.equals(str5));
        System.out.println("The Example of equals IgnorCase Method: "+str3.equalsIgnoreCase(str4));
        System.out.println("The Example of equals IgnorCase Method: "+str3.equalsIgnoreCase(str6));
        System.out.println("The example of CompareTo (==) Method: "+(str6 == str7));
        System.out.println("The example of CompareTo (==) Method: "+(str6 == str4));
        System.out.println("The example of 6 CompareTo 7 Method: "+str6.compareTo(str7));           // It will return integer type & (-1 when first is less then second , 0 when both are equal & 1 when second is grater than first  In a form of dictionery)
        System.out.println("The example of 6 CompareTo 4 Method: "+str6.compareTo(str4));
        System.out.println("The example of 6 CompareTo 3 Method: "+str6.compareTo(str3));
        System.out.println("The example of 3 CompareTo 6 Method: "+str3.compareTo(str6));
        System.out.println("The example of 4 CompareTo 5 Method: "+str4.compareTo(str5));
        System.out.println("The example of 5 CompareTo 4 Method: "+str5.compareTo(str4));
        System.out.println("The example of 6 CompareTo IgnoreCase 7 Method: "+str6.compareToIgnoreCase(str7));
        System.out.println("The example of 6 CompareTo IgnoreCase 4 Method: "+str6.compareToIgnoreCase(str4));
        System.out.println("The example of 6 CompareTo IgnoreCase 3 Method: "+str6.compareToIgnoreCase(str3));
        System.out.println("The example of 3 CompareTo IgnoreCase 6 Method: "+str3.compareToIgnoreCase(str6));
        System.out.println("The example of 4 CompareTo IgnoreCase 5 Method: "+str4.compareToIgnoreCase(str5));
        System.out.println("The example of 5 CompareTo IgnoreCase 4 Method: "+str5.compareToIgnoreCase(str4));
        
        
        
    }
    
}
