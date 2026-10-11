class Break{
    public static void main(String[]args){
        for(int i = 0;i<=10;i++){
            if(i==5){ //it will check the cont and allows 
                System.out.println("5\ncompleated");
                break;
            }
            System.out.println(i); // else it will print the value of i
        }
    }
}
