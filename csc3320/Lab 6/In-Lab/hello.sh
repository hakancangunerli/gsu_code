echo "Welcome to the computer science society"
# Hakan Gunerli (John Gunerli) hgunerli1@student.gsu.edu
echo "today's date is" $(date)
echo "number of directories at home is:"
echo  /home/* | wc -w
echo "path is:" $PATH
echo "user is:" $USER
echo "shell is:" $SHELL
echo "printing disk usage:"
echo $(df)
echo "can you please loan me \$ 25.00?"
echo " if x=2, x*x=4, x/2 =1"
echo ".sh files with c in the beginning:"
echo `ls *.sh | grep 'c'`
echo 'goodbye'
echo "current hour is= `date +" %H"`"