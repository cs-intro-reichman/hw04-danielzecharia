public class ArrayOps {
public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
    boolean foundMissing =false;
    int miss=0;
    int counter=0;
    while(foundMissing == false)
    {
        for( int i=0; i<array.length; i++)
    {
        if( array[i]==counter)
            foundMissing= true;
    }
    if(foundMissing == true)
    {
        foundMissing= false;
        counter++;
    }
    else
    {
        miss=counter;
        foundMissing= true;
    }
}

        return miss;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max=0;
   int max2=0;
   int count=1;
   int secondMax=0;
   boolean found=false;
   for (int i=0; i<array.length-1; i++)
    {
        max= Math.max (array[i], array[i+1]);
    }
  
    for (int i=0; i<array.length; i++)
    {
        if (max == array[i])
            count++;
    }
    if(count>1)
        System.out.println(max);
    else{

        max2= max-1;
    }
    while (max2> secondMax)
    {
        for (int i=0; i<array.length; i++){
            if(array[i]==max2)
                secondMax=max2;

        }
        max2--;
    }

        return secondMax;
}
}


    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean found1=false;
   boolean found2=false;
   boolean stop=false;
   int i=0;
   while (stop==false && i<array1.length)
   {
    found1=false;
    found2=false;
    for (int j=0; j<array2.length;j++)
    {
        if(array1[i]==array2[j])
            found1=true;

    }

    for(int x=0; x<array1.length; x++)
    {
        if(array1[i]==array2[x])
            found2=true;
    }
      i++;
    if (found1==false||found2==false) stop=true;
   }
   if(stop== true) System.out.println ("false");
   else System.out.println ("true");
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean isSortedup=true;
   boolean isSorteddown=true;
   int i=0;
   if(array[0]<=array[1])
   {
    while (isSortedup==true && i<array.length-1)
   {
    if(array[i]>array[i+1]) isSortedup=false;
    i++;

   }
   }
   i=0;
   if(array[0]>=array[1]){
    while (isSorteddown==true&& i<array.length-1)
   {
    if(array[i]<array[i+1]) isSorteddown=false;
    i++;
   }
}
   
     if(isSorteddown==false||isSortedup==false)
      return false;
else return false;
    }

    

