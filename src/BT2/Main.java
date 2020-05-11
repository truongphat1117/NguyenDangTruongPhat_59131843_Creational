
package BT2;


public class Main {

   
    public static void main(String[] args) {
        MyStringBuilder myString = new MyStringBuilder.Builder()
                .addString("Trường Phát")
                .addFloat((float)0.2)
                .addBool(true)
                .build();
        System.out.println(myString.toString());
    }
    
}
