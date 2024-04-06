package HackerRank;

import java.util.ArrayList;
import java.util.List;;
//
class  DynamicArray{
    public static void main(String[] args) {
        List<List<Integer>> givenQueries = new ArrayList<>();
        List<Integer> query1 = new ArrayList<>(){{add(1);add(0);add(5);}};
        List<Integer> query2 = new ArrayList<>(){{add(1);add(1);add(7);}};
        List<Integer> query3 = new ArrayList<>(){{add(1);add(0);add(3);}};
        List<Integer> query4 = new ArrayList<>(){{add(2);add(1);add(0);}};
        List<Integer> query5 = new ArrayList<>(){{add(2);add(1);add(1);}};
        givenQueries.add(query1);
        givenQueries.add(query2);
        givenQueries.add(query3);
        givenQueries.add(query4);
        givenQueries.add(query5);

        System.out.println(dynamicArray(2, givenQueries));
    }

    public static List<Integer> dynamicArray(
            int n,
            List<List<Integer>> queries)
    {
        List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;

        //first d = row
        //second d = column

        List<List<Integer>> arrs =  new ArrayList<>();
        for(int i =0 ; i<n ; i++) {
            arrs.add(new ArrayList<>());
        }


        for(List<Integer> query : queries){
            Integer qType = query.get(0);
            Integer x = query.get(1);
            Integer y = query.get(2);

            if(qType==1){
                int idx = doQuery1(n,x,lastAnswer);
                arrs.get(idx).add(y);
            }else if (qType == 2){
                int idx = doQuery1(n,x,lastAnswer);
                int idy = y % (arrs.get(idx).size());
                lastAnswer = arrs.get(idx).get(idy);
                result.add(lastAnswer);
            }
        }

        return result;
    }


    public static int doQuery1(int n, int x,int lastAnswer){
        return findXOR(x,lastAnswer) % n;
    }

    public static int findXOR(int x, int y){
        return x ^ y;
    }
}


