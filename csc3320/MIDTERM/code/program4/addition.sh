    #!/bin/sh
        BOOK="address-book.txt"

        
        
        read -p "name to add: " name 
        read -p "phone number: " phone 

    
        echo "is this correct?:"
        echo -e "$name ; $phone \n"
        echo -n "y/n: "
        read answer

        if [ "$answer" == "y" ] 
        then
        # add it to the book. 
            echo "$name ; $phone" >>$BOOK
        else
        # if they say no, run this. 
            echo "$name ; $phone NOT written to $BOOK"
        fi

        exit 0