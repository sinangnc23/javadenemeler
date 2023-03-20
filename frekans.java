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
        int count = 0;
        for(int i=0;i<list.length;i++){
            count = 1;
            for(int j =1;j<list.length;j++){
                if((i!=j)&&(list[i] == list[j])){
                    temp[startIndex++]=list[i];
                    count++;
                    
                    
                }
            }if(temp[i]!=0)
                System.out.println(temp[i]+" elemanı "+count+" kere tekrar etti.");
        }
        
}}
