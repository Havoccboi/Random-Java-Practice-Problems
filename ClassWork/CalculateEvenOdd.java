import java.util.*;

class CalculateEvenOdd{
public static void main (String [] args){
Scanner var = new Scanner(System.in);
System.out.println("Enter the size of the array");
int n = var.nextInt();
 int [] array = new int[n];

for(int i =0;i<n;i++) {

  array[i]=var.nextInt();
}
int even =0;
int odd =  0;

for(int i=0;i<n;i++){
if(array[i]%2==0)
even++;
else odd++;
}


System.out.println("Even numbers = "+even+" Odd numbers = "+odd);

}


}