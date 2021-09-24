import matplotlib.pyplot as plt


'''
Das ist ein kleines Beispielscript welches die Fibonacci Reihenfolge rekursiv
berechnet und die Beziehung der Divison von Vorgänger und Nachfolger darstellt.
Der Quotientenwert nähert sich immer mehr dem goldenen Schhnitt (https://de.wikipedia.org/wiki/Goldener_Schnitt)
und wird zusätzlich noch zur Veranschaulichung geplottet.
'''

#-----------------------------------------------------------------------------------------------------------------------

def recur_fibo(n):
   if n <= 1:
       return n
   else:
       return(recur_fibo(n-1) + recur_fibo(n-2))

#-----------------------------------------------------------------------------------------------------------------------

num_list  = []
fib_list  = []
fact_list = []

for i in range(20):
    num_list.append(i)
    fib_list.append(recur_fibo(i))

print (num_list)
print (fib_list)

for counter in range(3,len(fib_list)):
    zaehler = fib_list[counter]
    nenner = fib_list[counter-1]
    result = zaehler/nenner
    fact_list.append(result)
    print(f"{zaehler}:{nenner}={result}")

#-----------------------------------------------------------------------------------------------------------------------

num_list = range(len(fact_list))

plt.plot(num_list, fact_list)
plt.grid()
plt.xlabel("Iteration")
plt.ylabel("Quotientenwert")
plt.tight_layout()
plt.show()