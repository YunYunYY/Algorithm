import re
def solution(myStr):
    answer = re.split("[abc]", myStr)
    answer= [i for i in answer if i]
    return answer if answer else ["EMPTY"]