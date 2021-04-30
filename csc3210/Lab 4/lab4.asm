.386
.model flat, stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data 
sum DWORD ?

.code
main proc
    mov al 0F5h
    mov bl 029h 
    mov cl 00Bh 
    mov dl 0D7h
    sub al,dl
    sub cl,bl
    add al,cl 
    invoke ExitProcess,0
main endp
end main
