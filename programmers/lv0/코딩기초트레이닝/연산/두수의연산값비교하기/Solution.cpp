#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int x = stoi(to_string(a) + to_string(b));
    int y = 2 * a * b;
    if (x == y) {
        return x;
    }
    if (x > y) return x;
    return y;
}