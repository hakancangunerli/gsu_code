i=1 
while (($i <=10 ))
do 
if (($i == 5))
then 
break 
fi 
echo $i 
((++i))
done 