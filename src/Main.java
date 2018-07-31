public class Main {

    public static void main(String[] args) {
	// write your code here
        Burrows_Wheeler homework=new Burrows_Wheeler();
        homework.calculation();






        /*int current_i=0,i_max=6,k=0;
        String input="banana"+"$";
        String[] recycleMatrix=new String[input.length()];
        String[] temp;
        for(int i=0;i<recycleMatrix.length;i++){
            if(i==0)
                recycleMatrix[i]=input.substring(input.length()-1)
                        +input.substring(0,input.length()-1);
            else
                recycleMatrix[i]=recycleMatrix[i-1].substring(input.length()-1)
                        +recycleMatrix[i-1].substring(0,input.length()-1);
        }
        temp=recycleMatrix;

        for(int i=current_i;i<i_max;i++){
            int temp_pos=i;
            for(int j=i+1;j<=i_max;j++){
                if((int)temp[i].charAt(k)>(int)temp[j].charAt(k))
                    temp_pos=j;
            }
            String temp_string=temp[i];
            temp[i]=temp[temp_pos];
            temp[temp_pos]=temp_string;
        }*/
    }
}
