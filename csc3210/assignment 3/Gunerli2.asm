COMMENT @ 
Student: Hakan 'John' Gunerli
 Class: CSC3210
 Assignment#: 3
 Description: This program is for part 2. 
@
.386 
.model flat, stdcall
.stack 4096
ExitProcess PROTO, dwExitCode:DWORD
.data 
inputStr BYTE "A", "B", "C", "D", "E", "F", "G", "H"
.code
main PROC
; initil
mov edi, 00000000
mov ebx, 00000000
mov ecx, 00000000
mov eax, 00000000


mov ebx, OFFSET inputStr ; addreess reference
mov edi, OFFSET inputStr ; addreess reference
add edi,7
mov ecx,4 ; will use loop 

L1: 
	mov al,[edi]
	xchg [ebx], al 
	xchg al,[edi]
	
	dec edi ; decrease 
	inc ebx ; increase,loop  
	LOOP L1
INVOKE ExitProcess,0 
main ENDP
end main