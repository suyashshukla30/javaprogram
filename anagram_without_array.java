import java.util.Scanner;

public class anagram_without_array {


   static boolean isAnagram(String s,String s2 )
    {
        Scanner sc=new Scanner(System.in);

        
        String st=s.toLowerCase();
        int freq1[]=new int[st.length()];
        int i,j;
        int k=0;
        char stg[] = st.toCharArray();  
        char string[]=new char[st.length()];
        
        for (char c='a';c<='z';c++)
        { 
         
        for(i=0;i<st.length();i++)
        {
            char chr=st.charAt(i);
            if(c==chr)
            {
                string[k]=chr;
                
                k++;
                
            }}}
        for(i=0;i<s.length();i++)
        {
            freq1[i]=1;
            for(j=i+1;j<s.length();j++)
            {
                if(string[i]==string[j])
                {
                    freq1[i]++;
                    
                    
                    string[j]='0';
                }
            }
        }

        
        
         String st2=s2.toLowerCase();
        int freq2[]=new int[st2.length()];
        int m=0;
        char stg2[] = st2.toCharArray();  
        char string2[]=new char[st2.length()];
        
        for (char c='a';c<='z';c++)
        { 
         
        for(i=0;i<st2.length();i++)
        {
            char chr2=st2.charAt(i);
            if(c==chr2)
            {
                string2[m]=chr2;
                
                m++;
                
            }}}
        for(i=0;i<s2.length();i++)
        {
            freq2[i]=1;
            for(j=i+1;j<s2.length();j++)
            {
                if(string2[i]==string2[j])
                {
                    freq2[i]++;
                    
                    
                    string2[j]='0';
                }
            }
        }

     int f=0;
     if(string.length==string2.length)
     {
         for (i=0;i<string.length;i++)
         {
             if(string[i]==string2[i])
                 f++;
         }
         if(f==string.length)
         {
             return true;
         }
         else
         {
             return false;
         }
     }
     else
     {
         return false;
     }
 
    }  


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
