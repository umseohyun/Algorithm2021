steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

knight = input()
row = int(knight[1])
column = int(ord(knight[0])) - int(ord('a')) + 1

result = 0

for step in steps:
    Row = row + step[0]
    Col = column + step[1]

    if Row >= 1 and Row <= 8 and Col >= 1 and Col <= 8:
        result += 1

print(result)