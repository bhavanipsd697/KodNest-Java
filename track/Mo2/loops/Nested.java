class Nested{
    public static void main(String[]args){
        for(int i =1;i<=5;i++){
            for(int j =1;j<=5;j++){
                System.out.println(j);
            }
            System.out.println();

        }
    }
    
}
class Break1{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j =1;j<=2;j++){
                if(j ==2){
                    break;
                }
                System.out.println("i:" +i+"  j:" +j);  
            }
        }
    }
}
