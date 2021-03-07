#!/bin/sh
BOOK="address-book.txt" 
read -p "find name: " result 
fgrep -w "${result}" $BOOK
