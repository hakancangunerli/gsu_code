read -p "type in a text > " input 

if grep -q "$input" myexamfile.txt; then
  echo "it works!" 
  echo "your word "$input" is mentioned this many times:"
  grep -o -i "$input" myexamfile.txt | wc -w
else
  echo "i do not understand, please try again."
fi 
