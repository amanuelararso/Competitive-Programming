import java.util.*;
class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<>();
        for (Integer integer : grades) {
            if(integer < 38)
                list.add(integer);
            else {
                int int1=integer +1; int int2 = integer +2;
                if(int1 %5 == 0)
                    list.add(int1);
                else if(int2 %5 == 0)
                    list.add(int2);
                else
                    list.add(integer);
            
            }
        }
        return list;

    }

}
