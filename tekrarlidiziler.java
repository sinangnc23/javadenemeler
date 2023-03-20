public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list = {2,4,5,7,9,11,6,8,2,6,5,7,9,11,8,10,12,4,8,12,14,22,24,14};
        int [] temp = new int [list.length];

        int startIndex = 0;

        for(int i=0;i<list.length;i++){
            for(int j =0;j<list.length;j++){
                if((i!=j)&&(list[i] == list[j]) && list[i]%2==0){
                    if(!isFind(temp,list[i])){
                        temp[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }
        for(int k=0;k<temp.length;k++){
            if(temp[k]!=0)
                System.out.println(temp[k]);
        }
}}
