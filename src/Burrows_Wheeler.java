public class Burrows_Wheeler {
    private String input;
    private String[] recycleMatrix;
    private String output;
    private String[] temp;

    public Burrows_Wheeler(){
        input="edgarallanpoethegoldbug"+"$";
        recycleMatrix=new String[input.length()];
        System.out.println("original string: "+input);
        output="";
    }
    public void calculation(){
        recycleMatrix_generation();
        recycleMatrix_sorting(0,recycleMatrix.length-1,0);
        answer_outputting();
    }
    private void recycleMatrix_generation(){
        for(int i=0;i<recycleMatrix.length;i++){
            if(i==0)
                recycleMatrix[i]=input.substring(input.length()-1)
                        +input.substring(0,input.length()-1);
            else
                recycleMatrix[i]=recycleMatrix[i-1].substring(input.length()-1)
                        +recycleMatrix[i-1].substring(0,input.length()-1);
        }
        temp=recycleMatrix;
    }
    private void recycleMatrix_sorting(int current_i,int i_max,int k){
        if(k>=input.length()-1) return;
        System.out.println("sorting start, level: "+k);
        int temp_interval=0;
        for(int i=current_i;i<i_max;i++){
            int temp_pos=i;
            for(int j=i+1;j<=i_max;j++){
                if((int)temp[temp_pos].charAt(k)>(int)temp[j].charAt(k))
                    temp_pos=j;
            }
            String temp_string=temp[i];
            temp[i]=temp[temp_pos];
            temp[temp_pos]=temp_string;
        }
        System.out.println("sorting complete, level: "+k);
        for(int i=current_i;i<i_max;){
            for(int j=i+1;j<=i_max;j++){
                if(temp[i].charAt(k)==temp[j].charAt(k))
                    temp_interval++;
                else if(temp_interval!=0){
                    k++;
                    recycleMatrix_sorting(i,i+temp_interval,k);
                    break;
                }
            }
            i=i+temp_interval+1;
        }
        return;
    }
    private void answer_outputting(){
        for(int i=0;i<recycleMatrix.length;i++)
            output+=recycleMatrix[i].substring(input.length()-1);
        System.out.println(output);
    }
}
