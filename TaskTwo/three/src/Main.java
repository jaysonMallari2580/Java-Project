public class Main {

    public static void main(String[] args) {
        int a=10,b=20,c=30;
        float ave = (a+b+c)/3;

        System.out.println("Ave = "+ave);

        if(ave>a && ave>b &&ave>c){
            System.out.println("Average is higher than a,b,c");
        }else if(ave>a && ave>b){
            System.out.println("avg is higher than a,b");
        }else if(ave>a && ave>c){
            System.out.println("avg is higher than a,c");
        }else if(ave>b && ave>c){
            System.out.println("avg is higher than b,c");
        }else if(ave>a){
            System.out.println("avg is just higher than a");
        }else if(ave>b){
            System.out.println("avg is just higher than b");
        }else if(ave>c){
            System.out.println("avg is just higher than c");
        }
    }
}
