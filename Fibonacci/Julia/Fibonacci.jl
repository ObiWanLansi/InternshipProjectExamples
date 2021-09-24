
"""
Das ist ein kleines Beispielscript welches die Fibonacci Reihenfolge nicht rekursiv
sondern in einer Schleife berechnet. Die Werte werden nur schnell auf der Console
ausgegeben.
"""

values = zeros(Int64,40,1)

values[1] = 0
values[2] = 1

for counter in 3:1:40
    values[counter] = values[counter-1] + values[counter-2] 
end

println(values)
