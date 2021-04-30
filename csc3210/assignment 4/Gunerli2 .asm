; Hakan Gunerli 
; CSC3210
; ASSIGNMENT 4 
; THIS PROGRAM ATTEMPS TO ANSWER QUESTION 2 WHICH IS TO TEST THE MOST SIG BIT IN REGISTER AL 

.386
.model flat, stdcall
.stack 4096
ExitProcess proto, dwExitCode:dword
.data
.code
main PROC
mov eax, 00000000
mov ebx, 00000000
mov ecx, 00000000
mov edx, 00000000

mov al, 88h ; SIGNED 88 
mov bl, 10000000b ; MASK 
test al, bl
jnz L1 ; TEST AND JUMP 
shl al, 2
L1: 
	shr al, 3 
invoke ExitProcess,0
main endp
end main