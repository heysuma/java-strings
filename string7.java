import java.util.*;
public class string7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        // System.out.println(sb.reverse());
        s.toLowerCase();
        char ar[] = s.toCharArray();
        int count = 0;
        int m = s.compareTo(String.valueOf(sb.reverse()));
        if( m == 0 ){
            for( int i = 0; i < ar.length; i++ ){
                for( int j = i + 1; j < ar.length; j++){
                    if(ar[i] == ar[j]){
                        ar[j] = '0';
                    }
                }
            }
            // System.out.println(ar);
            for( int i = 0; i < ar.length; i++ ){
                if(ar[i] == 'a' || ar[i] == 'e' || ar[i] == 'i' || ar[i] == 'o' || ar[i] == 'u'){
                    count++;
                }
            }
            if(count >= 2)
            System.out.println("true");
            else
            System.out.println("false");
        }
        else{
            System.out.println("false");
        }

        // System.out.println(s + "  " + String.valueOf(sb.reverse()));
        // // System.out.println( );
        
        // for( int i = 0; i < ar.length; i++ ){
        //     for( int j = i + 1; j < ar.length; j++){
        //         if(ar[i] == ar[j]){
        //             ar[j] = '0';
        //         }
        //     }
        // }
        // String l = String.valueOf(ar);
        
        // System.out.println(l + "    " + s );
    }
}