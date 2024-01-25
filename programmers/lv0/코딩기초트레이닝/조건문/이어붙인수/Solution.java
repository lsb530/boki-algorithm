import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        return Integer.parseInt(IntStream.of(num_list).filter(n -> n % 2 == 0).mapToObj(Integer::toString).collect(Collectors.joining()))
                + Integer.parseInt(IntStream.of(num_list).filter(n -> n % 2 == 1).mapToObj(Integer::toString).collect(Collectors.joining()));
    }
}