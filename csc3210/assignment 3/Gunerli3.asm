COMMENT @ 
Student: Hakan 'John' Gunerli
 Class: CSC3210
 Assignment#: 3
 Description: This program is for part 3. 
@
.386 
.model flat, stdcall
.stack 4096
ExitProcess PROTO, dwExitCode:DWORD
.data 
qVal QWORD 0506030704080102h 
.code
main PROC
; initil
mov edi, 00000000
mov ebx, 00000000
mov ecx, 00000000
mov eax, 00000000

mov edi, OFFSET qVal 
mov ax, WORD PTR [edi+6]
mov bx, WORD PTR [edi+4]
mov cx, WORD PTR [edi+2]
mov dx, WORD PTR [edi]

add ax,dx 
add ax,cx 
add ax,bx 

INVOKE ExitProcess,0 
main ENDP
end main