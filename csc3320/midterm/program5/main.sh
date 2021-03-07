read -p "give me a number " value
gcc factorial.c -o factorial
gcc bitwise.c -o bitwise

./factorial <<< $value
./bitwise <<< $value


# gcc -o bin bin2decNdec2bin.c -lm