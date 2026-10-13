class Continue{
    public static void main(String[]args){
        for(int i =0;i<=10;i++){
            if(i==7){
                System.out.println("skip");
                continue;
            }
            System.out.println(i);
        }
    }
}
class Amre{
    public static void main(String[]args){
        for(int i =1;i<=10;i++){
            System.out .println(i);
             if(i == 6){//here it will 6 also bcz it will print the value after the it will check the value..
                continue;
            }
        }
    }
}
