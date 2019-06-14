#!/bin/ruby

def crypt_decrypt( strContent ) 

    newstring = ""
    
    strContent.upcase.bytes { |bASCII|
        
        if bASCII >= 65 && bASCII <= 90 then

                # Get The Alphabetical Index
                bAlphabet = bASCII - 65
            
                # ROT13
                bAlphabet = (bAlphabet + 13) % 26
                
                # Append As ASCII Character To The New String
                newstring += (bAlphabet + 65).chr
        else
            if bASCII == 32 then
            
                newstring += " "
            end
        end
    }
    
    return newstring
end

strExample = "HANS HUSTET IN DER NACHT"
strResult = crypt_decrypt(strExample)
strCheck = crypt_decrypt(strResult)

puts strExample
puts strResult
puts strCheck