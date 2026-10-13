class Label_loops{
    public static void main(String[] args){
        outer : for(int i = 1;i<=3;i++){
            inner:for(int j =1;j<=4;j++){
                if(j==2){
                    break outer;      //it will break the outer loop..
                }
                System.out.println("i:"+i+"  j:"+j);
            }
        }
    }
}
