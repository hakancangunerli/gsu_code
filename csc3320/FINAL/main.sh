input="./test.txt"

echo "number of lines in my text file " 
wc -l < $input # word count number of lines 

echo "number of words in my text file"
wc -w < $input # word count word 

echo "number of characters in my text file"
wc -c < $input # this is word count character 