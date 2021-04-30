.386 
.model flat, stdcall
.stack 4096 

ExitProcess PROTO , dwExitCode:DWORD

.code 

main PROC
mov eax, 12345678h
mov ax, 1122h
mov bl, al
mov bl,ah 
mov al, 89h
add al, 10h 
sub al, al 
mov al, 98h 
add al, 89h 

invoke ExitProcess,0 

main ENDP
END main