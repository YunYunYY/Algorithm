# 붕대 감기
def solution(bandage, health, attacks):
    t, x, y = bandage[0], bandage[1], bandage[2]
    bound = health
    prev = attacks[0][0]
    health = health - attacks[0][1]
    if (health <1):
        return -1
    for i in attacks[1:]:
        a=i[0]-prev-1
        prev=i[0]

        health+=a*x
        health+=(a//t)*y
        health=min(health,bound)
        health-=i[1]

        if(health<1):
            return -1
    return health