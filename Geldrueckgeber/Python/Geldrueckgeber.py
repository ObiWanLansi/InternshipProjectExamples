#!/bin/python

########################################################################################################################

lBillsAndCoins = [

		[50000, "Fünfhundert Euro"],
		[20000, "Zweihundert Euro"],
		[10000, "Hundert Euro"],

		[5000, "Fünfzig Euro"],
		[2000, "Zwanzig Euro"],
		[1000, "Zehn Euro"],

		[500, "Fünf Euro"],
		[200, "Zwei Euro"],
		[100, "Ein Euro"],

		[50, "Fünfzig Cent"],
		[20, "Zwanzig Cent"],
		[10, "Zehn Cent"],

		[5, "Fünf Cent"],
		[2, "Zwei Cent"],
		[1, "Ein Cent"]
]

########################################################################################################################

def getBillsAndCoinsCount(amount):
    
    print ("\nBetrag: {0} €".format(amount))
    
    amount = amount * 100
    
    for item in lBillsAndCoins:
        
        count = int( amount / item[0] )
        
        if( count > 0 ):
            print ("{0:20}: {1}".format(item[1],count))
            amount = amount - ( count * item[0] )
        

########################################################################################################################

getBillsAndCoinsCount(123.45)
getBillsAndCoinsCount(543.21)
getBillsAndCoinsCount(8888.88)
getBillsAndCoinsCount(3333.33)
