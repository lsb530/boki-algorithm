package lv0.코딩기초트레이닝.연산과조건문.공배수;

class Solution {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}