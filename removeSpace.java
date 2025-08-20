public class Main {
    public static void main(String[] args) {
        String str = "a b c";
        char c[]= str.toCharArray();
        String s ="";
       for(char res : c){
           if(res!=' '){
             s+=res;
           }
       }    
        System.out.println("Output: " + s);
       
    }
}
