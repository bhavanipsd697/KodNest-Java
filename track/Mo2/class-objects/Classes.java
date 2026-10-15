class Classes{
        void firstname(){
            System.out.println("hello");
        }
        void lastname() {
            System.out.println("Bhavani");
        }
    }
//another class to import this static method
class Class2{
    public static void main(String[] args) {
        Classes a = new Classes();
        a.firstname();
        a.lastname();   
    }
}