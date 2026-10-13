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
// here we can print last number also
class Lastp{
    public static void main(String[]args){
        for(int i =0;i <=10;i++){
            System.out.println(i);// first it will print the value and checks the comdition..
            if(i ==5){
                System.out.println("ncompleted");
                break;
            }
        }
    }
}