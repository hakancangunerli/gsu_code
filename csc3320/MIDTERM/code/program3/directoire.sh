read -p "how many days since passed? > " dayamount 
read -p "name of output zipfile > " output 
#find for all extensions, put them in, and feed that to the pipe, zip it and take it into the filename using -@
find ~ -iname "*" -atime +$dayamount -type f|zip $output -@
# i did with txt to show, you can change it to anything really. 

#bear in mind that, once this is zipped, it is zipped. 