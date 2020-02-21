lines = []
header = "|   "

for multiplikator in range(1,11):
    line = "|" + f"{multiplikator}".rjust(3)
    header += "|" + f"{multiplikator}".rjust(3)
    for multiplikand in range(1,11):
        line += "|" + f"{multiplikator * multiplikand}".rjust(3)
    lines.append("|---" + "+---"*10 + "|")
    lines.append(line+ "|")

print ("/" + "-"*43 + "\\")
print (header + "|")
for line in lines:
    print (line)
print("\\" + "-"*43 + "/")