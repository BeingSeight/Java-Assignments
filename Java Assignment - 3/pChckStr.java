//17. Write a program to check whether two String objects contain the same data.
class pChckStr {
    public static void main(String[] args) {
        String str1=new String("Hello");  
        String str2=new String("Hello");  
         
        boolean isEqualData=str1.equals(str2);  
        System.out.println("Strings contain same data: " + isEqualData);  
    }
 }