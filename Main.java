/*
 * Example for Arrays
 */

import java.util.Scanner;

class Main
{
    /*
     * This one will have public static void main
     */
    
    public static void main( String[] args)
    {
     
     
        
        /*
         * SET UP
         * We are going to ask the user to input an integer 
         * and we will call it
                              n
         */
        Scanner s = new Scanner(System.in);
        System.out.print(" Please type in an integer :");
        int n = s.nextInt();
        
        /*
         * Task 1.  Create an array of integers from 0 to n-1
         *          call this array ar1.  Print it out below.
         */
        System.out.println("*** PRINTING ar1 *");
        int[] ar1 = new int[n];
        for(int i = 0; i<n; i++)
            ar1[i] = i;
                
        /*
         * Task 2.  Create a new array called ar2.
         *          Copy the elements of ar1 into ar2.
         */
        System.out.println("* * task 2 * *");
        int[] ar2 = ar1.clone();
        for(int i = 0; i<ar2.length; i++)
            System.out.println(ar2[i]);
        
        /* 
         * Task 3. Add 1 to each element in ar1.  Print it out below
         */
        System.out.println("* * task 3 * *");
        for(int i = 0; i<n; i++)
            ar1[i] = ar1[i] + 1;
        for(int i = 0; i<ar1.length; i++)
            System.out.println("ar1[" + i+ "] = " + ar1[i]);
        

        
        
        /*
         * task 4. Create a new array called ar3.
         *         Copy the elements of ar1 into ar3.  Then do it again
         *         For example
         *         ar1: 1 2 3
         *         ar3: 1 2 3 0 1 2 3
         */
        System.out.println("* * task 4 * *");
        int[] ar3 = new int[n + ar1.length + 1];
        for(int i = 0; i<ar1.length;i++)
            ar3[i] = ar1[i];
        for(int i = 0; i<ar1.length-1;i++)
            ar3[i+ar1.length] = ar1[i];
        for(int i = 0; i< ar3.length;i++)
            System.out.println(ar3[i]);
       
        
        /*
         * Task 5.  Switch the first and last element of ar1.
         *          print out the new ar1.  Then switch them back
         */
        System.out.println("* * Task 5 * *");
        // Ye olde switcheroo
        int value;
        value=ar1[0];
        ar1[0]=ar1[ar1.length-1];
        ar1[ar1.length-1]=value;
        
        for (int i=0 ; i<ar1.length ; i++)
            System.out.println("ar1[" + i + "] = "+ar1[i]);
        
        // The Restoration of the rightful heir
        value=ar1[0];
        ar1[0]=ar1[ar1.length-1];
        ar1[ar1.length-1]=value;
        /*
         * Task 6A. Print the 2nd to (n-1)th elements of ar1
         * 
         * Task 6B: Print out just the odd numbers in ar1
         * Task 6C: Print out the elements of ar1 when
         *          the indices are multiples of 3
         *         
         */
        System.out.println("* * task 6a * *");
        for(int i = 1; i<ar1.length-1;i++)
            System.out.println(ar1[i]);
        System.out.println("* * task 6b * *");
        for(int i = 0; i<ar1.length;i+=2)
            System.out.println(ar1[i]);
        System.out.println("* * task 6c * *");
        for(int i = 0; i<ar1.length;i++)
        {
            if(ar1[i]%3 == 0)
                System.out.println(ar1[i]);
        }
        
        /*
         * Task 7.  For each element in ar1, 
         *          If the element is even: leave alone
         *          if the element is odd, multiply by 10
         *          print out the new ar1
         *          Example
         *          ar[0]=10
         *          ar[1]=2
         *          ar[2]=30
         *          ar[3]=4
         */
        System.out.println("* * task 7 * *");
        for(int i =0; i<ar1.length;i++)
        {
            if(ar1[i]%2 == 0)
                System.out.println(ar1[i]);
            else{
                ar1[i] *= 10;
                System.out.println(ar1[i]);
            }
            }
         /*
          * Task 8
          *    Create an array called ar2odds
          *    If the index of ar2 is odd, copy it to ar2odds.
          *    If not, do not
          *    ar2[0]=0
          *    ar2[1]=1  ->  ar2odds[0]=1
          *    ar2[2]=2
          *    ar2[3]=3  ->  ar2odds[1]=3
          */
        System.out.println("* * task 8 * *");
        int[] ar2odds = new int[n];
        int k =0;
        for(int i = 0; i< ar2odds.length;i++)
        {
            if(ar2[i] % 2 == 1){
                ar2odds[k] = ar2[i];
                k++;
            }
        }
        for(int i = 0; i<k;i++)
            System.out.println(ar2odds[i]);
        /*
         * Task 9. In the array ar2, count how many odd numbers you
         * have.  Then create an ew array called ar4.  Copy just the odd
         * numbers from ar1 into ar4.  Print ar4
         */
        System.out.println("* * task 9 * *");
        int count = 0;
        for(int i =0; i<ar2.length;i++)
            if(ar2[i]%2 ==1)
                count++;
        int[] ar4 = new int[count];
        k=0;
        for (int i=0 ; i<ar2.length ; i++)
        {
             if (ar2[i]%2==1)
             {
                 ar4[k]=ar2[i];
                 k++;
             }
         }
        for (int i=0 ; i<k ; i++)
             System.out.println(ar4[i]);
        
        /*
         * Task 10.  Shift the elements of ar4 right by 1
         * For example
         * old   ar4: 1 3 5 7 9
         * new   ar4  9 1 3 5 7
         */
        System.out.println("* * task 10 * *");
        for(int i = 1; i<ar4.length-2; i++)
            ar4[i] = ar4[i+1];
        int temp = ar4[0];
        ar4[0] = ar4[ar4.length-1];
        ar4[ar4.length-1] = temp;
        for(int i = 0; i<ar4.length; i++)
            System.out.println(ar4[i]);
        
        /*
         * Task 11.  Reverse the order of elements in ar2
         */
        System.out.println("* * task 11 * *");
        for(int i = 0; i<ar2.length/2;i++)
        {
            temp = ar2[i];
            ar2[i] = ar2[ar2.length-1-i];
            ar2[ar2.length-1-i] = temp;
        }
        for(int i=0 ; i<ar2.length; i++)
            System.out.println(ar2[i]);
        
        /*
         * Task 12: 
         * Create an array of Strings called ar5.
         * 
         * Each element is a word of the following phrase
         * 
         * 
         * Four score and seven years ago our fathers brought forth on
         * this continent a new nation
         *
         *. ar5[0] = "Four"
         *  ar5[1] = "score"
         *  
         *  Create another array of ints called ar6.  Write a for loop that
         *  will iterate through each element in ar5 and the length of the
         *  word is the element in ar6.
         *  
         *  ar5[0]= "Four"   ar6[0]=4
         *  ar5[1]="score"   ar6[1]=5
         *  ar5[2]="and"     ar6[2]=3
         *  
         *  Count how many words have more than 5 letters.
         */
        System.out.println("* * task 12 * *");
        String[] ar5 = new String[16];
        ar5[0]="Four";
        ar5[1]="score";
        ar5[2]="and";
        ar5[3]="seven";
        ar5[4]="years";
        ar5[5]="ago";
        ar5[6]="our";
        ar5[7]="fathers";
        ar5[8]="brought";
        ar5[9]="forth";
        ar5[10]="on";
        ar5[11]="this";
        ar5[12]="continent";
        ar5[13]="a";
        ar5[14]="new";
        ar5[15]="nation";
        count = 0;
        k = 0;
        for(int i =0; i<ar5.length;i++)
            if(ar5[i].length() > 5)
                count++;
        String[] ar5List = new String[count];
        for(int i= 0; i< ar5.length;i++)
            if(ar5[i].length() > 5){
                ar5List[k] = ar5[i];
                k++;
            }
        for(int i= 0; i<ar5List.length ;i++)
            System.out.println(ar5List[i]);
        
        
        /*
         * Task 13
         * Create an array called monsterArray of 5 Monsters.
         * The name of the monsters are
         * "Cookie"
         * "Grover"
         * "Oscar the Grouch"
         * "Elmo"
         * "Rosita"
         * 
         * Print out their names
         * Use a for loop to print out the names of monsters that start with
         * a vowel
         */
        System.out.println("* * task 13 * *");
        String[] monsterArray = new String[5];
        monsterArray[0] = "Cookie";
        monsterArray[1] = "Grover";
        monsterArray[2] = "Oscar the Grouch";
        monsterArray[3] = "Elmo";
        monsterArray[4] = "Rosita";
        for(int i = 0; i<monsterArray.length;i++)
            if(monsterArray[i].charAt(0) == 'A' || monsterArray[i].charAt(0) == 'E' || monsterArray[i].charAt(0) == 'I'|| monsterArray[i].charAt(0) == 'O' || monsterArray[i].charAt(0) == 'U')
                System.out.println(monsterArray[i]); 
         /*
          * Task 14
          * Create an array of integers from 3 to 94 and call it arx
          * Create an array of the indices of arx when the item is
          * divisible by 3.  Call this arindex
          *      arx[0]=94
          *      arx[1]=95
          *      arx[2]=96 // this is divisible.  Index is 2
          *      arx[3]=97
          *      arx[4]=98
          *      arx[5]=99 // this is divisible  Index is 5
          *      
          *      So arindex[0]=2
          *         arindex[1]=5
          */
        System.out.println("* * task 14 * *");
        int[] arx = new int[94-3+1];
        int indexCount = 0;
        for(int i =0; i<arx.length;i++){
            arx[i] = 3+i;
            if(arx[i]%3 == 0){
                indexCount++;
            }
        }
        int[] arindex = new int[indexCount];
        int j = 0;
        for(int i= 0; i<arindex.length;i++){
            if(arx[i]%3 == 0){
                arindex[j] = arx[i];
                j++;
            }
        }
        for(int i =0; i<indexCount;i++)
            System.out.println(arindex[i]);
         /*
          * Create an arrary called "fb" and calculate the
          * first 10 fibonacci sequence.  You start with
          * fb[0]=1
          * fb[1]=1
          * fb[2]=fb[0]+fb[1]
          * fb[3]=fb[1]+fb[2]
          * fb[4]=fb[2]+fb[3]
          */
        System.out.println("* * task 15 * *");
        int[] fb = new int[10];
        fb[0] = 1;
        fb[1] = 1;
        for(int i = 2; i< fb.length; i++)
            fb[i] = fb[i-1] + fb[i-2];
        for(int i= 0; i< fb.length; i++)
            System.out.println(fb[i]);
    }
}