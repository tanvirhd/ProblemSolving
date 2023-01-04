package ProblemNumber14;


public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] example = {"fl","fl","flt"};
        System.out.println(find(example));
    }

    public static String find( String[] strs ){
        StringBuilder res =new  StringBuilder();
        int loop_length = strs[0].length();
        for(String s : strs){
            if (s.length() <= loop_length){
                loop_length = s.length();
            }
        }

        if(loop_length<=0) return  res.toString();
        int loopRunner=0 ,loopCounter= 0;
        char charCheck = strs[0].charAt(0);

        while (true){
            if(loopRunner == (strs.length)) {
                loopRunner=0;
                loopCounter++;
                res.append(charCheck);
                if(loopCounter>loop_length-1) break;
                charCheck =  strs[loopRunner].charAt(loopCounter);
            }

            if(charCheck != strs[loopRunner].charAt(loopCounter)) break;

            loopRunner++;
        }
        return  res.toString();
    }
}




