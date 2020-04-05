import java.util.Stack;

public class CheckBracket {
    public static void check(String string){
        String[] arrString = string.split("");
        Stack<String> lBracket = new Stack<>();
        for(int i=0;i<arrString.length;++i){
            if(arrString[i]=="("){
                lBracket.push(arrString[i]);
            }else{
                if(arrString[i]==")"){
                    if(lBracket.isEmpty()==true){
                        lBracket.push(arrString[i]);

                        break;
                    }else{
                        lBracket.pop();
                    }
                }
            }
        }

       if(lBracket.size()==0){
           System.out.println("Well");
       }else{
           System.out.println("not Well");
       }
    }
}
