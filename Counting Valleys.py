n =int(input())
steps =input()
levels=0
valleys =0
for s in steps:
    if s == 'U':
        levels += 1
        if levels == 0:
            valleys += 1
    else:
        levels -= 1
print(valleys)
