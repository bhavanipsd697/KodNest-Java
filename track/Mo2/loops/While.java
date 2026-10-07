public class While {
    public static void main(String[] args) {
        int i =1;
        while (i <= 100){
            System.out.println(i);
            i++;
        }
    }
}
class Nee{
    public static void main(String[]args){
int a =1;
while(a <=5){

    int b= 1;     //in while initialization will be done only once
    while(b <= 5){ //condition 
        System.out.println(b);
        b++; //update
    }
    System.out.println(); //new line(move to next line )
    a++;
}
    }
}
//one more example while inside for
class whileinsidefor{
    public static void main(String[]args){
        int i =1;
        while(i <=5){
            for(int j =1;j<=5;j++){
                System.out.println(j);
            }
            System.out.println();
            i++;
        }
    }
}