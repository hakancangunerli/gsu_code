COMMENT @ 
Student: Hakan 'John' Gunerli
 Class: CSC3210
 Assignment#: 3
 Description: This program is for part 1. 
@


.386 
.model flat, stdcall
.stack 4096
ExitProcess PROTO, dwExitCode:DWORD
.data 

z DWORD 3 DUP(?) ;  uninitialized, 
x WORD 10 
y WORD 15
r WORD 4 


.code
main PROC
	; add values to registers, 
	movzx eax, x
	mov edi, OFFSET z 
	mov z,130
	add z, eax 
	movzx ebx, y
    movzx edx, r

    
; movements, and adds/subs
	add z+4, eax
	add z+4, ebx
	mov ecx, z

	sub z+4, ecx
	add z+8, eax
	add z+8, edx
	sub z+8,13

	INVOKE ExitProcess,0 ; we should end up with 8c 8d and 01 
main ENDP
end main