; Hakan Can Gunerli Lab 12 

.386
.model flat, stdcall
.stack 4096
ExitProcess proto, dwExitCode:dword

.data
array1 BYTE 13h, 14h, 15h, 16h
array2 BYTE 12h, 13h, 14h, 15h
maxlength BYTE ($-array2)/(TYPE array2) ; this won't matter bc it's the same length for both. 
sample1 BYTE 30h
sample2 BYTE 5h
index BYTE 0
exp1 WORD 0 ; init empty. 

.code
main PROC
movzx eax, index ; it's too big for size i know, but i'll have to move it. 
mov ebx, 0
mov ecx, 0
mov edx, OFFSET array2 
mov esi, OFFSET array1

beginwhile:
	cmp cl, maxlength
	jge L1
	mov al, [esi]
	
	cmp al, [edx]
	je L2
	jle L2

	mul sample1
	mov bx, ax
	mov eax, 0
	
	mov al, [edx]
	imul sample2
	xchg ax, bx ; exchange values 

	cmp bl, 0
	je L2
	div bl

	inc esi ; increment values here.
	inc edx ; increment values here.
	inc ecx ; increment values here.

	jmp beginwhile ; jump back to while loop 
L1:
	movzx cx, al
	mov exp1, cx
	invoke ExitProcess,0
L2:
	mov eax, 0
	inc esi
	inc edx
	inc edx
	jmp beginwhile
main endp
end main