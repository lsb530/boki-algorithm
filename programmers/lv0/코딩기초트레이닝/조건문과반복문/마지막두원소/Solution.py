def solution(num_list):
    a, b = num_list[-2:]
    num_list.append(b - a if b > a else b * 2)
    return num_list
