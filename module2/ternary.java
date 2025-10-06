public class ternary {
    public static void main(String[] args) {
        int a=10, b=20;
        int max=(a>b)?a:b;
        System.out.println("max is:"+max); 
     
        
        int marks=72;
        String grade=(marks>=90)?"A":(marks>=75)?"B":(marks>=50)?"C":"Fail";
        System.out.println("Grade: "+grade);

        for(int i=0;i<=10;i++){
            if(i==5){
                break;
                
            }
            System.out.println(i);
        }
        System.out.println("im hungryyyy");
    }
}
//comment added