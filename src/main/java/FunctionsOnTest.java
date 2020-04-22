public class FunctionsOnTest {
    public static int LessThree(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }

    public static String Abb(String el){
        String abb = "";
        String[] spilt = el.split(" ");
        for (int i = 0; i<spilt.length;i++){
            abb = abb+spilt[i].charAt(0);
        }
        return abb.toUpperCase();
    }
}
