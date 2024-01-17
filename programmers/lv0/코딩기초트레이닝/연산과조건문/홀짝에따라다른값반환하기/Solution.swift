import Foundation

func solution(_ n:Int) -> Int {
    let isEven = n % 2 == 0
    var answer = 0
    var start = isEven ? 2 : 1
    for i in stride(from: start, through: n, by: 2) {
        answer += isEven ? i * i : i
    }
    return answer
}

print(solution(7))
print(solution(10))
