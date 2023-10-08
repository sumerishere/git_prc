class Patternn {
       public static void main(String[] args) {
           
           int n = 6;
           
           for(int i=1;i<=n;i++){        //outer loop
               for (int j=1;j<=i;j++){       //inner loop
                   if ((i+j)%2==0){
                       System.out.print("1"+" ");
                   }else{
                       System.out.print("0"+" ");
                   }
               }
               System.out.println(" ");
           }
        }
      }