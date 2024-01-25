import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list) {
        int a = num_list[num_list.length - 1]; // n
        int b = num_list[num_list.length - 2]; // n - 1
        int last = a > b ? a - b : a * 2;

        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = last;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5})));
    }

}

